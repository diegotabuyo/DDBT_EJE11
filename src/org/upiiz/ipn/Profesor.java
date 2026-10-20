package org.upiiz.ipn;

public class Profesor extends Persona {
    private String academia;
    private int numeroMateriasImpartidas;

    public Profesor(String nombre, int edad, String sexo, String identificador, String academia, int numeroMateriasImpartidas) {
        super(nombre, edad, sexo, identificador);
        this.academia = academia;
        this.numeroMateriasImpartidas = numeroMateriasImpartidas;
    }

    public void impartirClase() {
        System.out.println(getNombre() + " está impartiendo clase de la academia de " + academia + ".");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Academia: " + this.academia);
        System.out.println("Número de Materias Impartidas: " + this.numeroMateriasImpartidas);
        System.out.println("Tipo: Profesor");
    }

    public String getAcademia() { return academia; }
    public void setAcademia(String academia) { this.academia = academia; }

    public int getNumeroMateriasImpartidas() { return numeroMateriasImpartidas; }
    public void setNumeroMateriasImpartidas(int numeroMateriasImpartidas) { this.numeroMateriasImpartidas = numeroMateriasImpartidas; }
}