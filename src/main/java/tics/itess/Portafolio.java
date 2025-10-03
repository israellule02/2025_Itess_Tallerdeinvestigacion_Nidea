/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tics.itess;
import tics.itess.Logro;
import tics.itess.Alumnos;
import java.util.ArrayList;
/**
 *
 * @author israk
 */
public class Portafolio {
    private ArrayList<Logro> logros ;
   
    private Alumnos alumno;

    public Portafolio(ArrayList logros, Alumnos alumno) {
        this.logros = logros;
        this.alumno = alumno;
    }

    public ArrayList getLogros() {
        return logros;
    }

    public void setLogros(ArrayList logros) {
        this.logros = logros;
    }

    
    
    

    

    public Alumnos getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }
    
    
}
