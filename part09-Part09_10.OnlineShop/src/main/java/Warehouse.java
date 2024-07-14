import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> products;
    private Map<String, Integer> storage;


    public Warehouse(){
        this.products = new HashMap<>();
        this.storage = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        this.products.put(product, price);
        this.storage.put(product,stock);
    }

    public int price(String product){

        if(!products.containsKey(product)){
            return -99;
        }

        return products.get(product);

    }

    public int stock(String product){
        return this.storage.getOrDefault(product,0);
    }

    public boolean take(String product){
        int currentStock = this.storage.getOrDefault(product, 0);

        if(currentStock > 0){
            this.storage.put(product, currentStock - 1);
            return true;
        } else {
            return false;
    }

    }


    public Set<String> products(){
        return this.products.keySet();
    }
}
