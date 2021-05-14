/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3ejercico5;
import java.util.Scanner;
/**
 *
 * @author marti
 */
public class Tarea3Ejercico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        int mayor = 0;
        int menor = 0;

        int n=1;
        for(int i =1;i>=num;i++){
        n=n+i;
        if(i>mayor){mayor=i;}
        if(i<menor){menor=i;}
        
        }
        int a=n/num;
        int dif =mayor-menor;
        System.out.println("El numero mayor es " + mayor);
        System.out.println("El numero menor es "+ menor);
        System.out.println("La diferencia entre el mayor y el menor es "+dif);
        System.out.println("El promedio de la suma de estos numeros es "+a);
        
        
    }
    
}
