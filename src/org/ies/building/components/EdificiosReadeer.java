package org.ies.building.components;

import org.ies.building.models.Apartamentos;
import org.ies.building.models.Edificios;

import java.util.Scanner;

public class EdificiosReadeer {
    private final Scanner scanner;
    private final ApartamentosReader apartamentosReader;

    public EdificiosReadeer(Scanner scanner, ApartamentosReader apartamentosReader) {
        this.scanner = scanner;
        this.apartamentosReader = apartamentosReader;
    }

    public Edificios read() {
        System.out.println("Escribe los datos del edificio");
        System.out.println("Direccion:");
        String direction = scanner.nextLine();
        System.out.println("Municipio:");
        String municipality = scanner.nextLine();
        System.out.println("Cuantos apartamentos tendra el edificio?");
        int size = scanner.nextInt();

        Apartamentos[] apartments = new Apartamentos[size];

        for (int i = 0; i < size; i++) {
            apartments[i] = apartamentosReader.read();
        }

        return new Edificios(
                direction,
                municipality,
                apartments
        );
    }
}
