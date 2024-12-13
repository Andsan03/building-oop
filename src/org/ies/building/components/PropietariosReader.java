package org.ies.building.components;

import org.ies.building.models.Propietarios;

import java.util.Scanner;

public class PropietariosReader {
    private final Scanner scanner;

    public PropietariosReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Propietarios read() {
        System.out.println("Introduce los datos del propietario.");
        System.out.println("NIF:");
        String nif = scanner.nextLine();
        System.out.println("Nombre:");
        String name = scanner.nextLine();
        System.out.println("Apellido;");
        String surname = scanner.nextLine();

        return new Propietarios(
                nif,
                name,
                surname
        );
    }
}
