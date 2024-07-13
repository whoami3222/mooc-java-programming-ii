public class ProductWarehouseWithHistory extends ProductWarehouse{

    
    private ChangeHistory object;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);  
        this.object = new ChangeHistory(); 
        addToWarehouse(initialBalance);
        
    }

    public String history(){
        return object.toString();
    }

    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        double double1 = super.getBalance();
        object.add(double1);
    }

    @Override
    public double takeFromWarehouse(double amount){
        double amountTaken = super.takeFromWarehouse(amount);
        double balance = super.getBalance();
        object.add(balance);
        
        return amountTaken;
    }

    public void printAnalysis(){
        System.out.println("Product: "+ super.getName());
        System.out.println("History: "+ history());
        System.out.println("Largest amount of product: "+ object.maxValue());
        System.out.println("Smallest amount of product: "+object.minValue());
        System.out.println("Average: "+object.average());
    }
}
