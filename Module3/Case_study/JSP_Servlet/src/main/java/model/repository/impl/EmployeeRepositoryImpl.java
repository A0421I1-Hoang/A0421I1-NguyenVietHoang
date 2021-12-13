package model.repository.impl;

import model.bean.Employee;
import model.repository.EmployeeRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static List<Employee> employeeList = new ArrayList<>();
    private BaseRepository baseRepository = new BaseRepository();
    private final String SELECT_ALL = "SELECT * FROM employee;";
    private final String SELECT_BY_ID = "SELECT * FROM employee WHERE id =?;";
    private final String DELETE_BY_ID = "DELETE FROM employee WHERE id =?;";
    final String INSERT_INTO_EMPLOYEE = "INSERT INTO employee(`name`, age, `phoneNumber`, `CMND`, `email`, `sex`, `level` , `position` , salary)" +
            "values(?,?,?,?,?,?,?,?,?);";
    private final String UPDATE_ACCOUNT = "UPDATE employee set `account`=? where email =?;";
    final String UPDATE_EMPLOYEE = "call edit_student_by_id(?,?,?,?,?,?,?,?);";

    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();

            // dùng statement
//            Statement statement = connection.createStatement();
//            ResultSet resultSet =statement.executeQuery(SELECT_ALL);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String phoneNumber = resultSet.getString("phoneNumber");
                String CMND = resultSet.getString("CMND");
                boolean sex = resultSet.getBoolean("sex");
                String level = resultSet.getString("level");
                String email = resultSet.getString("email");
                String position = resultSet.getString("position");
                double salary = resultSet.getDouble("salary");
                Employee employee = new Employee(id, name, age, phoneNumber, CMND, email, sex, level, position, salary);
                employeeList.add(employee);
            }

            preparedStatement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public Employee findById(int id) {
        Employee employee = null;
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id1 = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String phoneNumber = resultSet.getString("phoneNumber");
                String CMND = resultSet.getString("CMND");
                boolean sex = resultSet.getBoolean("sex");
                String level = resultSet.getString("level");
                String email = resultSet.getString("email");
                String position = resultSet.getString("position");
                double salary = resultSet.getDouble("salary");
                employee = new Employee(id, name, age, phoneNumber, CMND, email, sex, level, position, salary);
            }

            preparedStatement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employee;
    }

    @Override
    public boolean save(Employee employee) {
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        boolean check = false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_EMPLOYEE);
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setInt(2, employee.getAge());
            preparedStatement.setString(3, employee.getPhoneNumber());
            preparedStatement.setString(4, employee.getCMND());
            preparedStatement.setString(5, employee.getEmail());
            preparedStatement.setBoolean(6, employee.getSex());
            preparedStatement.setString(7, employee.getLevel());
            preparedStatement.setString(8, employee.getPosition());
            preparedStatement.setDouble(9, employee.getSalary());
            check = preparedStatement.executeUpdate() > 0;
            preparedStatement.close();
            // set lại account
            PreparedStatement preparedStatement1 = connection.prepareStatement(UPDATE_ACCOUNT);
            preparedStatement1.setString(1, employee.getEmail());
            preparedStatement1.setString(2, employee.getEmail());
            int check1= preparedStatement1.executeUpdate();
            preparedStatement1.close();

            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }

    @Override
    public boolean delete(int id) {
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        boolean check = false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BY_ID);
            preparedStatement.setInt(1, id);
            check = preparedStatement.executeUpdate() > 0;
            preparedStatement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }

    @Override
    public boolean update(int id, Employee employee) {
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        boolean check = false;
        try {
            CallableStatement callableStatement = connection.prepareCall(UPDATE_EMPLOYEE);

            callableStatement.setInt(1, id);
            callableStatement.setString(2, employee.getName());
            callableStatement.setInt(3, employee.getAge());
            callableStatement.setString(4, employee.getPhoneNumber());
            callableStatement.setString(5, employee.getCMND());
            callableStatement.setString(6, employee.getEmail());
            callableStatement.setBoolean(7, employee.getSex());
            callableStatement.setString(8, employee.getLevel());
            callableStatement.setString(9, employee.getPosition());
            callableStatement.setDouble(10, employee.getSalary());
            check = callableStatement.executeUpdate() > 0;
            callableStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }
}
