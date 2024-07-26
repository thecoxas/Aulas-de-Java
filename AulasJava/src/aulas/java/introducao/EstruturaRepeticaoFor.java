/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.introducao;

/**
 *
 * @author Welton
 */
public class EstruturaRepeticaoFor {

    public static void main(String[] args) {
        /* A estrutura de repetição for é usada quando o número de iterações é conhecido antecipadamente.
        Sintaxe:
        for (inicialização; condição; atualização) {
        // bloco de código a ser repetido
        }
        Inicialização: esta etapa é executada apenas uma vez no início no laço e é a etapa onde você pode criar
        e inicializar uma variável que vai ser usada para o controle do laço.
        
        Condição: esta etapa ocorre antes de cada iteração do laço e é a etapa onde uma
        condição é verificada. Se essa condição for verdadeira, o loop continua a ser executado.
        Se a condição for falsa, o loop é encerrado.
        
        Atualização: esta etapa é executada após cada iteração do laço. Normalmente, nesta
        etapa colocamos um código que altere o valor da variável criada na etapa de inicialização,
        sendo que as operações mais comuns são o decremento e o incremento dessa variável.
         */
        for (int i = 1; i <= 10; i++) {
            System.out.println(" i= " + i);
            
        }
        for (int j = 10; j > 0; j--) {
            System.out.println(" j= " + j);
        }

    }

}
