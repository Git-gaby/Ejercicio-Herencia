package org.project;

// Clase Profesor: Otra clase que Hereda de Persona
public class Profesor extends Persona {
    
    protected String departamento;
    protected double salario; // Nuevo: Salario anual
    
    // Constructor para Profesor
    public Profesor(String nombre, String apellidos, int anyoNacimiento, String id, String departamento, double salario) {
        super(nombre, apellidos, anyoNacimiento, id); // Llama al constructor de Persona
        this.departamento = departamento;
        this.salario = salario;
    }

    // Nueva Función: Simular impartir una clase
    public void impartirClase(String asignatura) {
        System.out.println("El Prof. " + apellidos + " está impartiendo la clase de " + asignatura + ".");
    }
    
    // Sobreescritura (Override) del método imprime
    @Override
    public void imprime() {
        super.imprime(); // Llama a la impresión de la clase Persona
        System.out.println("--- Datos Laborales ---");
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario Anual: " + salario + " (Confidencial)");
        System.out.println("-----------------------");
    }
}