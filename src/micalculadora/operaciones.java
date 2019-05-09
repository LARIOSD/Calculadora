
package micalculadora;


public class operaciones {
    
    private int a;
    private int b;

    public operaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int suma(int a,int b){
        int total = 0;
        
        total= a+b;
        
        return total;
    }
    
    public int resta(int a, int b){
        int total = 0;
        
        total= a-b;
        
        return total;  
    }
    
    public int multi(int a, int b){
        int total = 0;
        
        total = a*b;
        
        return total;
    }
    
    public float div(int a, int b)throws error{
        float total = 0;
        
        if(b==0){
            throw new error("No se puede dividir por cero");
        }
        total = a/b;
        
        return total;
    }
    
}
