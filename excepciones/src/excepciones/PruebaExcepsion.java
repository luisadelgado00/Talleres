package excepciones;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
public class PruebaExcepsion{  
public static void main(String args[]){
formatoNumero();
desborde();
aritmetico();
division();
}   
public static void formatoNumero(){
 
 int numero;   
 String cadena="  1";   
 	try{   
    		numero = Integer.parseInt(cadena);   
 	}   
 catch(NumberFormatException ex){   
 System.out.println("No es un número, es una cadena de texto."+ex.getMessage());   
    
 	}   
} 
public static void desborde(){
 try {
 int v[];   
    v = new int[3];
	for(int i =0; i<5;i++){
            v[i]=i;
}                 
    } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("La cantidad de numeros es mayor a la capacidad para guardar");
    }
 	}
public static void aritmetico(){
try { 
int numero=5, resultado;
resultado= numero/0;
              
    } catch (ArithmeticException e) {
        System.out.println("No se puede divirdir por cero");
    }

}
public static void division(){
    try {
    int numero, Divisor, operacion;
    numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un entero "));
    Divisor=Integer.parseInt(JOptionPane.showInputDialog("Digite el divisor "));
    if (numero<10 || Divisor<10) {
        throw new ControlExcepcion();
        }
    operacion=numero/Divisor;
    JOptionPane.showMessageDialog(null, "El resultado de la division "+numero+" / "+Divisor+" es:\n "+operacion);
    }  
    catch (NumberFormatException e) {
       System.out.println("No es posible dividir por un caracter, ni una cadena de texto. \nEvalue los numeros ingresados");
    }
    catch (ArithmeticException e) {
        System.out.println("No es posible dividir por cero. \nEvalue los numeros ingresados");
    }
    catch (HeadlessException e) {
        System.out.println("Este programa necesita de un ingreso numerico desde teclado, monitor o raton. \nEvalue el entorno desde el cual esta ejecutando");
    }
    catch (ControlExcepcion e) {
        System.out.println(e.menorDiez()); 
        
    }
    finally{}
}
}

