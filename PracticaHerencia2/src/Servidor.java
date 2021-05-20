import java.util.Scanner;

public class Servidor extends Pc{
public String ZonaHoraria;
Scanner scanner1=new Scanner(System.in);
public Servidor(String ZonaHoraria, String marcateclado, String nombre, double memoriaram, String procesador){
    super(marcateclado, nombre, memoriaram, procesador);
}

    public void setZonaHoraria(String zonaHoraria) { ZonaHoraria = zonaHoraria; }
    public String getZonaHoraria() { return ZonaHoraria; }

    public void AumentarRAM(double memoriaram){
        System.out.println("Cuánta memoria RAM le deseas aumentar?");
        double RAMA=scanner1.nextDouble();
        memoriaram=memoriaram+RAMA;
        System.out.println("La memoria RAM es: "+memoriaram);
    }

    @Override
    public void EliminarCache() {
        super.EliminarCache();
        System.out.println("Se ha eliminado la cache del servidor exitosamente");
    }
}
