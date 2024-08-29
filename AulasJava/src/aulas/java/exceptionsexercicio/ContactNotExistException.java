/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.exceptionsexercicio;

/**
 *
 * @author Welton
 */
public class ContactNotExistException extends Exception{
    private String nameContact;

    public ContactNotExistException(String nameContact) {
        this.nameContact = nameContact;
    }
    
    

    @Override
    public String getMessage() {
         return "Contact "+ nameContact+ " Not exist in the agenda";
    }
    
}
