package Animales;

import java.awt.*;

public class Perro extends Animal{
    private String Raza;
    public Perro(Color color, double peso, String Raza){
        super(color, peso);
        this.Raza=Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public String getRaza() {
        return Raza;
    }
    public void Ladrar(){
        System.out.println("WOWWOWOWOWOWOWOWOWOWOWOWOWOWOWOWOWOWOWOWOWOW");
    }
}
