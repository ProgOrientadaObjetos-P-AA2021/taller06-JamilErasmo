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
public class Hospital {

    private String nombreH;
    private Ciudad ciudadH;
    private int numeroEspecialistas;
    private Medico[] conjuntoMedicos;
    private Enfermero[] conjuntoEnfermeros;
    private double totalSueldo;
    private String direccionH;

   public Hospital(String nH, Ciudad cH, int nE, Medico[] cM, Enfermero[] cE,
            String dH) {
        nombreH = nH;
        ciudadH = cH;
        numeroEspecialistas = nE;
        conjuntoMedicos = cM;
        conjuntoEnfermeros = cE;
        direccionH = dH;
    }

    public void establecerNombreH(String nH) {
        nombreH = nH;
    }

    public void establecerCiudadH(Ciudad c) {
        ciudadH = c;
    }

    public void establecerNumeroEspecialistas(int nE) {
        numeroEspecialistas = nE;
    }

    public void establecerConjuntoMedicos(Medico[] cM) {
        conjuntoMedicos = cM;
    }

    public void establecerConjuntoEnfemeros(Enfermero[] cE) {
        conjuntoEnfermeros = cE;
    }

    public void calcularTotalSueldo() {
        double sumaM = 0;
        double sumaE = 0;
        for (int i = 0; i < conjuntoMedicos.length; i++) {
            sumaM = sumaM + conjuntoMedicos[i].obtenerSueldo();
        }
        for (int j = 0; j < conjuntoEnfermeros.length; j++) {
            sumaE = sumaE + conjuntoEnfermeros[j].obtenerSueldoE();
        }
        totalSueldo = sumaM + sumaE;
    }

    public void establecerDireccionH(String dH) {
        direccionH = dH;
    }

    public String obtenerNombreH() {
        return nombreH;
    }

    public Ciudad obtenerCiudad() {
        return ciudadH;
    }

    public int obtenerNumeroEspecialistas() {
        return numeroEspecialistas;
    }

    public Medico[] obtenerConjuntoMedicos() {
        return conjuntoMedicos;
    }

    public Enfermero[] obtenerConjuntoEnfermeros() {
        return conjuntoEnfermeros;
    }

    public double obtenerTotalSueldo() {
        return totalSueldo;
    }

    public String obtenerDireccionH() {
        return direccionH;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("%sHospital: %s\nCiudad: %s\nProvincia: %s\n"
                + "Direccion: %s\nNúmero de especialistas: %d\n"
                + "Listado de médicos\n", cadena, nombreH, ciudadH.obtenerCiudad(), 
                ciudadH.obtenerProvincia(), direccionH, 
                numeroEspecialistas);
        for(int i = 0; i < obtenerConjuntoMedicos().length; i++){
            cadena = String.format("%s%s - Sueldo: %.2f - "
                    + "%s\n", cadena, conjuntoMedicos[i].obtenerNombre(),
                    conjuntoMedicos[i].obtenerSueldo(),
                    conjuntoMedicos[i].obtenerEspecialidad());
        }
        cadena = String.format("%sListado de enfermeros\n", cadena);
        for(int i = 0; i < conjuntoEnfermeros.length; i++){
            cadena = String.format("%s%s - Sueldo: %.2f - "
                    + "%s\n", cadena, conjuntoEnfermeros[i].obtenerNombre(),
                    conjuntoEnfermeros[i].obtenerSueldoE(), 
                    conjuntoEnfermeros[i].obtenerTipo());
        }
        cadena = String.format("%sSueldo: %.2f", cadena, obtenerTotalSueldo());
        
        return cadena;
    }

}
