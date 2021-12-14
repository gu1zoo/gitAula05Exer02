/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exer01;

/**
 *
 * @author IFSC
 */
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.desenha();
        
        Quadrado quadrado = new Quadrado();
        quadrado.desenha();
        
        Triangulo triangulo = new Triangulo();
        triangulo.desenha();
        
        FiguraGeometrica fig = new FiguraGeometrica();
        fig.desenha();

        

        
    }
}
