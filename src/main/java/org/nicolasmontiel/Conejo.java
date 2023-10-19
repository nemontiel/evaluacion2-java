package org.nicolasmontiel;

public class Conejo extends Mascota {
    private String dieta;

    public Conejo(){}

    public Conejo(String codigo, String nombre, String edad, float peso, int diasAlojamiento, boolean supervision, String dieta) {
        super(codigo, nombre, edad, peso, diasAlojamiento, supervision);
        this.dieta = dieta;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public double calcularTotal(){
        return Costo.VALOR_DIA_ALOJAMIENTO * (1 - Costo.DESCTO_CONEJO/100) * getDiasAlojamiento();
    }
    @Override
    public void mostrarMascota(){
       double total = calcularTotal();
        System.out.println(" ");
        System.out.println("DETALLES DE MASCOTA");
        System.out.println("------------------------------");
        System.out.printf("| %-6s | %-7s | %-10s | %-15s | %-5s | %-5s | %-10s | %-12s | %n",
            "CÓDIGO", "TIPO","NOMBRE", "EDAD", "PESO", "DÍAS","DIETA","SUPERVISION");
        System.out.printf("| %-6s | %-7s | %-10s | %-15s | %-5s | %-5d | %-10S | %-12b | %n",
            getCodigo(), "Conejo", getNombre(), getEdad(), getPeso(), getDiasAlojamiento(), getDieta(), getSupervision());
        System.out.println("------------------------------");
        System.out.println("DESCUENTO: " + Costo.DESCTO_CONEJO + "%");
        System.out.println("TOTAL: $" + total);
    }
}
