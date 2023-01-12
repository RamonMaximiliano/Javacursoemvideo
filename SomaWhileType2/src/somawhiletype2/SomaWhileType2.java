/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somawhiletype2;

import java.util.Scanner;

/**
 *
 * @author ramon
 */
public class SomaWhileType2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        n = 0;
        Scanner board = new Scanner(System.in);
        String contador;
        contador = "s";
        System.out.println("Digite um numero:");
        while (contador.equals("s")){
        n += board.nextInt();
        System.out.println("Voce quer continuar? [S/N]");
        contador = board.next();
        if(contador.equals("s")){
            System.out.println("Digite um novo numero:");
        }else{
            System.out.println("Thanks for playing!");
        };    
        };
        System.out.println("A soma de todos é: " + n); 
        // TODO code application logic here
    }
}
