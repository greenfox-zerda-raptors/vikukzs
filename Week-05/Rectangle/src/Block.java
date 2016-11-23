/**
 * Created by Zsuzska on 2016. 11. 16..
 */
public class Block extends Rectangle {
    float length;
    public Block(){
        super(1, 1);
    }
    public Block(int length){

    }

    public float getLength() {
        return length;
    }
    public void getVolume(){

    }

    @Override
    public float getHeight() {
        return super.getHeight();
    }

    @Override
    public void setHeight(float height) {
        super.setHeight(height);
    }

    @Override
    public float getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(float width) {
        super.setWidth(width);
    }
}
