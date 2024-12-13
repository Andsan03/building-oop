package org.ies.building;

import org.ies.building.components.ApartamentosReader;
import org.ies.building.components.EdificiosReadeer;
import org.ies.building.components.PropietariosReader;
import org.ies.building.models.Apartamentos;
import org.ies.building.models.Propietarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var ownerReader = new PropietariosReader(scanner);
        var apartmentReader = new ApartamentosReader(scanner,ownerReader);
        var buldingReader = new EdificiosReadeer(scanner,apartmentReader);

        Apartamentos apartamentos = apartmentReader.read();

        System.out.println(apartamentos);
    }
}