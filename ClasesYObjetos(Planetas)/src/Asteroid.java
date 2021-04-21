public class Asteroid {
    private String name;
    private String composition;
    private double earth_distance;
    protected double speed;
    public Asteroid (String nom, String comp, double ed, double sp){
        this.name=nom;
        this.composition=comp;
        this.earth_distance=ed;
        this.speed=sp;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
}
    public void setComposition(String composition){
        this.composition=composition;
}
    public String getComposition(){
        return this.composition;
}
    public void setEarth_distance(double earth_distance){
        this.earth_distance=earth_distance;
}
    public double getEarth_distance(){
        return this.earth_distance;
}
    public void setSpeed(double speed){
        this.speed=speed;
}
    public double getSpeed(){
        return this.speed;
}

}
