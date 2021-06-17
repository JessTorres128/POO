import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Principal extends Application {
    //1 Heredar de aplication
    //2 Implementar el metodo abstract
    //3 Crear el tipo de acomodo
    //4 Crear la escena
    //5 Meter la escena en el escenario
    //6 Dimensiones del escenario
    //7 Mostrar el escenario
    //8 Lanzar la ventana

    public static void main(String[] args) {
    launch(args);
    }

    @Override
    public void start(Stage ventana) throws Exception {
        AnchorPane acomodo=new AnchorPane();
        acomodo.setStyle("-fx-background-color:#111111");
        Label label1=new Label("Hola FX");
        label1.setLayoutX(150);label1.setLayoutY(150);
        label1.setPrefSize(200,50);
        label1.setFont(new Font("Arial",30));
        label1.setTextFill(Color.web("#229116"));
        acomodo.getChildren().add(label1);

        TextField txt1=new TextField();
        txt1.setLayoutX(150);txt1.setLayoutY(190);
        txt1.setPrefSize(200,50);
        acomodo.getChildren().add(txt1);

        Button btn1=new Button("Aceptar");
        btn1.setLayoutX(150);btn1.setLayoutY(250);
        btn1.setPrefSize(200,50);
        btn1.setStyle("-fx-background-color:#229116;-fx-text-fill:#FFFFFF;-fx-border-radius:25px");
        acomodo.getChildren().add(btn1);
        //acomodo.setPrefWidth(500);
        //acomodo.setPrefHeight(500);
        Scene escena1=new Scene(acomodo);

        ventana.setWidth(500);
        ventana.setHeight(500);
        ventana.setScene(escena1);
        ventana.setTitle("Hola mundo");
        ventana.show();






    }
}
