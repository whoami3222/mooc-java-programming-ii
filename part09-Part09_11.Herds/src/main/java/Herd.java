import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> herd;

    public Herd(){
        this.herd = new ArrayList<>();
    }


    public String toString(){

        StringBuilder result = new StringBuilder();
        for (Movable movable : herd) {
            result.append(movable.toString()).append("\n");
        }
        return result.toString();
    }

    public void addToHerd(Movable movable){
        herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable organism : herd) {

            organism.move(dx, dy);
            
        }
    }

}
