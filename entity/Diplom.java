package entity;

import parser.iml.JaxbParser;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;

/**
 * Created by Alex on 29.05.2016.
 */
@XmlRootElement(name = "diplom")
@XmlAccessorType(XmlAccessType.FIELD)
public class Diplom {

    @XmlElement(name = "fio")
    private String fio;

    @XmlElement(name="theme")
    private String theme;

    @XmlElement(name="speciality")
    private String speciality;

    @XmlElement(name="task")
    private String task;

    @XmlElement(name = "annotation")
    private Annotation annotation;

    @XmlElement(name = "end-date")
    private String endDate;

    @XmlElement(name="content")
    private Content content;

    public Annotation getAnotation() {
        return annotation;
    }

    public void setAnnotation(Annotation annotation) {
        this.annotation = annotation;
    }

    public Annotation getAnnotation() {
        return annotation;
    }

    public void setAnotation(Annotation annotation) {
        this.annotation = annotation;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getFio() {
        return this.fio;
    }

    public String getTheme() {
        return theme;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getTask() {
        return task;
    }

    @Override
    public String toString() {
        return "Diplom{" +
                "fio='" + fio + '\'' + "<b>" +
                ", theme='" + "</b>" + theme + '\'' +
                ", speciality='" + speciality + '\'' +
                ", task='" + task + '\'' +
                ", annotation=" + annotation +
                ", endDate='" + endDate + '\'' +
                ", content=" + content +
                '}';
    }
}
