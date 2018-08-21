package claseobject;
public class Empleado {
    private String nombre;
    private double sueldo;
    
    Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString(){
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
    @Override
    public booblean equals(Object obj){
        if (obj==null){
            return false;
        }
        if (obj instanceof Empleado){
            Empleado emp = (Empleado) obj;
            if (nombre.equals(emp.nombre)&&)Do
        }
    }
    
}
public class ClaseObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
