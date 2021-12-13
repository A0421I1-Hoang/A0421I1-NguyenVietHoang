package model.repository.impl;

import model.bean.Customer;
import model.repository.CustomerRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {

    private static List<Customer> customerList = new ArrayList<>();
    private BaseRepository baseRepository = new BaseRepository();
    private final String SELECT_ALL = "SELECT * FROM khach_hang;";
    private final String SELECT_BY_ID = "SELECT * FROM khach_hang WHERE id =?;";
    private final String DELETE_BY_ID = "DELETE FROM khach_hang WHERE id =?;";
    final String INSERT_INTO_CUSTOMER = "insert into khach_hang (ID_loai_khach,Ho_va_ten,Tuoi,CMND,SDT,Email,Gioi_tinh,Dia_chi)" +
            "values(?,?,?,?,?,?,?,?);";
    private final String UPDATE_ACCOUNT = "UPDATE khach_hang set `account`=? where email =?;";
    final String UPDATE_CUSTOMER = "call edit_customer_by_id(?,?,?,?,?,?,?,?);";

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID_khach_hang");
                int idLoaiKhach = resultSet.getInt("ID_khach_hang");
                String name = resultSet.getString("Ho_va_ten");
                int age = resultSet.getInt("Tuoi");
                String phoneNumber = resultSet.getString("SDT");
                String CMND = resultSet.getString("CMND");
                boolean sex = resultSet.getBoolean("Gioi_tinh");
                String email = resultSet.getString("Email");
                String address = resultSet.getString("Dia_chi");
                Customer customer = new Customer(id, idLoaiKhach, name, age, phoneNumber, CMND, email, sex, address);
                customerList.add(customer);
            }

            preparedStatement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }

    @Override
    public Customer findById(int id) {
        Customer customer = null;
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id1 = resultSet.getInt("id");
                int idLoaiKhach = resultSet.getInt("ID_khach_hang");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String CMND = resultSet.getString("CMND");
                String phoneNumber = resultSet.getString("phoneNumber");
                boolean sex = resultSet.getBoolean("sex");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                customer = new Customer(id1, idLoaiKhach, name, age, phoneNumber, CMND, email, sex, address);
            }

            preparedStatement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customer;
    }

    @Override
    public boolean save(Customer customer) {
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        boolean check = false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_CUSTOMER);
            preparedStatement.setInt(1, customer.getIdLoaiKhach());
            preparedStatement.setString(2, customer.getName());
            preparedStatement.setInt(3, customer.getAge());
            preparedStatement.setString(4, customer.getCMND());
            preparedStatement.setString(5, customer.getPhoneNumber());
            preparedStatement.setString(6, customer.getEmail());
            preparedStatement.setBoolean(7, customer.getSex());
            preparedStatement.setString(8, customer.getAddress());

            check = preparedStatement.executeUpdate() > 0;
            preparedStatement.close();
            // set lại account
//            PreparedStatement preparedStatement1 = connection.prepareStatement(UPDATE_ACCOUNT);
//            preparedStatement1.setString(1, customer.getEmail());
//            preparedStatement1.setString(2, customer.getEmail());
//            int check1= preparedStatement1.executeUpdate();
//            preparedStatement1.close();

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
    public boolean update(int id, Customer customer) {
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        boolean check = false;
        try {
            CallableStatement callableStatement = connection.prepareCall(UPDATE_CUSTOMER);

            callableStatement.setInt(1, id);
            callableStatement.setInt(2, customer.getIdLoaiKhach());
            callableStatement.setString(3, customer.getName());
            callableStatement.setInt(4, customer.getAge());
            callableStatement.setString(5, customer.getCMND());
            callableStatement.setString(6, customer.getPhoneNumber());
            callableStatement.setString(7, customer.getEmail());
            callableStatement.setBoolean(8, customer.getSex());
            callableStatement.setString(9, customer.getAddress());
            check = callableStatement.executeUpdate() > 0;
            callableStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }
}
