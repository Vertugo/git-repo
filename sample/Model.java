package sample;

import entity.Annotation;
import entity.Content;
import entity.Diplom;
import entity.DiplomaList;
import parser.iml.JaxbParser;

import javax.xml.bind.JAXBException;
import java.io.File;

/**
 * Created by Alex on 30.05.2016.
 */
public class Model {

    DiplomaList diplomaList= new DiplomaList();

    public void createList(File file)throws JAXBException{

        JaxbParser jaxbParser = new JaxbParser();
         diplomaList = (DiplomaList) jaxbParser.getObject(file,new Class[]{DiplomaList.class, Diplom.class, Annotation.class, Content.class});
    }

    public DiplomaList getDiplomaList() {
        return diplomaList;
    }

    public void setDiplomaList(DiplomaList diplomaList) {
        this.diplomaList = diplomaList;
    }
}
