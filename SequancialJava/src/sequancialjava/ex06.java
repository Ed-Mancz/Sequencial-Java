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
public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Base: ");
        float b = scan.nextFloat();
        System.out.println("Altura");
        float a = scan.nextFloat();
        
        System.out.println("A area é: " + b * a);
    }
}
