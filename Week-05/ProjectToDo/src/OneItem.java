public class OneItem {
    String name;
    boolean completion;
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        String x = "[ ]";
        if (this.completion == true){
            x = "[x]";
        }
        return x + " " + this.name;
    }
    public OneItem(String name){
        this.name = name;
        this.completion = false;
    }

    public void complete(){
        completion = true;
    }
}
