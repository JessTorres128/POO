public class Vacuna {
    private String nombre;
    private String marca;
    private int dosis;

    public Vacuna(String nombre, String marca, int dosis) {
        this.nombre = nombre;
        this.marca = marca;
        this.dosis = dosis;
    }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getDosis() { return dosis; }
    public void setDosis(int dosis) { this.dosis = dosis; }

}
