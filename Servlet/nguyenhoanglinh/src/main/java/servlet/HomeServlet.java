package servlet;

import dao.PhoneDao;
import entity.PhoneEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "HomeServlet",urlPatterns = {""})
public class HomeServlet extends HttpServlet {
    PhoneDao dao = new PhoneDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        addPhone(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<PhoneEntity> phones = getAll();
//        request.setAttribute("phones", phones);
        request.getRequestDispatcher("addphone.jsp").forward(request, response);
    }
    private List<PhoneEntity> getAll(){
        List<PhoneEntity> phones = dao.getAll();
        return phones;
    }
    private void addPhone(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String brand = request.getParameter("brand");
        double price = Double.parseDouble(request.getParameter("price"));
        String des = request.getParameter("des");
        PhoneEntity phones = new PhoneEntity(name,price,des,brand);
        dao.insertProduct(phones);
        response.sendRedirect("");
    }


}
