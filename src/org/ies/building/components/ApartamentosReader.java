package org.ies.building.components;

import org.ies.building.models.Apartamentos;
import org.ies.building.models.Propietarios;

import java.util.Scanner;

public class ApartamentosReader {
    private final Scanner scanner;
    private final PropietariosReader propietariosReader;

    public ApartamentosReader(Scanner scanner, PropietariosReader propietariosReader) {
        this.scanner = scanner;
        this.propietariosReader = propietariosReader;
    }

    public Apartamentos read() {
        System.out.println("Escribe la informacion de los apartamentos");
        System.out.println("Planta:");
        int floor = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Puerta;");
        String door = scanner.nextLine();
        System.out.println("Cuantos propietarios tiene");
        int size = scanner.nextInt();

        Propietarios[] owners = new Propietarios[size];

        for (int i = 0; i < owners.length; i++) {
            owners[i] = propietariosReader.read();
        }
        return new Apartamentos(
                floor,
                door,
                owners
        );
    }
}
