/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author MORALES
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a,b,c; 
        
        //entrada de usuario
    System.out.println("ingrese primer numero:");
       Scanner entra1 = new Scanner(System.in);
       a = entra1.nextInt();
       System.out.println("ingrese segundo numero");
     Scanner entra2 = new Scanner(System.in); b= entra2.nextInt();
     System.out.println("ingrese tercer numero3");
    Scanner entra3 = new Scanner(System.in);c = entra3.nextInt();
   
 //acumulador
 int aux=0;
 //arreglo para los numeros leidos
    int[] w = new int[3];
    w[0]= a;
    w[1]=b;
    w[2]=c;
    //metodo de la burbuja
    for(int i =0; i<3; i++)
    {
     for(int j = i+1; j<3; j++)
     {
     if(w[i]<w[j]){
     aux = w[i];
     w[i] = w[j];
    w[j]=aux;
     }
     }
    }
         
    System.out.println("ordenados de manera decendente");
    //recorriendo el arreglo para imprimir cada valor
    for(int i =0; i<3; i++)
    {
         System.out.println(w[i]);
    }
    }//fin main
    }//fin 
    