public class Planet {
    private String name;
    private double sun_distance;
    private String composition;
    private int orbit_days;
    public double mass;
    public Planet(String nombre, double d, String c, int od, double m){
        this.name=nombre;
        this.sun_distance=d;
        this.composition=c;
        this.orbit_days=od;
        this.mass=m;
    }
    //SET Poner o Asignar
    //GET Obtener o Traer
    //cambiar el nombre del planeta
    public void setName(String nuevoNombre){
        this.name=nuevoNombre;
    }
    public String getName(){
        return this.name;
    }
    public void setSun_distance(double sun_distance){
this.sun_distance=sun_distance;
    }
    public double getSun_distance(){
        return this.sun_distance;
    }
    public void setComposition(String composition){
        this.composition=composition;
    }
    public String getComposition(){
        return this.composition;
    }
    public void setOrbit_days(int orbit_days){
        this.orbit_days=orbit_days;
    }
    public int getOrbit_days(){
        return this.orbit_days;
    }
    public void setMass(int mass){
        this.mass=mass;
    }
    public double getMass() {
        return mass;
    }
}
