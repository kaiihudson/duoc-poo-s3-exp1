package org.salmontt.model;

public class Person {
    private String name;
    private Address address;
    private String identifier;

    public Person(String name, Address address, String identifier) {
        this.name = name;
        this.address = address;
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "Persona | Nombre: '" + name + '\'' +
                ", ID: '" + identifier + '\'' +
                ", Direccion: " + address ;
    }
}
