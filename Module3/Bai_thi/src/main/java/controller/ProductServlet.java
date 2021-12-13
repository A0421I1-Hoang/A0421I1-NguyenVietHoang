package controller;

import model.bean.Product;
import model.service.ProductService;
import model.service.impl.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends javax.servlet.http.HttpServlet {
    ProductService productService = new ProductServiceImpl();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action ="";
        }
        switch (action){
            case "create":
                saveProduct(request,response);
                break;
            case "edit":
                updateProduct(request,response);
                break;
            case "delete":
                showDeleteProductForm(request,response);
                break;
            default:
                break;
        }
    }

    private void showDeleteProductForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        if (productService.delete(id)){
            request.setAttribute("mess", "delete thành công");
        }else {
            request.setAttribute("mess", "delete thất bại");
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/list.jsp");
        request.setAttribute("productList",productService.findAll());
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String color = request.getParameter("color");
        String description = request.getParameter("description");
        String category = request.getParameter("category");
        Product product = new Product(id,name, price, quantity, color, category, description);
        boolean check= productService.update(id,product);
        if (check){
            request.setAttribute("mess", "update thành công");
        }else {
            request.setAttribute("mess", "update thất bại");
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/list.jsp");
        request.setAttribute("productList",productService.findAll());
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveProduct(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String price = request.getParameter("price");
        String color = request.getParameter("color");
        String description = request.getParameter("description");
        String category = request.getParameter("category");
        Product product = new Product(name, price, quantity, color, category, description);

        Map<String, String> map = productService.save1(product);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/list.jsp");
        RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("view/product/create.jsp");
        if (map.isEmpty()) {
            try {
                request.setAttribute("customerList", productService.findAll());
                request.setAttribute("mess", "Thêm mới thành công");
                requestDispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                request.setAttribute("productList", productService.findAll());
                request.setAttribute("mess", "Thêm mới thành công");
                requestDispatcher1.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action ="";
        }
        switch (action){
            case "create":
                showCreateProductForm(request,response);
                break;
            case "edit":
                showEditProductForm(request,response);
                break;
            case "delete":
                System.out.println("delete");
                break;
            default:
                showProductList(request,response);
                break;
        }
    }

    private void showProductList(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/list.jsp");
        request.setAttribute("productList",productService.findAll());
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditProductForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product =productService.findById(id);
        request.setAttribute("product",product);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/edit.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateProductForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/create.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
