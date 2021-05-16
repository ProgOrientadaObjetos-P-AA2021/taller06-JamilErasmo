/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Usuario
 */
public class Medico {

    private String nombre;
    private String especialidad;
    private double sueldoMh;

    public Medico(String n, String e, double sMh) {
        nombre = n;
        especialidad = e;
        sueldoMh = sMh;
    }

    public void establecerNombre(String nD) {
        nombre = nD;
    }

    public void establecerEspecialidad(String e) {
        especialidad = e;
    }

    public void establecerSueldo(double sMh) {
        sueldoMh = sMh;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public double obtenerSueldo() {
        return sueldoMh;
    }
}
