package Animales;

import java.awt.*;

public class Ave extends Animal {//extends significa hacer la herencia
    private String tipo;
    public Ave(Color color, double peso, String tipo){
        super(color, peso);//Mandar a llamar al constructor
        this.tipo=tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    public void volar(){
        System.out.println("Ando volando");
    }

}
