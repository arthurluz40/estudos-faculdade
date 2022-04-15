/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

/**
 *
 * @author ejmcc
 */
public class Aula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Operações aritmeticas sobre inteiros
        // Operadores Aritméticos: +, -, *, /, %
        // Funções Matemáticas: pow, sqrt e pi
        
        int vi1 = 5;
        int vi2 = 2;
        //Adicionar
        int viR = vi1+vi2;
        System.out.println(vi1 + " + " + vi2 + "= " + viR);
        //Subtrair
        viR = vi1-vi2;
        System.out.println(vi1 + " - " + vi2 + "= " + viR);
        //Multiplicar
        viR = vi1*vi2;
        System.out.println(vi1 + " * " + vi2 + "= " + viR);
        //Dividir - quociente
        viR = vi1/vi2;
        System.out.println(vi1 + " / " + vi2 + "= " + viR);
        //Dividir - resto
        viR = vi1%vi2;
        System.out.println(vi1 + " % " + vi2 + "= " + viR);
        //Raiza quadrada
        viR = (int)Math.sqrt(vi1);
        System.out.println("Raiz Quadrada:  " + viR);
        System.out.println("Raiz Quadrada:  " + Math.sqrt(vi1));
        //Potencia
        viR = (int)Math.pow(vi1,vi2);
        System.out.println("Raiz Quadrada:  " + viR);
        System.out.println("Raiz Quadrada:  " + Math.pow(vi1,vi2));
        //Valor do PI
        System.out.println("Valor do PI Inteiro " + (int)Math.PI);
        
    }
}
