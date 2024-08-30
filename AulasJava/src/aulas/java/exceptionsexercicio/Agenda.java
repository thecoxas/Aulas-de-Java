/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.exceptionsexercicio;

/**
 *
 * @author Welton
 */
public class Agenda {

    private Contact[] contacts;

    public Agenda() {
        contacts = new Contact[5];
    }

    public void addContactAgenda(Contact c) throws AgendaFullException {
        boolean full = true;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = c;
                full = false;
                break;
            }
            if (full) {
                throw new AgendaFullException();
            }

        }
    }

    public int queryByName(String name) throws ContactNotExistException {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                if (contacts[i].getName().equalsIgnoreCase(name)) {
                    return i;
                }

            }
        }
        throw new ContactNotExistException(name);
    }

    @Override
    public String toString() {
        String s = "";
        for (Contact c : contacts) {
            if (c != null) {
               s += c.toString() +"\n";
            }

        }
        return s;
    }

}
