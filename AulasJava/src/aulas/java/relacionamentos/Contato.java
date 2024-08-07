/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.relacionamentos;

/**
 *
 * @author Welton
 */
public class Contato {

    private String name;
    private Endereco address;
    private Telefone[] fones;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Endereco getAddress() {
        return address;
    }

    public void setAddress(Endereco address) {
        this.address = address;
    }

    public Telefone[] getFones() {
        return fones;
    }

    public void setFones(Telefone[] fones) {
        this.fones = fones;
    }

}
