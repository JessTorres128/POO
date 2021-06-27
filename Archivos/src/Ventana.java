import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;

public class Ventana {
    private  String[] renglones;
    private TextArea txtArea;
    private ListView lista;
    private Stage stage;
    private String[] renglonarray;
    public Ventana(Stage stage){
        this.stage=stage;

    }
    public AnchorPane crearVentana(){
        AnchorPane pane=new AnchorPane();
        pane.setStyle("-fx-background-image:url(./Imagenes/gato.jpg);-fx-background-size:100% 100%");
        pane.setPrefSize(900,600);
        Menu menu=new Menu("Archivo");
        MenuItem open=new MenuItem("Abrir");
        MenuItem save=new MenuItem("Guardar");
        MenuItem exit=new MenuItem("Salir");
        menu.getItems().addAll(open,save,exit);

        MenuBar menubar=new MenuBar();
        menubar.setPrefSize(900,25);
        menubar.setLayoutX(0);
        menubar.setLayoutY(0);
        menubar.getMenus().addAll(menu);

        open.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FileChooser chooser=new FileChooser();
                chooser.setTitle("Elige el archivo");
                File file=chooser.showOpenDialog(stage);
                if(file!=null){
                    LeerArchivo(file.getAbsolutePath());
                    System.out.println(file.getTotalSpace());

                }

            }
        });
        txtArea=new TextArea();
        txtArea.setPrefSize(200,200);
        txtArea.setLayoutX(10);
        txtArea.setLayoutY(50);

        lista=new ListView();lista.setPrefSize(230,400);lista.setLayoutX(10);lista.setLayoutY(90);
        TextField textField=new TextField();textField.setPrefSize(150,20);textField.setLayoutX(10);textField.setLayoutY(50);textField.setPromptText("Elemento a buscar");

        Button btnBuscar=new Button("Search");btnBuscar.setPrefSize(80,20);btnBuscar.setLayoutX(165);btnBuscar.setLayoutY(50);
        btnBuscar.setStyle("-fx-background-color:#04d14c;-fx-background-radius: 5em;-fx-text-fill:white");

        Label simboloel=new Label("H");simboloel.setFont(new Font("Arial",150));simboloel.setStyle("-fx-text-fill:#111");
        simboloel.setLayoutX(450);simboloel.setLayoutY(80);

        Label nombreel=new Label("Hidrogeno");nombreel.setFont(new Font("Arial",30));nombreel.setStyle("-fx-text-fill:#0489d1");
        nombreel.setLayoutX(430);nombreel.setLayoutY(250);

        ListView listaprop=new ListView();listaprop.setPrefSize(250,200);listaprop.setLayoutX(430);listaprop.setLayoutY(300);
        pane.getChildren().addAll(menubar,lista,textField,btnBuscar,simboloel,nombreel,listaprop);
        LeerArchivo("./src/Elementos.csv");

        //Eventos_---------------------------------------------------------------------------
        lista.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(lista.getSelectionModel().getSelectedIndex()> -1 ){
                    int index=lista.getSelectionModel().getSelectedIndex();
                    //System.out.println(renglones[(index+2)]);
                    String[] elemento=renglones[(index+2)].split(",");
                    simboloel.setText(elemento[2]);
                    nombreel.setText(elemento[1]);
                    listaprop.getItems().clear();
                    String[] arraypropiedades=renglones[1].split(",");
                    String[] arrayval=renglones[(index+2)].split(",", arraypropiedades.length);
                    for (int x=3; x< arraypropiedades.length;x++){
                        listaprop.getItems().add(arraypropiedades[x]+"      "+arrayval[x]);

                    }
                }
            }
        });



        return pane;
    }

    public void LeerArchivo(String ruta){
        File file=new File(ruta);
        try {
            BufferedReader br=new BufferedReader(new FileReader(file));
            String renglon;
            String todo="";
            while ((renglon= br.readLine()) !=null ){
                todo=todo+"\n"+ renglon;
            }
            renglones=todo.split("\n");

            for (int x=2; x<renglones.length; x++){
                 renglonarray=renglones[x].split(",");
               lista.getItems().add(renglonarray[0]+" - "+ renglonarray[1]);
            }

            System.out.println(renglones[1]);
           // txtArea.setText(todo);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            Alert alerta=new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("error");
            alerta.setContentText("No se pudo leer el archivo");
            alerta.show();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
