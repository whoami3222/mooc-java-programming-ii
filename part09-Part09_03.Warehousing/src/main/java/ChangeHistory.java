import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory(){
        //creates an empty ChangeHistory object.
        this.history = new ArrayList<>();

    } 


    public void add(double status){
    //adds provided status as the latest amount to remember in the change history.
        history.add(status);

    } 

    public void clear(){
        //empties the history.
        history.removeAll(history);

    } 
       
    public String toString(){
        //returns the string representation of the change history. The string representation provided by the ArrayList class is sufficient.
       return history.toString();

    } 


    public double maxValue(){
        //returns the largest value in the change history. If the history is empty, the method should return zero.

        if(history.isEmpty()){
            return 0;
        }

        double max = 0;
        for (Double double1 : history) {
            
            if(double1>max){
                max = double1;
            }
        }

        return max;

    } 

    public double minValue(){
        //returns the smallest value in the change history. If the history is empty, the method should return zero.
        if(history.isEmpty()){
            return 0;
        }

        double min = 10000;
        for (Double double1 : history) {
            
            if(double1<min){
                min = double1;
            }
        }

        return min;

    } 

    public double average(){
        //returns the average of the values in the change history. If the history is empty, the method should return zero.
        int count = 0;
        int sum = 0;
        double avg = 0;
        for (Double double1 : history) {

            sum += double1;
            count++;
            
        }

        avg = (double)sum/count;
        return avg;

    } 

}
