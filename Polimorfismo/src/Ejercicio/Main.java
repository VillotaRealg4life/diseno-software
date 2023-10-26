package Ejercicio;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", "Perez", "12345", "Soltero", "Ingeniería software");
        Profesor profesor = new Profesor("Maria", "Gomez", "67890", "Casado", 2005, "A101", "Software");
        PersonalServicio personal = new PersonalServicio("Carlos", "Lopez", "54321", "Divorciado", 2010, "B201", "Biblioteca");

        estudiante.imprimirInformacion();
        profesor.imprimirInformacion();
        personal.imprimirInformacion();

        estudiante.matricularEnCurso("Ingeniería de Software");
        profesor.cambiarDepartamento("Matemáticas");
        personal.cambiarSeccion("Secretaría");

        System.out.println("\nInformación actualizada:");
        estudiante.imprimirInformacion();
        profesor.imprimirInformacion();
        personal.imprimirInformacion();
    }
}