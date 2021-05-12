public class ZonaGeografica {
private String nombre;
private float superficie;
public ZonaGeografica(String nombre, float superficie){
this.nombre=nombre;
this.superficie=superficie;
}
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNombre() { return nombre; }

    public void setSuperficie(float superficie) { this.superficie = superficie; }

    public float getSuperficie() { return superficie; }
}
