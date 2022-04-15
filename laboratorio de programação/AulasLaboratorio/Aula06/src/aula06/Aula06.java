/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;
import java.util.Scanner;
/**
 *
 * @author ejmcc
 */
import java.util.Scanner;
public class Aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Comando de entrada de dados
        // Biblioteca Scanner
        
        int v1 = 0;
        float v2 = 0;
        double v3 = 0;
        String nome = "";
        
        Scanner lerTeclado = new Scanner(System.in);
        
        //Lendo os dados do Teclado
        System.out.print("Digite um numero inteiro: ");
        v1 = lerTeclado.nextInt();
        System.out.print("Digite um numero real: ");
        v2 = lerTeclado.nextFloat();
        System.out.print("Digite um numero real: ");
        v3 = lerTeclado.nextDouble();
        //Limpando o teclado
        lerTeclado.nextLine();
        System.out.print("Digite seu nome: ");
        nome = lerTeclado.nextLine();
        
        //Mostrando dados lidos
        System.out.println("Numero inteiro: " + v1);
        System.out.println("Numero real float: " + v2);
        System.out.println("Numero real double: " + v3);
        System.out.println("Nome: " + nome);        
        
        
    }
}
