/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfor;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Masukkan Angka");
        int i = s.nextInt();
        for (int n = 1; n <= i; n++){
            if(n%2==1){
                System.out.println(""+1);
            }
        }
            
    }
    
}
