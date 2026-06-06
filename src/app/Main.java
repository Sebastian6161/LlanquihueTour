package app;

import model.Direccion;
import model.GuiaTuristico;

public class Main {

    public static void main(String[] args) {

        Direccion d1 = new Direccion(
                "Av. Costanera 123",
                "Llanquihue");

        Direccion d2 = new Direccion(
                "Los Lagos 456",
                "Puerto Varas");

        Direccion d3 = new Direccion(
                "Volcanes 789",
                "Frutillar");

        GuiaTuristico g1 = new GuiaTuristico(
                "Juan Perez",
                "11.111.111-1",
                d1,
                "Tours Culturales");

        GuiaTuristico g2 = new GuiaTuristico(
                "Maria Soto",
                "22.222.222-2",
                d2,
                "Rutas Gastronomicas");

        GuiaTuristico g3 = new GuiaTuristico(
                "Carlos Diaz",
                "33.333.333-3",
                d3,
                "Paseos Lacustres");

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
    }
}

