package org.nicolasmontiel;

public class Perro extends Mascota {
    private int ejercicioDiario;

    public Perro() {
    }

    public Perro(String codigo, String nombre, String edad, float peso, int diasAlojamiento, boolean supervision, int ejercicioDiario) {
        super(codigo, nombre, edad, peso, diasAlojamiento, supervision);
        this.ejercicioDiario = ejercicioDiario;
    }

    public int getEjercicioDiario() {
        return ejercicioDiario;
    }

    public void setEjercicioDiario(int ejercicioDiario) {
        this.ejercicioDiario = ejercicioDiario;
    }

    @Override
    public double calcularTotal() {
        if(ejercicioDiario > 3) {
            return Costo.VALOR_DIA_ALOJAMIENTO * (1 + Costo.EJERC_PERRO/100) * getDiasAlojamiento();
        }
        return Costo.VALOR_DIA_ALOJAMIENTO * getDiasAlojamiento();
    }

    @Override
    public void mostrarMascota(){

        double total = calcularTotal();
        System.out.println(" ");
        System.out.println("DETALLES DE MASCOTA");
        System.out.println("------------------------------");
        System.out.printf("| %-6s | %-7s | %-10s | %-15s | %-5s | %-5s | %-10s | %-12s | %n",
            "CÓDIGO", "TIPO","NOMBRE", "EDAD", "PESO", "DÍAS", "EJERCICIO", "SUPERVISION");
        System.out.printf("| %-6s | %-7s | %-10s | %-15s | %-5s | %-5d | %-10d | %-12b | %n",
            getCodigo(), "Perro", getNombre(), getEdad(), getPeso(), getDiasAlojamiento(), getEjercicioDiario(), getSupervision());
        System.out.println("------------------------------");

        if(getEjercicioDiario() > 3){
            System.out.println("CARGO ADICIONAL: " + Costo.EJERC_PERRO + "%");
        } else{
            System.out.println("Sin cargos adicionales");
        }
        System.out.println("TOTAL: $" + total);

    }
}
