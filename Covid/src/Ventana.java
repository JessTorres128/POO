import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Ventana {
    private AnchorPane pane;
    private Vacuna vacunaarray[]=new Vacuna[2];
    private Persona personaarray[]=new Persona[3];
    private int cont=0;
    private int contP=0;

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
        ListView listav=new ListView();listav.setPrefSize(330,250);listav.setLayoutX(10);listav.setLayoutY(120);
        ListView listaP=new ListView();listaP.setPrefSize(330,250);listaP.setLayoutX(10);listaP.setLayoutY(380);


        Label lblnomP=new Label("Nombre persona");lblnomP.setLayoutX(350);lblnomP.setLayoutY(120);
        TextField txtnomP=new TextField();txtnomP.setPrefSize(220,25);txtnomP.setLayoutX(350);txtnomP.setLayoutY(150);

        Label lblcurp=new Label("Curp");lblcurp.setLayoutX(350);lblcurp.setLayoutY(190);
        TextField txtcurp=new TextField();txtcurp.setPrefSize(220,25);txtcurp.setLayoutX(350);txtcurp.setLayoutY(210);

        Label lblcombo=new Label("Sexo");lblcombo.setLayoutX(350);lblcombo.setLayoutY(245);
        ComboBox combo=new ComboBox();
        combo.getItems().addAll("Hombre","Mujer", "Mujer Trans", "Hombre Trans", "No Binario", "Otro");
        combo.setPrefSize(220,25);combo.setLayoutX(350);combo.setLayoutY(280);

        Button btnInsertarP=new Button("Insertar");btnInsertarP.setPrefSize(80,25);btnInsertarP.setLayoutX(350);btnInsertarP.setLayoutY(315);
        Button btnVerDetalles=new Button("Ver detalles");btnVerDetalles.setPrefSize(200,25);btnVerDetalles.setLayoutX(360);btnVerDetalles.setLayoutY(600);

        this.pane.getChildren().addAll(btnVerDetalles,listaP,lbl1,lblnomv,txtnom,lblmarca,txtamarca,lbldosis,txtdosis,btninsertar,listav, lblnomP, txtnomP, lblcurp,txtcurp,lblcombo,combo,btnInsertarP);
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
                        vacunaarray[cont]=vacuna;
                        cont++;
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
        btnInsertarP.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String nombrep=txtnomP.getText();
                String curp=txtcurp.getText();
                if (nombrep.equals("")|| curp.equals("")){
                    LaunchError("Favor de llenar todos los campos");
                }try {
                    int pos=listav.getSelectionModel().getSelectedIndex();
                    String sex=combo.getSelectionModel().getSelectedItem().toString();
                    personaarray[contP] =new Persona(nombrep,curp,vacunaarray[pos],sex);
                    listaP.getItems().addAll(personaarray[contP].getNombre());
                    contP++;
                    LaunchSuccess("Se ha agregado a la persona correctamente");
                    txtnomP.setText("");
                    txtcurp.setText("");
                }catch (ArrayIndexOutOfBoundsException e){
                    LaunchError("No se ha seleccionado una vacuna");
                }catch (NullPointerException e){
                    LaunchError("Selecciona un sexo");
                }catch (IndexOutOfBoundsException e){
                    LaunchError("Se ha llegado al limite de personas permitidas");
                }catch (Exception e){
                    LaunchError("Ha ocurrido un error inesperado");
                }
            }
        });
        btnVerDetalles.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    int pos=listaP.getSelectionModel().getSelectedIndex();
                    LaunchSuccess("La persona "+ personaarray[pos].getNombre()+" registrada el "+personaarray[pos].getFecha()+" " +
                            "tendrá la vacuna "+personaarray[pos].getVacuna().getNombre()+" de "+personaarray[pos].getVacuna().getDosis()+" dosis (Se bugea la fecha)");
                }catch (ArrayIndexOutOfBoundsException e){
                    LaunchError("Selecciona una persona de la lista");
                }

            }
        });

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
