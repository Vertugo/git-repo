package sample;

import entity.DiplomaList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.web.HTMLEditor;
import javafx.stage.FileChooser;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    TextField fileName;

    @FXML
    Button fileChoose;

    @FXML
    HTMLEditor editor;

    @FXML
    ComboBox themeChoose;

    FileChooser fileChooser = new FileChooser();

    Model model;
    View view;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        editor.setDisable(true);
        fileChooser.setInitialDirectory(new File("C"));
    }

    @FXML
    private void chooseDirectory(){
        File file = fileChooser.showOpenDialog(fileChoose.getScene().getWindow());
        if(file!=null){
            editor.setHtmlText("");
            themeChoose.getItems().clear();
            try{
                checkFileName(file.getAbsolutePath());
                fileName.setText(file.getAbsolutePath());
                try {
                    model.createList(file);
                    fillThemes();
                }catch (JAXBException e){}
            }catch (IllegalArgumentException e){
                editor.setHtmlText(view.INCORRECT_FILE);
            }catch (Exception e){
                view.createAlert(view.SOME_PROBLEM);
            }
        }
    }

    @FXML
    private void chooseTheme(){
        if(themeChoose.getItems().size()!=0) {
            String theme=themeChoose.getValue().toString();
            for (int i = 0; i < model.getDiplomaList().getList().size(); i++) {
                if (theme==model.getDiplomaList().getList().get(i).getTheme()){
                    editor.setHtmlText(model.getDiplomaList().getList().get(i).toString());
                }
            }
        }
    }

    private void checkFileName(String fileName){
        if(!fileName.endsWith(".xml"))
            throw new IllegalArgumentException();
    }

    private void fillThemes(){
        for(int i=0;i<model.getDiplomaList().getList().size();i++){
            String theme=model.getDiplomaList().getList().get(i).getTheme();
            if(!themeChoose.getItems().contains(theme))
                themeChoose.getItems().add(theme);
        }
    }

    public void setModelAndView(Model model,View view){
        this.model=model;
        this.view=view;
    }

}
