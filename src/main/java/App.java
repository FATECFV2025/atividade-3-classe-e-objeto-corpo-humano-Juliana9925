package main.java;
import java.util.Scanner;

public class App {


        public static void main(String[] args) {
    
           
            Corpo_Humano c1 = new Corpo_Humano(70, 0.07f);
    
           
            System.out.println("Peso: " + c1.getPeso() + " kg");
            System.out.println("Altura: " + c1.getAltura() + " m³");
            System.out.println("Massa: " + c1.getMassa() + " kg/m³");
    
           
            c1.setMassa(75);  
            c1.setAltura(1.75f);  
    
          c1.setPeso(70);
            System.out.println("\nApós alteração:");
            System.out.println("Peso: " + c1.getPeso() + " kg");
            System.out.println("Altura: " + c1.getAltura() + " m³");
            System.out.println("Massa: " + c1.getMassa() + " kg/m³");
            System.out.println("IMC: " + c1.calcularIMC() + " ");

        }
    }
    //