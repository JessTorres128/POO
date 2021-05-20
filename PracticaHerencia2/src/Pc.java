public class Pc extends Dispositivo {
    public String marcateclado;

    public Pc(String marcateclado, String nombre, double memoriaram, String procesador){
        super(nombre, memoriaram, procesador);
        this.marcateclado=marcateclado;
    }

    public void setMarcateclado(String marcateclado) { this.marcateclado = marcateclado; }
    public String getMarcateclado() { return marcateclado; }

    public static void EncenderWebCam(){
        System.out.println("WebCam Encendida :p");
    }

    @Override
    public void EliminarCache() {
        super.EliminarCache();
        System.out.println("Se ha eliminado la cache del Pc exitosamente");
    }
}
