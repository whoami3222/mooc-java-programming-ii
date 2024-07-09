
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        double avg = 0;

        while (true) {
            int input = scanner.nextInt();
            if(input == 0){
                break;
            }

            if(input>0){
                sum += input;
                count++;
            }
        }
        if(sum>0){
            avg = sum/count;    
            System.out.println(avg);
        }else{
            System.out.println("Cannot calculate the average");
        }
    }
}
