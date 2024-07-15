import java.util.HashMap;
import java.util.Map;

public class Item {

    private String product;
    private int quantity;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.quantity = qty;
        this.unitPrice = unitPrice;
    }

    public int price(){

        return this.quantity * this.unitPrice;
    }

    public void increaseQuantity(){
        this.quantity++;
    }

    public String toString(){
        return this.product + ": " + this.quantity;
    }
}
