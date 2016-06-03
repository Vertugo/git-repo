package entity;

import javax.xml.bind.annotation.*;

/**
 * Created by Alex on 29.05.2016.
 */

@XmlRootElement(name="content")
@XmlAccessorType(XmlAccessType.FIELD)
public class Content {

    @XmlAttribute(name = "heading-style")
    private String headingStyle;

    @XmlAttribute(name = "text-style")
    private String textStyle;

    @XmlElement(name = "preface")
    private String preface;

    @XmlElement(name = "conclusion")
    private String conclusion;

    public String getHeadingStyle() {
        return headingStyle;
    }

    public String getTextStyle() {
        return textStyle;
    }

    public String getPreface() {
        return preface;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setHeadingStyle(String headingStyle) {
        this.headingStyle = headingStyle;
    }

    public void setTextStyle(String textStyle) {
        this.textStyle = textStyle;
    }

    public void setPreface(String preface) {
        this.preface = preface;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    @Override
    public String toString() {
        return "Content{" +
                "headingStyle='" + headingStyle + '\'' +
                ", textStyle='" + textStyle + '\'' +
                ", preface='" + preface + '\'' +
                ", conclusion='" + conclusion + '\'' +
                '}';
    }
}
