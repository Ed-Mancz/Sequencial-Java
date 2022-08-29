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
public class ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Infomer metros: ");
        float m = scan.nextFloat();
        float c = m * 100;
        System.out.println("Metros: " + m + "\nCentimetros: " + c);
    }
}
