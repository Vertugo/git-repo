package sample;

import javafx.scene.control.Alert;

/**
 * Created by Alex on 31.05.2016.
 */
public class View {
    public static final String INCORRECT_FILE = "Not xml file!";
    public static final  String SOME_PROBLEM="There some problem in program,try to restart";

    public void createAlert(String message){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Error");
        alert.setContentText(message);
        alert.showAndWait();
    }
}
