public class Rechteck extends Ding{
    protected int length = 2;
    protected int width = 2;
    public final String object = "Rechteck";
    public String Kev = "Kev";

    public int computeArea(){
        return length * width;
    }
    public void print(){
        System.out.println(object);
    }

}
