package org.upiiz;

import org.upiiz.ipn.*;


public class Main {
    public static void main(String[] args) {

        // Creación de objetos instanciando las 7 clases solicitadas
        Director director = new Director("Luis", 47, "Masculino", "552813", "ESCOM");
        Alumno alumno = new Alumno("Pedro", 28, "Masculino", "202558067", "Sistemas Computacionales", 5);
        Profesor profesor = new Profesor("Alicia", 40, "Femenino", "527898", "Sociales", 4);
        Subdirector subdirector = new Subdirector("Marta", 45, "Femenino", "552814", "Gestión Académica");
        JefeDepartamento jefe = new JefeDepartamento("Carlos", 50, "Masculino", "552815", "Ciencias Básicas");
        TecnicoDocente tecnico = new TecnicoDocente("Jorge", 35, "Masculino", "552816", "Redes", "Lab 3");
        PAAE paae = new PAAE("Ana", 30, "Femenino", "552817", "Control Escolar", "Secretaria");

        // Polimorfismo: Arreglo de tipo Persona que contiene a todas las clases derivadas
        Persona[] comunidad = {director, alumno, profesor, subdirector, jefe, tecnico, paae};

        System.out.println("======== INFORMACIÓN GENERAL DEL ARREGLO POLIMÓRFICO ========");
        for (Persona persona : comunidad) {
            persona.mostrarInformacion();
            System.out.println("--------------------------------");
        }

        System.out.println("\n======== PRUEBA DE LA CLASE UNIDAD ACADÉMICA ========");
        UnidadAcademica unidadAcademica = new UnidadAcademica("ESCOM", director);
        unidadAcademica.agregarPersonal(alumno);
        unidadAcademica.agregarPersonal(profesor);
        unidadAcademica.agregarPersonal(paae);
        unidadAcademica.agregarPersonal(subdirector);

        unidadAcademica.mostrarPersonalDirectivo();
        unidadAcademica.mostrarPersonalAlumno();

        System.out.println("Total de materias impartidas en la Unidad: " + unidadAcademica.totalMateriasImpartidas());
    }
}