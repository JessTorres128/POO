import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Principal extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Ventana ventana=new Ventana();
        AnchorPane pane= ventana.construir();
        Scene scene=new Scene(pane);
        pane.setPrefWidth(600);
        pane.setPrefHeight(700);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Covid");
        primaryStage.setWidth(600);
        primaryStage.setHeight(700);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }


}
