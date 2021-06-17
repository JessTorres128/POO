import java.util.Date;

public class Persona {
    private String nombre;
    private String curp;
    private String fecha;
    private Vacuna vacuna;

    public Persona(String nombre, String curp, Vacuna vacuna) {
        this.nombre = nombre;
        this.curp = curp;
        this.vacuna = vacuna;
        Date fecha1=new Date();
        this.fecha=fecha1.getYear()+"/"+fecha1.getMonth()+"/"+fecha1.getDay();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCurp() { return curp; }
    public void setCurp(String curp) { this.curp = curp; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public Vacuna getVacuna() { return vacuna; }
    public void setVacuna(Vacuna vacuna) { this.vacuna = vacuna; }
}
