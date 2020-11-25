/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;
    import java.util.Scanner;
/**
 *
 * @author Thiago
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {   
        Juros juros = new Juros();
        
        double resultado1;
        double resultado2;
        
        resultado1 = juros.jurosAno1(1000, 0.05, 10);
        resultado2 = juros.jurosAno2(1000, 0.05, 10);
        
        System.out.println("O valor após 10 anos é de: " + resultado1);
        System.out.println("O valor após 10 anos é de: " + resultado2);
    
    }
    
}
