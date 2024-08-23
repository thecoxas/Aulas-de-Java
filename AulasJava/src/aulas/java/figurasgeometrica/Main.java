/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.java.figurasgeometrica;

/**
 *
 * @author Welton
 */
public class Main {

    public static void main(String[] args) {
        
        Quadrado quadrado = new Quadrado(5);
        quadrado.setNome("Quadrado");
        
        Circulo circulo = new Circulo(3);
        circulo.setNome("Circulo");
        
        Triangulo triangulo = new Triangulo(4, 8);
        triangulo.setNome("Triangulo");
        
        Cubo cubo = new Cubo(4);
        cubo.setNome("Cubo");
        
        Cilindro cilindro = new Cilindro(6, 2);
        cilindro.setNome("Cilindro");
        
        Piramide piramide = new Piramide(3, 4, 2, 4, quadrado);
        piramide.setNome("Piramide");
        
        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = quadrado;
        figuras[1] = circulo;
        figuras[2] = triangulo;
        figuras[3] = cubo;
        figuras[4] = cilindro;
        figuras[5] = piramide;
        
        for (FiguraGeometrica figura : figuras) {
            System.out.println("-------------------------------------------");
            System.out.println(figura.getNome());
            
            if(figura instanceof Figura2D){
                Figura2D f2d = (Figura2D) figura;
                System.out.println(f2d.calcularArea());
            }
            if(figura instanceof Figura3D){
                Figura3D f3d = (Figura3D) figura;
                System.out.println(f3d.calcularArea());
                System.out.println(f3d.calcularVolume());
            }
        }
    }
}
