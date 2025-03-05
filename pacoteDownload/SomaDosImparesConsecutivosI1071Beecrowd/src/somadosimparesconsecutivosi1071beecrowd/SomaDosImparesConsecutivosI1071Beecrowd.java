/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package somadosimparesconsecutivosi1071beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class SomaDosImparesConsecutivosI1071Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int X = teclado.nextInt();
        int Y = teclado.nextInt();
        int maior = 0;
        int menor = 0;
        int somaimpar = 0;
        
        if (X > Y) {
            maior = X;
            menor = Y;
        } else {
            maior = Y;
            menor = X;
        }
        
        for (int c = menor; c <= maior; c++) {
            if (c % 2 == 1) {
                somaimpar += c;
            }
        }
        System.out.println(somaimpar);
    }
    
}
