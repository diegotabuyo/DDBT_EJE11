package org.upiiz.ipn;

public class Alumno extends Persona {
    private String carrera;
    private int semestre;

    public Alumno(String nombre, int edad, String sexo, String identificador, String carrera, int semestre) {
        super(nombre, edad, sexo, identificador);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public void estudiar() {
        System.out.println(getNombre() + " está estudiando para sus materias del semestre " + semestre + ".");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Carrera: " + this.carrera);
        System.out.println("Semestre: " + this.semestre);
        System.out.println("Tipo: Alumno");
    }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public int getSemestre() { return semestre; }
    public void setSemestre(int semestre) { this.semestre = semestre; }
}