import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String,ArrayList<String>> storage;

    public StorageFacility(){
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item){

        storage.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> items = this.storage.get(unit);

        items.add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
        
    }

    public void remove(String storageUnit, String item){
        this.storage.get(storageUnit).remove(item);
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> units = new ArrayList<>();

        for (String key : storage.keySet()) { 
            if(!storage.get(key).isEmpty()){
                units.add(key);
            }
        }

        return units;
        
        
    }

}
