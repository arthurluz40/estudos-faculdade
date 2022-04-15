/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto.lista.pkg1.exe1;
import java.util.Scanner;

/**
 *
 * @author ALUNO
 */
public class ProjetoLista1Exe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaraçãon das variaveis
        // TODO code application logic here
        float raio = 0;
        float altura = 0;
        float areaBase = 0;
        float areaLata = 0;
        float areaLado = 0;
        float custoLata = 0;
        
        
        
        //Scaner de leiturA
        Scanner leia = new Scanner(System.in);
        //Entrada de dados 
        System.out.print("Digite o raio da Lata: ");
        raio =leia.nextFloat();
        System.out.print("Digite a altura da lata: ");
        altura= leia.nextFloat();
        
        
        //Processamento
        areaBase = (float)(Math.PI * raio * raio * 2);
        areaLado = (float)(2* Math.PI * raio * altura);
        areaLata = areaBase + areaLado;
        custoLata = areaLata * 155;
        
        //Saida
        System.out.println("O custo da Lata e R$" + custoLata);
        
        
       
               
               
        
    }
     float base=0;
     
             
}
