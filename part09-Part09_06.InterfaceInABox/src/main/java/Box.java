import java.util.ArrayList;

public class Box implements Packable{

    private double capacity;
    private ArrayList<Packable> box;

    public Box(double capacity){
        this.capacity = capacity;
        this.box = new ArrayList<>();
    }


    @Override
    public double weight() {
        double weight = 0;
        // calculate the total weight of the items in the box
        for (Packable object : box) {
            weight += object.weight();
        }
        return weight;
    }

    @Override
    public String toString(){
        int count = 0;
        double weight = 0;
        for (Packable object : box) {
            count++;
            weight += object.weight();
        }

        return "Box: "+count+" items, total weight "+weight+" kg";
    }


    public void add(Packable object) {
        if(this.weight()+object.weight()<=capacity){
            box.add(object);
        }
        
    }   

}
