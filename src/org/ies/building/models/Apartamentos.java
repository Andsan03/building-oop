package org.ies.building.models;

import java.util.Arrays;
import java.util.Objects;

public class Apartamentos {
    private int floor;
    private String door;
    private Propietarios[] owners;

    public Apartamentos(int floor, String door, Propietarios[] properties) {
        this.floor = floor;
        this.door = door;
        this.owners = properties;
    }

    public void showInfoApartment() {
        System.out.println("Los datos del apartamento");
        System.out.println("Planta: " + floor);
        System.out.println("Puerta: " + door);
        for (var propietario: owners) {
            System.out.println(propietario);
        }
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public Propietarios[] getOwners() {
        return owners;
    }

    public void setOwners(Propietarios[] owners) {
        this.owners = owners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartamentos that = (Apartamentos) o;
        return floor == that.floor && Objects.equals(door, that.door) && Objects.deepEquals(owners, that.owners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floor, door, Arrays.hashCode(owners));
    }

    @Override
    public String toString() {
        return "Apartamentos{" +
                "floor=" + floor +
                ", door='" + door + '\'' +
                ", properties=" + Arrays.toString(owners) +
                '}';
    }
}
