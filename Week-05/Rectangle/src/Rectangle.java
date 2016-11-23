/**
 * Created by Zsuzska on 2016. 11. 16..
 */
public class Rectangle {
    private float width;
    private float height;
    public Rectangle() {
        width = 1;
        height = 1;
    }
    public Rectangle(int width, int height){
        this.width = width;
        this.height = width;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public float getArea(){
        return width * height;
    }
    public String toString() {
        return String.format("");
    }

 }
