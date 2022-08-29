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
public class ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float total = 0f;
        for(int i = 0; i < 4; i++){
            System.out.println("Digite um numero: ");
            float num = scan.nextFloat();
            total += num;
        }
        System.out.println("A media das notas é: " + total / 4);
    }
    
    
}
