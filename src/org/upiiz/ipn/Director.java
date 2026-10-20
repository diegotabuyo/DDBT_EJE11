package org.upiiz.ipn;

public class Director extends Persona {
    private String unidadAsignada;

    // Se arregló el constructor para recibir el parámetro de unidadAsignada
    public Director(String nombre, int edad, String sexo, String identificador, String unidadAsignada) {
        super(nombre, edad, sexo, identificador);
        this.unidadAsignada = unidadAsignada;
    }

    public void dirigirUnidad() {
        System.out.println(getNombre() + " está dirigiendo la unidad " + unidadAsignada + ".");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Unidad Asignada: " + this.unidadAsignada);
        System.out.println("Tipo: Director");
    }

    public String getUnidadAsignada() { return unidadAsignada; }
    public void setUnidadAsignada(String unidadAsignada) { this.unidadAsignada = unidadAsignada; }
}