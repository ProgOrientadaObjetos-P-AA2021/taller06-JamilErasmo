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
public class Enfermero {

    private String nombre;
    private String tipo;
    private double sueldoE;

    public Enfermero(String n, String tp, double sM) {
        nombre = n;
        tipo = tp;
        sueldoE = sM;
    }

    public void establecerNonbre(String n) {
        nombre = n;
    }

    public void establecerTipo(String tp) {
        tipo = tp;
    }

    public void establecerSueldoE(double sM) {
        sueldoE = sM;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public double obtenerSueldoE() {
        return sueldoE;
    }
}
