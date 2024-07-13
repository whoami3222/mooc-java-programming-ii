import java.util.ArrayList;

public class OneItemBox extends Box{

    private ArrayList<Item> items;  

    public OneItemBox(){

        this.items = new ArrayList<>();

    }

    @Override
    public void add(Item item) {
        if(this.oneItem()){
            return;
        }
        items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }

    public boolean oneItem(){
        int count = 0;
        for (Item item : items) {
            count++;
            if(count>=1){
                return true;
            }
        }
        return false;
    }

}
