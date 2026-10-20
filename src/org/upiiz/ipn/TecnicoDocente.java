package org.upiiz.ipn;

public class TecnicoDocente extends Persona {
    private String areaTecnica;
    private String laboratorioAsignado;

    public TecnicoDocente(String nombre, int edad, String sexo, String identificador, String areaTecnica, String laboratorioAsignado) {
        super(nombre, edad, sexo, identificador);
        this.areaTecnica = areaTecnica;
        this.laboratorioAsignado = laboratorioAsignado;
    }

    public void apoyarLaboratorio() {
        System.out.println(getNombre() + " está brindando apoyo en el laboratorio " + laboratorioAsignado + ".");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Área Técnica: " + this.areaTecnica);
        System.out.println("Laboratorio Asignado: " + this.laboratorioAsignado);
        System.out.println("Tipo: Técnico Docente");
    }
}