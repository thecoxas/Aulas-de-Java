/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.relacionamentos;

/**
 *
 * @author Welton
 */
public class TesteContato {

    public static void main(String[] args) {
        Contato contato = new Contato();
        Endereco end = new Endereco();
        Telefone fone = new Telefone();
        Telefone fone2 = new Telefone();

        end.setNameStreet("Rua mir4");
        end.setNumberhouse("Lv 120");
        end.setCep("555-666");
        end.setCity("Valley Bicheon");
        end.setState("Bicheon");

        fone.setType("Cell phone");
        fone.setDdd("94");
        fone.setNumber("9999-9999");

        fone2.setType("HearPhone");
        fone2.setDdd("62");
        fone2.setNumber("8888-8888");

        Telefone[] fones = new Telefone[2];
        fones[0] = fone;
        fones[1] = fone2;
        
        contato.setName("Artemis");
        contato.setAddress(end);
        contato.setFones(fones);
        
        System.out.println(contato.getName());

        if (contato != null && contato.getAddress() != null) {
            System.out.println(contato.getAddress().getCity());
        }
        /*if(contato != null && contato.getFone() != null){
           
        }*/
        if (contato != null && contato.getFones() != null) {
            for (Telefone f : contato.getFones()) {
                System.out.println(f.getDdd() + " " + f.getNumber());
            }
        }

    }
}
