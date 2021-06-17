import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Ventana {
    private AnchorPane pane;
    private Vacuna vacunaarray[]=new Vacuna[2];
    private int cont=0;

    public AnchorPane construir(){
        this.pane=new AnchorPane();
        Label lbl1=new Label("Vacunas");lbl1.setFont(new Font("Arial",30));lbl1.setTextFill((Color.web("#333")));lbl1.setLayoutX(10);lbl1.setLayoutY(10);

        Label lblnomv=new Label("Nombre Vacuna");lblnomv.setLayoutX(10);lblnomv.setLayoutY(50);
        TextField txtnom=new TextField();txtnom.setPrefSize(150,25);txtnom.setLayoutX(10);txtnom.setLayoutY(70);

        Label lblmarca=new Label("Marca Vacuna");lblmarca.setLayoutX(180);lblmarca.setLayoutY(50);
        TextField txtamarca=new TextField();txtamarca.setPrefSize(150,25);txtamarca.setLayoutX(180);txtamarca.setLayoutY(70);

        Label lbldosis=new Label("N. Dosis");lbldosis.setLayoutX(340);lbldosis.setLayoutY(50);
        TextField txtdosis=new TextField();txtdosis.setPrefSize(150,25);txtdosis.setLayoutX(340);txtdosis.setLayoutY(70);

        Button btninsertar=new Button("Insertar");btninsertar.setPrefSize(80,25);btninsertar.setLayoutX(500);btninsertar.setLayoutY(70);
        ListView listav=new ListView();listav.setPrefSize(580,250);listav.setLayoutX(10);listav.setLayoutY(120);
        this.pane.getChildren().addAll(lbl1,lblnomv,txtnom,lblmarca,txtamarca,lbldosis,txtdosis,btninsertar,listav);
//Eventos
        btninsertar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String nV=txtnom.getText();
                String MV=txtamarca.getText();
                String ND=txtdosis.getText();
                if (nV.equals("") || MV.equals("") ||ND.equals("")){
                   LaunchError("Favor de llenar todos los campos");
                }else{
                    try {
                        int conv=Integer.parseInt(ND);
                        Vacuna vacuna=new Vacuna(nV,MV,conv);
                        LaunchSuccess("La vacuna se ha creado correctamente");
                        txtnom.setText("");
                        txtamarca.setText("");
                        txtdosis.setText("");
                        listav.getItems().addAll(vacuna.getNombre());
                    }
                    catch (NumberFormatException error){
                        System.out.println(error.getMessage());
                        LaunchError("El número insertado no es valido");
                    }catch (IndexOutOfBoundsException e){
                        System.out.println(e.getMessage());
                        LaunchError("Se ha llegado al limite de vacunas permitidas");
                    }catch (Exception e){
                       LaunchError("Se ha producido un error inesperado");
                    }

                }//Else

            }//void
        });//action
        return pane;



    }
    public void LaunchError(String mensaje){
        Alert alerta=new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("Error");
        alerta.setContentText(mensaje);
        alerta.show();
    }
    public void LaunchSuccess(String mensaje){
        Alert alerta=new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Listo");
        alerta.setContentText(mensaje);
        alerta.show();
    }
}
