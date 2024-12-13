package org.ies.building.models;

import java.util.Objects;

public class Propietarios {
    private String nif;
    private String name;
    private String surname;

    public Propietarios(String nif, String name, String surname) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
    }

    public void showInfoOwner() {
        System.out.println("Datos del propietario:");
        System.out.println("NIF: " + nif);
        System.out.println("Nombre: " + name);
        System.out.println("Apellido: " + surname);
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Propietarios that = (Propietarios) o;
        return Objects.equals(nif, that.nif) && Objects.equals(name, that.name) && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname);
    }

    @Override
    public String toString() {
        return "Propietarios{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
