public class Producto {
    private String Producto;
    private String Marca;
    private double Precio;
    private int Existencias;

    public Producto(String Producto, String Marca, double Precio, int Existencias){
        this.Producto=Producto;
        this.Marca=Marca;
        this.Precio=Precio;
        this.Existencias=Existencias;
    }
    public void setProducto(String producto) { Producto = producto; }
    public String getProducto() { return Producto; }

    public void setMarca(String marca) { Marca = marca; }
    public String getMarca() { return Marca; }

    public void setExistencias(int existencias) { Existencias = existencias; }
    public int getExistencias() { return Existencias; }

    public void setPrecio(double precio) { Precio = precio; }
    public double getPrecio() { return Precio; }
}
