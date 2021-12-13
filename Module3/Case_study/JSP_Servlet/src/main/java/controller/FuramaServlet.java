package controller;

import model.bean.Customer;
import model.service.CustomerService;
import model.service.impl.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "FuramaServlet", urlPatterns = "/customer")
public class FuramaServlet extends HttpServlet {
    CustomerService customerService = new CustomerServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action ="";
        }
        switch (action){
            case "create":
                saveCustomer(request,response);
                //thêm
                break;
            case "edit":
                updateCustomer(request,response);
                break;
            case "delete":
                showDeleteCustomerForm(request,response);
                // xóa
                break;
            default:
                break;
        }
    }

    private void showDeleteCustomerForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        if (customerService.delete(id)){
            request.setAttribute("mess", "delete thành công");
        }else {
            request.setAttribute("mess", "delete thất bại");
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/customer/list.jsp");
        request.setAttribute("studentList",customerService.findAll());
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("ID"));
        int idLoaiKhach = Integer.parseInt(request.getParameter("ID_loai_khach"));
        String name = request.getParameter("Ho_va_ten");
        int age = Integer.parseInt(request.getParameter("Tuoi"));
        String CMND = request.getParameter("CMND");
        String phoneNumber =request.getParameter("SDT");
        String email = request.getParameter("Email");
        boolean sex = Boolean.parseBoolean(request.getParameter("sex"));
        String address = request.getParameter("Dia_chi");
        Customer customer =new Customer(id, idLoaiKhach, name, age, phoneNumber, CMND, email, sex, address);
        boolean check= customerService.update(id,customer);
        if (check){
            request.setAttribute("mess", "update thành công");
        }else {
            request.setAttribute("mess", "update thất bại");
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/customer/list.jsp");
        request.setAttribute("studentList",customerService.findAll());
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveCustomer(HttpServletRequest request, HttpServletResponse response) {

        int idLoaiKhach = Integer.parseInt(request.getParameter("typeCustomer"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String CMND = request.getParameter("CMND");
        String phoneNumber =request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        boolean sex = Boolean.parseBoolean(request.getParameter("sex"));
        String address = request.getParameter("address");
        Customer customer =new Customer(name, age, phoneNumber, CMND, email, sex,idLoaiKhach, address);


//        boolean check= studentService.save(student);
        Map<String,String> map = customerService.save1(customer);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/customer/list.jsp");
        RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("view/customer/create.jsp");
        if (map.isEmpty()){
            try {
                request.setAttribute("customerList",customerService.findAll());
                request.setAttribute("mess","Thêm mới thành công");
                requestDispatcher.forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            try {
                // tra ve rang create + đưa dl của student + message lỗi
                request.setAttribute("emailMss",map.get("emailMss"));
                request.setAttribute("oldStudent",customer);
                requestDispatcher1.forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action ="";
        }
        switch (action){
            case "create":
                showCreateCustomerForm(request,response);
                //thêm
                break;
            case "edit":
                showEditCustomerForm(request,response);
                // sửa
                break;
            case "delete":
                System.out.println("delete");
//                showDeleteStudentForm(request,response);
                // xóa
                break;
            default:
                showCustomerList(request,response);
                break;
        }
    }

    private void showCustomerList(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/customer/list.jsp");
        request.setAttribute("customerList",customerService.findAll());
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditCustomerForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer =customerService.findById(id);
        request.setAttribute("customer",customer);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/customer/edit.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateCustomerForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/customer/create.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
