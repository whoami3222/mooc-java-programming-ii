
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        // you can test your class here
        System.out.println("Input numbers, type 'end' to stop ");

        while (true) {
            String input = scanner.nextLine();

            if(input.equals("end")){
                break;
            }

            inputs.add(input);


        }

        double average = inputs.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .average()
        .getAsDouble();
        
        System.out.println("average of the numbers: "+average);

    }
}
