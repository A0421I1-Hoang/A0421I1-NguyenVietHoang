package model.service.impl;

import model.bean.Customer;
import model.repository.impl.CustomerRepositoryImpl;
import model.service.CustomerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepositoryImpl customerRepository=new CustomerRepositoryImpl();
    final String E_REGEX ="^[a-zA-Z0-9]{3,20}@[a-z]{3,5}\\.[a-z]{3,5}$";
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public boolean save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Map<String, String> save1(Customer customer) {
        Map<String,String>map=new HashMap<>();
        boolean check=true;
        if ("".equals(customer.getEmail())){
            check=false;
            map.put("emailMss","Email ko dc để trống");
        }else if (!validateEmail(customer.getEmail())){
            check =false;
            map.put("emailMss","Email sai định dạng");
        }

        if (check){
            customerRepository.save(customer);
        }
        return map;
    }

    private boolean validateEmail(String email) {
        return email.matches(E_REGEX);
    }

    @Override
    public boolean delete(int id) {
        return customerRepository.delete(id);
    }

    @Override
    public boolean update(int id, Customer customer) {
        return customerRepository.update(id, customer);
    }
}
