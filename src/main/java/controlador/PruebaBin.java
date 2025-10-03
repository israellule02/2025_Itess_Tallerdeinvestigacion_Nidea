package controlador;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import tics.itess.Alumnos;
import tics.itess.Portafolio;
import tics.itess.Logro;


@WebServlet(name = "PruebaBin", urlPatterns = {"/PruebaBin"})
public class PruebaBin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
      Alumnos alum1 = new Alumnos("TI221929129","JOSE ISRAEL LULE");
      Logro logro1 = new Logro(1,"curso de programacion","se realizo un curso de programacion en python");
      Portafolio por1 = new Portafolio(alum1,logro1);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><body>");
            out.println("<h2>Datos del objeto:</h2>");
            out.println("<p>Nombre: " + alum1.getNombre() + "</p>");
            out.println("<p>matricula: " + alum1.getNum_control() + "</p>");
            out.println("<h1>Portafolio 1 </h1>");
            out.println("<p>" +por1.getAlumno().getNombre()+"</p>");
            out.println("<p>" +por1.getLogro().getCategoria()+"</p>");
            out.println("</body></html>");
        }
    }
}
