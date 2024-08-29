/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.exceptionsexercicio;

/**
 *
 * @author Welton
 */
public class AgendaFullException extends Exception{

    @Override
    public String getMessage() {
         return "Agenda is already full";
    }
    
}
