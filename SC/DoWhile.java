/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgdo.pkgwhile;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Masukkan Angka");
        int n = s.nextInt();
        int counter = 1;
        do{
            System.out.println(counter+"");
            counter  +=2;
            
        }while (n>=counter);
    }
    
}
