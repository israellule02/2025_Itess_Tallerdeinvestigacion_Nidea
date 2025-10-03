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
    private ArrayList logros ;
    private Logro Logro;
    private Alumnos alumno;

    public Portafolio( Alumnos alumno, Logro Logro) {
        this.Logro = Logro;
        this.alumno = alumno;
    }
    
    

    public Logro getLogro() {
        return Logro;
    }

    public void setLogro(Logro Logro) {
        this.Logro = Logro;
    }

    public Alumnos getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }
    
    
}
