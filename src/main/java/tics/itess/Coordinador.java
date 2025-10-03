/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tics.itess;

/**
 *
 * @author israk
 */
public class Coordinador {
    private String nombre ;
    private int id ;
    private String permisos;

    public Coordinador(String nombre, int id, String permisos) {
        this.nombre = nombre;
        this.id = id;
        this.permisos = permisos;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }
    
    
}
