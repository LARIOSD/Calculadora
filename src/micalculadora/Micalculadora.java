
package micalculadora;

import java.util.Scanner;


public class Micalculadora {

  
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int a;
        int b;
        
        System.out.println("Ingrese primer numero:");
        a = teclado.nextInt();
        System.out.println("Ingrese segundo numero: ");
        b = teclado.nextInt(); 
        
        operaciones c= new operaciones(a,b);
               
        try{
            System.out.println("Division= "+c.div(a, b));
        }catch(error e){
            System.out.println(e.getLocalizedMessage());
            
        }finally{
        
        System.out.println("Suma = " + c.suma(a, b));
        System.out.println("Resta = " + c.resta(a, b));
        System.out.println("Multiplicacion = " +c.multi(a, b));   
    }
    
}
    
}
