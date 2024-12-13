package org.ies.building.models;

import java.util.Arrays;
import java.util.Objects;

public class Edificios {
    private String direction;
    private String municipality;
    private Apartamentos[] apartments;

    public Edificios(String direction, String municipality, Apartamentos[] apartments) {
        this.direction = direction;
        this.municipality = municipality;
        this.apartments = apartments;
    }

    public void showInfoBuilding() {
        System.out.println("Los datos del edificio:");
        System.out.println("Direccion: " + getDirection());
        System.out.println("Municipio: " + getMunicipality());
        System.out.println("Apartamentos: " + getApartments());
    }

    public Apartamentos findApartment(int floor, String door) {
        for (var apartment: apartments) {
            if (apartment.getFloor() == floor && apartment.getDoor().equals(door)) {
                return apartment;
            }
        }
        return null;
    }

    public void showFloorApartments(int floor) {
        for (var apartament: apartments) {
            if (apartament.getFloor() == floor) {
                apartament.showInfoApartment();
            }else {
                System.out.println("Apartamentos no encontrados");
            }
        }
    }

    public Propietarios[] findOwners(int floor, String door) {
        var apartment = findApartment(floor, door);
        if (apartment != null) {
            return apartment.getOwners();
        }else {
            return null;
        }


    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public Apartamentos[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartamentos[] apartments) {
        this.apartments = apartments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edificios edificios = (Edificios) o;
        return Objects.equals(direction, edificios.direction) && Objects.equals(municipality, edificios.municipality) && Objects.deepEquals(apartments, edificios.apartments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction, municipality, Arrays.hashCode(apartments));
    }

    @Override
    public String toString() {
        return "Edificios{" +
                "direction='" + direction + '\'' +
                ", municipality='" + municipality + '\'' +
                ", apartments=" + Arrays.toString(apartments) +
                '}';
    }
}
