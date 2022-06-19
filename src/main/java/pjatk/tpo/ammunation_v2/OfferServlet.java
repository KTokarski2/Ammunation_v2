package pjatk.tpo.ammunation_v2;

import DBService.DBService;
import Models.Gun;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "offerServlet", value = "/offer")
public class OfferServlet extends HelloServlet{

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String gunName = req.getParameter("Name");
        String gunType = req.getParameter("Type");
        String gunOrigin = req.getParameter("Origin");

        try {

            DBService service = new DBService();
            List<Gun> gunList = new ArrayList<>();
            List<Gun> resultSet = new ArrayList<>();

            if(gunName.equals("") && gunType.equals("") && gunOrigin.equals("")) {
                gunList = service.getAllGuns();
            }

            if(!gunOrigin.equals("")) {
                gunList = service.getGunsByOrigin(gunOrigin);
            }

            if(!gunName.equals("")) {
                gunList = service.getGunsByName(gunName);
            }

            if(!gunType.equals("")) {
                gunList = service.getGunsByType(gunType);
            }

            if((!gunType.equals(""))&&(!gunOrigin.equals(""))) {
                gunList = service.getGunsByTypeAndOrigin(gunOrigin,gunType);
            }

            if((!gunName.equals(""))&&(!gunType.equals(""))) {
                gunList = service.getGunsByNameAndType(gunName,gunType);
            }

            if((!gunName.equals(""))&&(!gunOrigin.equals(""))) {
                gunList = service.getGunsByNameAndOrigin(gunName,gunOrigin);
            }

            if((!gunName.equals(""))&&(!gunOrigin.equals(""))&&(!gunType.equals(""))) {
                gunList = service.getGunsByAllParameters(gunName,gunType,gunOrigin);
            }

            req.setAttribute("gunList", gunList);
            req.getRequestDispatcher("/WEB-INF/DBResponse.jsp").forward(req,resp);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException | ServletException e) {
            e.printStackTrace();
        }

    }
}
