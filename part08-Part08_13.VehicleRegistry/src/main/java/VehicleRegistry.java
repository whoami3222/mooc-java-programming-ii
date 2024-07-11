import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate,String> register;

    public VehicleRegistry(){
        this.register = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        if(register.containsKey(licensePlate)){
            return false;
        }
        register.put(licensePlate, owner);
        return true;

    }


    public String get(LicensePlate licensePlate){
        return register.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate){
        if (register.containsKey(licensePlate)) {
            register.remove(licensePlate);
            return true;
        }
        return false;

    }

    public void printLicensePlates(){
        for (LicensePlate plate : register.keySet()) {
            System.out.println(plate);
        }   
    }


    public void printOwners(){
        ArrayList<String> printedOwners = new ArrayList<>();

        for (String owner : register.values()) {
            if(!printedOwners.contains(owner)){
                System.out.println(owner);
                printedOwners.add(owner);
            }
        }

    }
}
