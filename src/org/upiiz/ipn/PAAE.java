package org.upiiz.ipn;

public class PAAE extends Persona {
    private String departamento;
    private String puesto;

    public PAAE(String nombre, int edad, String sexo, String identificador, String departamento, String puesto) {
        super(nombre, edad, sexo, identificador);
        this.departamento = departamento;
        this.puesto = puesto;
    }

    public void realizarActividadAdministrativa() {
        System.out.println(getNombre() + " está realizando actividades como " + puesto + ".");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Puesto: " + this.puesto);
        System.out.println("Tipo: PAAE");
    }
}