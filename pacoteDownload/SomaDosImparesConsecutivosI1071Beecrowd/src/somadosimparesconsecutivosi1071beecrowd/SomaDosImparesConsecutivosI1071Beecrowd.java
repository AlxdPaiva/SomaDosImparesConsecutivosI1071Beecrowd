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
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();
        
        int soma = 0;
        
        // Garante que x seja o menor e y o maior
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        
        // Soma os números ímpares entre x e y
        for (int i = x + 1; i < y; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        
        System.out.println(soma);
    }
    
}
