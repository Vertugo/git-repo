package parser;

import javax.xml.bind.JAXBException;
import java.io.File;

/**
 * Created by Alex on 29.05.2016.
 */
public interface Parser {
    Object getObject(File file, Class[] classes)throws JAXBException;
    void saveObject(File file,Object object)throws JAXBException;
}
