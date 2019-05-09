/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

public class Operaciones {
    
    public int suma ( int numero1, int numero2 ){
        int total = 0;
        total = numero1 + numero2;
        return total;
    }
    public int resta ( int numero1, int numero2 ){
        int total = 0;
        total = numero1 - numero2;
        return total;
    }
    public int multiplicacion ( int numero1, int numero2 ){
        int total = 0;
        total = numero1 * numero2;
        return total;
    }
    
    public int division ( int numero1, int numero2 ){
        int total = 0;
        total = (int) (numero1*1.0/numero2*1.0);
        return total;
        
    }
    
}
