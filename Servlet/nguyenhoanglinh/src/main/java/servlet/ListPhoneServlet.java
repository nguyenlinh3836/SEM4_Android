package servlet;

import dao.PhoneDao;
import entity.PhoneEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListPhoneServlet",urlPatterns = {"/listphone"})
public class ListPhoneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<PhoneEntity> phones = getAll();
       request.setAttribute("phones", phones);
        request.getRequestDispatcher("Listphone.jsp").forward(request, response);
    }
    private List<PhoneEntity> getAll(){
        PhoneDao dao = new PhoneDao();
        return dao.getAll();
    }
}
