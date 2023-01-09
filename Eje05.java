/* Ejercicio 5
Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] array = new int[10];

        int max=0;
        int min=999999999;

        System.out.print("Introduzca valores en el array: ");

        for(int i=0; i<10; i++){

            array[i]=sc.nextInt();

            if(array[i]>max){
                max=array[i];
            }

            if(array[i]<min){
                min=array[i];
            }

        }

        for(int i=0; i<10; i++){
            System.out.print(i+" "+array[i]);
            if(array[i]==max){
                System.out.print(" máximo");
            }

            if(array[i]==min){
                System.out.print(" mínimo");
            }

            System.out.println(" ");
        }

        sc.close();
    }
}
