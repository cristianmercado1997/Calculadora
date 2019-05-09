/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


public class Calculadora1 {
    
    public static void main(String[] args){
        operaciones opr = new operaciones();
        Scanner entrada = new Scanner (System.in);
        int numero1, numero2, total, opcion;
        
        boolean op= true;
        
        
        
        
        
        while(op){
      
        System.out.println("Menu Opciones");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. ");
        opcion = entrada.nextInt();
        
        if (opcion ==5 ){
            System.out.println("Fin del programa");
            break;
        }else{
            
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el valor 1. Valor:");
                    numero1= entrada.nexInt();
                    System.out.println("Ingrese el valor 1. Valor:");
                    numero2= entrada.nexInt();
                    total = opr.suma(numero1,numero2);
                    System.out.println("La suma es: " + total);
                    break;
                    
                case 2:
                    System.out.println("Ingrese el valor 1. Valor:");
                    numero1= entrada.nexInt();
                    System.out.println("Ingrese el valor 1. Valor:");
                    numero2= entrada.nexInt();
                    total = opr.resta(numero1,numero2);
                    System.out.println("La suma es: " + total);
                    break;
                case 3:
                    System.out.println("Ingrese el valor 1. Valor:");
                    numero1= entrada.nexInt();
                    System.out.println("Ingrese el valor 1. Valor:");
                    numero2= entrada.nexInt();
                    total = opr.multiplicacion(numero1,numero2);
                    System.out.println("La suma es: " + total);
                    break;
                    
                case 4:
                    System.out.println("Ingrese el valor 1. Valor:");
                    numero1= entrada.nexInt();
                    System.out.println("Ingrese el valor 1. Valor:");
                    numero2= entrada.nexInt();
                    total = opr.division(numero1,numero2);
                    System.out.println("La suma es: " + total);
                    break;
            }
        }
        
        }
    
   
}

