package model.repository;

import model.bean.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> findAll();
    Employee findById(int id);
    boolean save(Employee employee);
    boolean delete(int id);
    boolean update(int id, Employee employee);
}
