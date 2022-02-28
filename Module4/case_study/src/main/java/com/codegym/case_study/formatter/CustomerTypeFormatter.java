package com.codegym.case_study.formatter;

import com.codegym.case_study.model.CustomerType;
import com.codegym.case_study.service.ICustomerTypeService;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;
import java.util.Optional;

@Component
public class CustomerTypeFormatter implements Formatter<CustomerType> {
    private final ICustomerTypeService ICustomerTypeService;

    public CustomerTypeFormatter(ICustomerTypeService ICustomerTypeService) {
        this.ICustomerTypeService = ICustomerTypeService;
    }

    @Override
    public CustomerType parse(String text, Locale locale) throws ParseException {
        Optional<CustomerType> customerTypeOptional = ICustomerTypeService.findOne(Long.valueOf(text));
        return customerTypeOptional.orElse(null);
    }

    @Override
    public String print(CustomerType object, Locale locale) {
        return object.toString();
    }
}
