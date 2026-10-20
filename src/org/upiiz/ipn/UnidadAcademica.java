package org.upiiz.ipn;

import java.util.ArrayList;
import java.util.List;

public class UnidadAcademica {
    private String nombre;
    private List<Persona> personas;

    public UnidadAcademica(String nombre, Persona director) {
        this.nombre = nombre;
        this.personas = new ArrayList<>();
        this.personas.add(director);
    }

    public void agregarPersonal(Persona persona) {
        this.personas.add(persona);
    }

    // Muestra datos de solo personal Directivo (Director, Subdirector, JefeDepartamento)
    public void mostrarPersonalDirectivo() {
        System.out.println("--- Personal Directivo ---");
        for (Persona p : personas) {
            if (p instanceof Director || p instanceof Subdirector || p instanceof JefeDepartamento) {
                p.mostrarInformacion();
                System.out.println("--------------------");
            }
        }
    }

    // Muestra datos de solo personal Docente
    public void mostrarPersonalDocente() {
        System.out.println("--- Personal Docente ---");
        for (Persona p : personas) {
            if (p instanceof Profesor) {
                p.mostrarInformacion();
                System.out.println("--------------------");
            }
        }
    }

    // Muestra datos de solo Alumnos
    public void mostrarPersonalAlumno() {
        System.out.println("--- Alumnos ---");
        for (Persona p : personas) {
            if (p instanceof Alumno) {
                p.mostrarInformacion();
                System.out.println("--------------------");
            }
        }
    }

    // Muestra datos de solo PAAE
    public void mostrarPersonalPAAE() {
        System.out.println("--- Personal PAAE ---");
        for (Persona p : personas) {
            if (p instanceof PAAE) {
                p.mostrarInformacion();
                System.out.println("--------------------");
            }
        }
    }

    // Muestra la totalidad de materias que imparten los docentes
    public int totalMateriasImpartidas() {
        int totalMaterias = 0;
        for (Persona p : personas) {
            if (p instanceof Profesor) {
                // Hay que hacer un "Casting" para acceder al metodo específico del Profesor
                totalMaterias += ((Profesor) p).getNumeroMateriasImpartidas();
            }
        }
        return totalMaterias;
    }
}