package com.example.batchprocessing.model;

public class Person {

    private String lastName;
    private String firstName;
    private Objeto objeto;

    public Person() {
    }

    public Person(String firstName, String lastName, Objeto objeto) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.objeto = objeto;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + ", lastName: " + lastName;
    }

    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }
}
