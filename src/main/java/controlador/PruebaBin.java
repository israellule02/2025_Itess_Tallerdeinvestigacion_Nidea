package controlador;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import tics.itess.Alumnos;
import tics.itess.Portafolio;
import tics.itess.Logro;
import java.util.ArrayList;


@WebServlet(name = "PruebaBin", urlPatterns = {"/PruebaBin"})
public class PruebaBin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
      Alumnos alum1 = new Alumnos("TI221929129","JOSE ISRAEL LULE");
      Logro logro1 = new Logro(1,"curso de programacion","se realizo un curso de programacion en python");
      Logro logro2 = new Logro(2,"curso de programa web","se hizo un curso de progra web en udemy ");
      ArrayList<Logro> listlogros = new ArrayList<>();
      listlogros.add(logro1);
      listlogros.add(logro2);
      Portafolio por1 = new Portafolio(listlogros,alum1);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><body>");
            out.println("<h2>Datos del objeto:</h2>");
            out.println("<p>Nombre: " + alum1.getNombre() + "</p>");
            out.println("<p>matricula: " + alum1.getNum_control() + "</p>");
            out.println("<h1>Portafolio 1 </h1>");
            out.println("<p>" +por1.getAlumno().getNombre()+"</p>");
            for (int i = 0; i<listlogros.size(); i++ ){
                out.println("<p>" +por1.getLogros().get(i).toString()+"</p>");
                
            }
            
            out.println("</body></html>");
        }
    }
}
