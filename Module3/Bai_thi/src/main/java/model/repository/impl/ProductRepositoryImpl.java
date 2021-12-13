package model.repository.impl;

import model.bean.Product;
import model.repository.ProductRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    private static List<Product> productList = new ArrayList<>();
    private BaseRepository baseRepository = new BaseRepository();
    private final String SELECT_ALL = "SELECT * FROM product;";
    private final String SELECT_BY_ID = "SELECT * FROM product WHERE id =?;";
    private final String DELETE_BY_ID = "DELETE FROM product WHERE id =?;";
    final String INSERT_INTO_PRODUCT = "insert into product (`name`,price,quantity,color,category,description)" +
            "values(?,?,?,?,?,?);";
    private final String UPDATE_ACCOUNT = "UPDATE product set `account`=? where email =?;";
    final String UPDATE_PRODUCT = "call edit_customer_by_id(?,?,?,?,?,?,?,?);";
    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int quantity = resultSet.getInt("quantity");
                String price = resultSet.getString("price");
                String color = resultSet.getString("color");
                String description = resultSet.getString("description");
                String category = resultSet.getString("category");
                Product product = new Product(id,name, price, quantity, color, category, description);
                productList.add(product);
            }

            preparedStatement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productList;
    }

    @Override
    public Product findById(int id) {
        Product product = null;
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id1 = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int quantity = resultSet.getInt("quantity");
                String price = resultSet.getString("price");
                String color = resultSet.getString("color");
                String description = resultSet.getString("description");
                String category = resultSet.getString("category");
                product = new Product(id1, name, price, quantity, color, category, description);
            }

            preparedStatement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return product;
    }

    @Override
    public boolean save(Product product) {
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        boolean check = false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_PRODUCT);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setString(5, product.getCategory());
            preparedStatement.setString(6, product.getDescription());

            check = preparedStatement.executeUpdate() > 0;
            preparedStatement.close();

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
    public boolean update(int id, Product product) {
        Connection connection = null;
        connection = baseRepository.connectDataBase();
        boolean check = false;
        try {
            CallableStatement callableStatement = connection.prepareCall(UPDATE_PRODUCT);
            callableStatement.setInt(1, product.getId());
            callableStatement.setString(2, product.getName());
            callableStatement.setString(3, product.getPrice());
            callableStatement.setInt(4, product.getQuantity());
            callableStatement.setString(5, product.getColor());
            callableStatement.setString(6, product.getCategory());
            callableStatement.setString(7, product.getDescription());
            check = callableStatement.executeUpdate() > 0;
            callableStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }
}
