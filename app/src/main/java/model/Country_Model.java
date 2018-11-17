package model;

public class Country_Model {

    Integer image,image1;
    String text;

    public Country_Model(Integer image, Integer image1, String text) {
        this.image = image;
        this.image1 = image1;
        this.text = text;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public Integer getImage1() {
        return image1;
    }

    public void setImage1(Integer image1) {
        this.image1 = image1;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
