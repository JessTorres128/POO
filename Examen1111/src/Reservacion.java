public class Reservacion extends Hotel {
    public String fecha;
    protected int dias;
    protected double anticipo;
    public Reservacion(String fecha, int dias, double anticipo, String nombre, int ocupadas, int disponibles){
        super(nombre, ocupadas, disponibles);
        this.fecha=fecha;
        this.dias=dias;
        this.anticipo=anticipo;

    }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public String getFecha() { return fecha; }

    public void setDias(int dias) { this.dias = dias; }
    public int getDias() { return dias; }

    public void setAnticipo(double anticipo) { this.anticipo = anticipo; }
    public double getAnticipo() { return anticipo; }

    @Override
    public void ImprimirCapacidad(String nombre, int ocupadas, int disponibles) {
        System.out.println("El porcentaje de habitaciones disponibles es "+(100-((disponibles/(ocupadas+disponibles))*100))+"% (No funciona XD)");
    }
    public void ImprimirPagoEnPC(double anticipo){
        System.out.println("El porcentaje faltante por pagar es "+(100-((anticipo/800)*100))+"%");
    }
    public void ImprimirTicket(String nombre, String fecha, int dias, double anticipo ){
        System.out.println("TICKET:\n" +
                "------------------\n" +
                "Hotel: "+ nombre+"\n" +
                "Fecha: "+ fecha+"\n" +
                "Dias de estancia: "+dias+" dias de estancia\n" +
                "Anticipo: "+anticipo+"\n" +
                "Restante por pagar: "+(800-anticipo)+"\n" +
                "--------------------\n");
    }
}
