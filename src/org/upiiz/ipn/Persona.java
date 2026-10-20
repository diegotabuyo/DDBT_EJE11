package org.upiiz.ipn;

public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private String identificador;

    public Persona(String nombre, int edad, String sexo, String identificador) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.identificador = identificador;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Identificador: " + this.identificador);
    }

    // Métodos Getters y Setters para cumplir con el Encapsulamiento
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public String getIdentificador() { return identificador; }
    public void setIdentificador(String identificador) { this.identificador = identificador; }
}