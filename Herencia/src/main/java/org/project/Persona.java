/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.project;

// Clase base: Persona
public class Persona {

    protected String nombre;
    protected String apellidos;
    protected int anyoNacimiento;
    protected String id; // Nuevo: Identificación única

    // Constructor por defecto
    public Persona () {
        this.id = "N/A";
    }

    // Constructor completo
    public Persona (String nombre, String apellidos, int anyoNacimiento, String id){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anyoNacimiento = anyoNacimiento;
        this.id = id;
    }

    // Método para imprimir datos básicos
    public void imprime(){
        System.out.println("--- Datos Personales ---");
        System.out.println("Nombre Completo: " + nombre + " " + apellidos);
        System.out.println("Año de Nacimiento: " + anyoNacimiento);
        System.out.println("ID: " + id);
    }

    // Nuevo: Método formal que devuelve una cadena descriptiva
    public String obtenerDescripcionFormal() {
        return "Persona: " + nombre + " " + apellidos + " (ID: " + id + ", Nacido: " + anyoNacimiento + ")";
    }

    // Getter para ID (puede ser útil)
    public String getId() {
        return id;
    }
}