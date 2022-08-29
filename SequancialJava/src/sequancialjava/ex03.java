/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sequancialjava;
import java.util.Scanner;
/**
 *
 * @author Nosferas
 */
public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num1 = scan.nextInt();
        System.out.println("Digite um numero: ");
        int num2 = scan.nextInt();
        
        int calc = num1 + num2;
        System.out.println("A soma entre " + num1 + " e " + num2 + " é igual a " + calc);
    }
}
