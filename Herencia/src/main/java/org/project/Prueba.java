package org.project;

// Clase principal: Pruebas de Herencia
public class Prueba {

    public static void main (String[] args) {
        System.out.println("--- SIMULACIÓN ACADÉMICA EXTENDIDA ---");
        System.out.println();

        // 1. Creación de un Alumno
        Alumno alumnoJuan = new Alumno ("Juan", "Ugarte López", 1995, "A1995001", "G66");
        alumnoJuan.asignarGrupo("G66", 'M');
        alumnoJuan.imprime();
        
        // El alumno realiza acciones específicas de Alumno
        alumnoJuan.registrarCreditos("Programación Java", 6);
        alumnoJuan.registrarCreditos("Bases de Datos", 6);
        alumnoJuan.mostrarGrupo();
        
        System.out.println();
        
        // 2. Creación de un Profesor (Nueva clase hija)
        Profesor profLuisa = new Profesor ("Luisa", "Asenjo Martínez", 1978, "P1978010", "Sistemas", 55000.00);
        profLuisa.imprime();
        
        // El profesor realiza acciones específicas de Profesor
        profLuisa.impartirClase("Análisis de Algoritmos");
        
        // El profesor usa una función heredada
        System.out.println("Descripción formal: " + profLuisa.obtenerDescripcionFormal());
        
        System.out.println();
        
        // 3. Demostración de polimorfismo (aunque no es el foco, es importante)
        // Se puede crear un array de la clase base y guardar objetos de las clases hijas
        Persona[] miembros = new Persona[2];
        miembros[0] = alumnoJuan;
        miembros[1] = profLuisa;
        
        System.out.println("--- Listado de Miembros del Staff y Alumnos ---");
        for (Persona p : miembros) {
            // Se llama al método imprime() SOBREESCRITO
            p.imprime(); 
        }
        
        System.out.println("--- FIN DE LA SIMULACIÓN ---");
    }

}