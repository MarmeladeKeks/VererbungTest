import java.util.ArrayList;
import java.util.List;


public class Main {
    static List<Ding> test = new ArrayList<>();
    public static void main(String[] args) {
        test.add(new Ding());
        test.add((new Rechteck()));
        test.forEach(Ding::print);
        for (Ding hi: test){
            if (hi instanceof Rechteck){
                System.out.println(((Rechteck) hi).Kev);

            }
        }
    }
}