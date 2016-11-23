/**
 * Created by Zsuzska on 2016. 11. 18..
 */
public class OneItem {
    String name;
    boolean completion;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString(); //x+name if completed=true
    }

    public void setCompletion(boolean completion) {
        this.completion = completion;
    }

    public OneItem(String name){
        this.name = name;
        this.completion = false;
    }

    public void complete(){
        completion = true;
    }
}
