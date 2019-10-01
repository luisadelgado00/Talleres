
package lista_array;


//clase que define las características del producto
public class Producto implements Comparable<Producto>{ 
private String nombre; 
private int cantidad; 

//constructor de la clase producto

public Producto(String s, int i) { 
nombre = s; 
cantidad = i; 
                                 } 
//método de la clase object
@Override
public String toString(){ 
return ("Nombre: "+nombre+" Cantidad: "+cantidad)+"\n"; 
} 

//métodos de encapsulamiento
public String getNombre() { 
return this.nombre; 
} 


    @Override
    public int compareTo(Producto o) {
        return nombre.compareTo(o.getNombre());
    }
} 


