public class Dispositivo {
private String nombre;
private double memoriaram;
public String procesador;


public Dispositivo(String nombre, double memoriaram, String procesador){
    this.nombre=nombre;
    this.memoriaram=memoriaram;
    this.procesador=procesador;
    }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }

    public void setMemoriaram(double memoriaram) { this.memoriaram = memoriaram; }
    public double getMemoriaram() { return memoriaram; }

    public void setProcesador(String procesador) { this.procesador = procesador; }
    public String getProcesador() { return procesador; }


    public void Encender(){
    System.out.println("Se ha encendido el dispositivo");
    }
    public void Apagar(){
    System.out.println("Se ha apagado el dispositivo");
    }
    public void EliminarCache(){ System.out.println("Se ha eliminado la cache exitosamente"); }

}
