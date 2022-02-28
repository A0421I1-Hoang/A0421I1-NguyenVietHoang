package com.codegym.baiThi.formatter;

import com.codegym.baiThi.model.ProductType;
import com.codegym.baiThi.service.IProductTypeService;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;
import java.util.Optional;

@Component
public class ProductTypeFormatter implements Formatter<ProductType> {
    private final IProductTypeService iProductTypeService;

    public ProductTypeFormatter(IProductTypeService IProductTypeService) {
        this.iProductTypeService = IProductTypeService;
    }

    @Override
    public ProductType parse(String text, Locale locale) throws ParseException {
        Optional<ProductType> customerTypeOptional = iProductTypeService.findOne(Long.valueOf(text));
        return customerTypeOptional.orElse(null);
    }

    @Override
    public String print(ProductType object, Locale locale) {
        return object.toString();
    }
}
