package org.upiiz.ipn;

public class JefeDepartamento extends Persona {
    private String departamentoACargo;

    public JefeDepartamento(String nombre, int edad, String sexo, String identificador, String departamentoACargo) {
        super(nombre, edad, sexo, identificador);
        this.departamentoACargo = departamentoACargo;
    }

    public void coordinarDepartamento() {
        System.out.println(getNombre() + " está coordinando el departamento de " + departamentoACargo + ".");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento a Cargo: " + this.departamentoACargo);
        System.out.println("Tipo: Jefe de Departamento");
    }
}