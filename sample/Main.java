package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Lab11");
        primaryStage.setScene(new Scene(root, 710, 470));
        primaryStage.show();
        Controller controller = loader.getController();
        Model model = new Model();
        View view = new View();
        controller.setModelAndView(model,view);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
