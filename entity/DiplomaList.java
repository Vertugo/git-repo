package entity;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 29.05.2016.
 */
@XmlRootElement(name = "diploma-list")
@XmlAccessorType(XmlAccessType.FIELD)
public class DiplomaList {

    @XmlElement(name = "diplom")
    //@XmlElementWrapper(name = "diploma-list")
    private ArrayList<Diplom> list = new ArrayList<>();

    public ArrayList<Diplom> getList() {
        return list;
    }

    public void setList(ArrayList<Diplom> list) {
        this.list = list;
    }


    @Override
    public String toString() {
        return "DiplomaList{" +
                "list=" + list +
                '}';
    }
}
