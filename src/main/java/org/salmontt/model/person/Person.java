package org.salmontt.model.person;

/**
 * Abstract class to create extensible person object based on needs of the project
 * currently extends via:
 *  - Employee
 */
public abstract class Person {
    private String name;
    private Address address;
    private String identifier;

    /**
     * @param name          String to represent person name
     * @param address       Reference to Address object containg the person's address
     * @param identifier    String to represent and identifier to the person. e.g. RUT
     */
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
