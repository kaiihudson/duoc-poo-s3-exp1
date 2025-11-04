package org.salmontt.model;

public class Employee extends Person{
    private EmployeeRole role;

    public Employee(String name, Address address, String identifier, EmployeeRole role) {
        super(name, address, identifier);
        this.role = role;
    }

    public EmployeeRole getRole() {
        return role;
    }

    public void setRole(EmployeeRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Empleado | Nombre: '" + getName() + "'. ID: '" + getIdentifier() +
                "' | Rol: " + role;
    }
}
