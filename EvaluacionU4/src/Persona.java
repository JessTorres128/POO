public abstract class Persona {
    private String Nombre;
    private String Apellido;
    private int Edad;
public Persona(String Nombre, String Apellido, int Edad){
    this.Nombre=Nombre;
    this.Apellido=Apellido;
    this.Edad=Edad;
}
    public void setNombre(String nombre) { Nombre = nombre; }
    public String getNombre() { return Nombre; }

    public void setApellido(String apellido) { Apellido = apellido; }
    public String getApellido() {  return Apellido; }

    public void setEdad(int edad) {Edad = edad; }
    public int getEdad() { return Edad; }
}
