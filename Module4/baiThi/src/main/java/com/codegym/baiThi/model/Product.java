package com.codegym.baiThi.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "product")
public class Product implements Cloneable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name", columnDefinition = "VARCHAR(45)")
    @NotBlank(message = "wrong format")
    private String name;

    @Column(name = "price", columnDefinition = "VARCHAR(45)")
    @NotBlank(message = "wrong format")
    private String price;

    @Column(name = "status", columnDefinition = "VARCHAR(45)")
    @NotBlank(message = "wrong format")
    private String status;

    @ManyToOne
    @JoinColumn(name = "productType_id")
    private ProductType productType;

    public Product() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    @Override
    public Product clone() {
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setPrice(price);
        product.setStatus(status);
        product.setProductType(productType);
        return product;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", status='" + status + '\'' +
                ", productType=" + productType +
                '}';
    }
}
