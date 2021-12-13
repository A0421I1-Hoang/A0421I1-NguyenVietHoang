package model.service.impl;

import model.bean.Employee;
import model.repository.impl.EmployeeRepositoryImpl;
import model.service.EmployeeService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRepositoryImpl employeeRepository=new EmployeeRepositoryImpl();
    final String E_REGEX ="^[a-z]{3,20}@[a-z]{3,5}\\.[a-z]{3,5}$";
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public boolean save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Map<String, String> save2(Employee employee) {
        Map<String,String>map=new HashMap<>();
        boolean check=true;
        if ("".equals(employee.getEmail())){
            check=false;
            map.put("emailMss","Email ko dc để trống");
        }else if (!validateEmail(employee.getEmail())){
            check =false;
            map.put("emailMss","Email sai định dạng");
        }

        if (check){
            employeeRepository.save(employee);
        }
        return map;
    }

    private boolean validateEmail(String email) {
        return email.matches(E_REGEX);
    }

    @Override
    public boolean delete(int id) {
        return employeeRepository.delete(id);
    }

    @Override
    public boolean update(int id, Employee employee) {
        return employeeRepository.update(id, employee);
    }
}