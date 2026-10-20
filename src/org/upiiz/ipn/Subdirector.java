package org.upiiz.ipn;

public class Subdirector extends Persona {
    private String areaResponsabilidad;

    public Subdirector(String nombre, int edad, String sexo, String identificador, String areaResponsabilidad) {
        super(nombre, edad, sexo, identificador);
        this.areaResponsabilidad = areaResponsabilidad;
    }

    public void coordinarActividades() {
        System.out.println(getNombre() + " está coordinando el área de " + areaResponsabilidad + ".");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Área de Responsabilidad: " + this.areaResponsabilidad);
        System.out.println("Tipo: Subdirector");
    }
}