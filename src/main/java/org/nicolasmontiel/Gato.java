package org.nicolasmontiel;

public class Gato extends Mascota {
    private String pedigri;

    public Gato(){
    }

    public Gato(String codigo, String nombre, String edad, float peso, int diasAlojamiento, boolean supervision, String pedigri) {
        super(codigo, nombre, edad, peso, diasAlojamiento, supervision);
        this.pedigri = pedigri;
    }

    public String getPedigri() {
        return pedigri;
    }

    public void setPedigri(String pedigri) {
        this.pedigri = pedigri;
    }

    @Override
    public double calcularTotal(){
        return Costo.VALOR_DIA_ALOJAMIENTO * (1 + Costo.INCREM_GATO/100) * getDiasAlojamiento();
    }
    @Override
    public void mostrarMascota(){
        double total = calcularTotal();
        System.out.println(" ");
        System.out.println("DETALLES DE MASCOTA");
        System.out.println("------------------------------");
        System.out.printf("| %-6s | %-7s | %-10s | %-15s | %-5s | %-5s | %-10s | %-12s | %n",
            "CÓDIGO", "TIPO", "NOMBRE", "EDAD", "PESO", "DÍAS","PEDIGRÍ","SUPERVISION");
        System.out.printf("| %-6s | %-7s | %-10s | %-15s | %-5s | %-5d | %-10S | %-12b | %n",
            getCodigo(), "Gato", getNombre(), getEdad(), getPeso(), getDiasAlojamiento(), getPedigri(), getSupervision());
        System.out.println("------------------------------");
        System.out.println("CARGO ADICIONAL: " + Costo.INCREM_GATO + "%");
        System.out.println("TOTAL: $" + total);
    }
}
