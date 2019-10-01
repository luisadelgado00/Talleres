package excepciones;
public class ControlExcepcion extends Exception {

    public ControlExcepcion() {
    }
    public String menorDiez(){
        
        return "Error, el numero debe ser mayor que 10";
    }
}
