package org.project;

// Clase Alumno: Aprendices de Héroes - ¡Preparándose para la aventura!
// Clase Alumno: Hereda de Persona
public class Alumno extends Persona {

    protected String grupo;
    protected char horario;
    protected int creditosAcumulados; // Nuevo: Para llevar el progreso académico

    // Constructor para Alumno, llama al constructor de Persona
    // Notar que el constructor de Alumno debe manejar el ID ahora.
    public Alumno (String nombre, String apellidos, int anyoNacimiento, String id, String grupoInicial) {
        super(nombre, apellidos, anyoNacimiento, id); // Llama al constructor de Persona
        this.creditosAcumulados = 0; // Empieza con 0 créditos
        this.grupo = grupoInicial;
    }

    // Método para asignar grupo y horario (similar al original)
    public void asignarGrupo(String grupo, char horario) {
        if (grupo == null || grupo.trim().isEmpty()) {
            System.out.println("[Error] Grupo no válido.");
        } else if (horario != 'M' && horario != 'T' && horario != 'N') {
            System.out.println("[Error] Horario no válido. Usar 'M', 'T' o 'N'.");
        } else {
            this.grupo = grupo;
            this.horario = horario;
            System.out.println(nombre + " asignado al Grupo " + this.grupo + " en horario " + this.horario + ".");
        }
    }

    // Nueva Función: Simular la aprobación de una asignatura
    public void registrarCreditos(String asignatura, int creditos) {
        if (creditos > 0) {
            this.creditosAcumulados += creditos;
            System.out.println("-> Éxito: " + nombre + " aprueba " + asignatura + " y acumula " + creditos + " créditos.");
        } else {
            System.out.println("-> Aviso: No se registraron créditos para " + asignatura + ".");
        }
    }

    // Sobreescritura (Override) del método imprime para añadir detalles del Alumno
    @Override
    public void imprime() {
        super.imprime(); // Llama a la impresión de la clase Persona
        System.out.println("--- Datos Académicos ---");
        System.out.println("Grupo Asignado: " + grupo + " (Horario: " + horario + ")");
        System.out.println("Créditos Acumulados: " + creditosAcumulados);
        System.out.println("------------------------");
    }
    
    // Nueva Función (específica de Alumno)
    public void mostrarGrupo() {
        System.out.println(nombre + " está en el Grupo " + grupo + ".");
    }
}