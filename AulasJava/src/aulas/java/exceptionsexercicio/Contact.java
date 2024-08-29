/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.exceptionsexercicio;

/**
 *
 * @author Welton
 */
public class Contact {

    private static int count = 0;

    private int id;
    private String name;
    private String email;
    private String phoneNumber;

    public Contact() {
        count++;
        id = count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        String s = "[ ";
        s += " Id " + id;
        s += " Name " + name;
        s += " Email " + email;
        s += " Phone number " + phoneNumber+" ]";

        return s;
    }

}
