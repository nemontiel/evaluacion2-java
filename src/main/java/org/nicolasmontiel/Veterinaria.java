package org.nicolasmontiel;

import java.util.ArrayList;

public class Veterinaria {
    private ArrayList<Mascota> mascotas;

    public Veterinaria() {
        this.mascotas = new ArrayList<>();
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    private boolean verificarCodigo(String codigo){
        for (Mascota m: mascotas) {
            if(m.getCodigo().equalsIgnoreCase(codigo)){
                return true;
            }
        }
        return false;
    }

    public void agregarMascota(Mascota mascota){
        String codigo = mascota.getCodigo();

        if(verificarCodigo(codigo)){
            System.out.println(" ");
            System.out.println("La mascota con código: " + codigo + " ya existe.");
            System.out.println(" ");
        }else {
            mascotas.add(mascota);
        }
    }

    public void listarMascotas() {
        if (!mascotas.isEmpty()) {
            double sumaTotales = 0;
            System.out.println(" ");
            System.out.println("-------------------------------------------------");
            System.out.println("LISTA DE MASCOTAS ALOJADAS");
            System.out.println("-------------------------------------------------");
            System.out.printf("| %-6s | %-10s | %-15s | %-5s | %-4s | %-11s | %-10s | %n",
                "CÓDIGO", "NOMBRE", "EDAD", "PESO", "DÍAS", "SUPERVISIÓN", "TOTAL");
            for (Mascota m : mascotas) {
                //System.out.println(m);
                double total = m.calcularTotal();
                sumaTotales += total;
                System.out.printf("| %-6s | %-10s | %-15s | %-5s | %-4d | %-11b | %-10s | %n",
                    m.getCodigo(), m.getNombre(), m.getEdad(), m.getPeso(), m.getDiasAlojamiento(), m.getSupervision(), total);
            }
            System.out.println("-------------------------------------------------");
            System.out.printf("| %-66s | %-10s | %n",
                " ", sumaTotales);
        } else {
            System.out.println("No hay mascotas alojando actualmente.");
        }

    }
    public void contarMascotas() {
        int cantidad = mascotas.size();
        System.out.println("Mascotas alojadas: " + cantidad);
    }
}
