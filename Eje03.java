/* Ejercicio 3
Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] array = new int[10];

        System.out.print("Introduzca valores en el array: ");

        for(int i=0; i<10; i++){

        array[i]=sc.nextInt();

        }

        for(int i=9; i>=0; i--){

            System.out.print(array[i]+" ");

        }

        sc.close();
    }
}
