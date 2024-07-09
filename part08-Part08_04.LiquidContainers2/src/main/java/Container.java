public class Container {

    int amount = 0;
    int container;
    public Container(){
        this.container = 0;
    }

    public int contains(){
        return container;
    }

    public void add(int amount){
        if(amount>0){

            if(container+amount <= 100){
                container += amount;
            }else{
                container = 100;
            }

        }
        
    }

    public void remove(int amount){
        if(amount > 0){
            if(container-amount >= 0){
                container -= amount;
            }else{
                container = 0;
            }
        }
        
    }



    public String toString(){
        return container+"/100";
    }

}
