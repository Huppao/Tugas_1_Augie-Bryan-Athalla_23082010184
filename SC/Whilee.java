/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whilee;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Whilee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Masukkan Angka");
        int n = s.nextInt();
        int i = 1;
        while (i<=n){
            System.out.println(""+i);
            i+=2;
        
        }
        
    }
    
}
