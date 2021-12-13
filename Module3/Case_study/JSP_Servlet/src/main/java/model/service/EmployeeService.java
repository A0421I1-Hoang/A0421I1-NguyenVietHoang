package model.service;

import model.bean.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(int id);
    boolean save(Employee employee);
    Map<String,String> save2(Employee employee);
    boolean delete(int id);
    boolean update(int id, Employee employee);
}
