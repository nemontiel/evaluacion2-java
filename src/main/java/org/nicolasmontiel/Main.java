package org.nicolasmontiel;

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("P1", "Mini", "9 meses", 5, 4, true, 1);
        Perro perro2 = new Perro("P2", "Pola", "6 años", 50, 3, false, 4);
        Perro perro3 = new Perro("P3", "Blanquita", "6 años", 8, 6, false, 2);
        Perro perro4 = new Perro("P1", "Spike", "7 años 2 meses", 40.2f, 9, true, 4);

        Gato gato1 = new Gato("G1", "Garfield", "7 años", 3.5f, 2, false, "Exótico");
        Gato gato2 = new Gato("G2", "Tom", "5 años", 4.4f, 7, true, "Callejero");

        Conejo conejo1 = new Conejo("C1", "Bugs", "5 años 7 meses", 2.4f, 8, true, "zanahoria");
        Conejo conejo2 = new Conejo("C2", "Roger", "6 años", 3, 4, false, "alfalfa");

        Veterinaria airbnbPet = new Veterinaria();

        //Método de la clase Veterinaria para agregar las mascotas creadas
        airbnbPet.agregarMascota(perro1);
        airbnbPet.agregarMascota(perro2);
        airbnbPet.agregarMascota(perro3);
        //perro4 no se agrega por tener el mismo código de perro1 y se muestra mensaje por consola
        airbnbPet.agregarMascota(perro4);

        airbnbPet.agregarMascota(gato1);
        airbnbPet.agregarMascota(gato2);

        airbnbPet.agregarMascota(conejo1);
        airbnbPet.agregarMascota(conejo2);

        //Método para mostrar una lista con todas las mascotas
        airbnbPet.listarMascotas();

        //Método para contar cantidad de mascotas alojadas
        airbnbPet.contarMascotas();

        //Método para mostrar datos de una mascota en específico
        perro2.mostrarMascota();
        gato2.mostrarMascota();
        conejo1.mostrarMascota();
    }
}