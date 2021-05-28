public class Hotel {
    public String nombre;
    private int ocupadas;
    private int disponibles;
    public Hotel(String nombre, int ocupadas, int disponibles){
        this.nombre=nombre;
        this.ocupadas=ocupadas;
        this.disponibles=disponibles;

    }
    public void setNombre(String nombre) { nombre = nombre; }
    public String getNombre() { return nombre; }

    public void setOcupadas(int ocupadas) { ocupadas = ocupadas; }
    public int getOcupadas() { return ocupadas; }

    public void setDisponibles(int disponibles) { disponibles = disponibles; }
    public int getDisponibles() { return disponibles; }

    public void ImprimirCapacidad(String nombre, int ocupadas, int disponibles){
        System.out.println("El numero de habitaciones del hotel "+nombre+" es igual a "+(ocupadas+disponibles));
    }


}
