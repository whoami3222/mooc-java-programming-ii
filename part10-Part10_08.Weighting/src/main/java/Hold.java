

import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase Suitcase) {
        if (this.totalWeight() + Suitcase.totalWeight() > maximumWeight) {
            return;
        }

        this.suitcases.add(Suitcase);
    }

    public int totalWeight() {
        int summa = 0;
        int indeksi = 0;
        while (indeksi < this.suitcases.size()) {
        summa += this.suitcases.get(indeksi).totalWeight();
        indeksi++;
        }

        int sum = suitcases.stream()
            .map(suitace -> suitace.totalWeight())
            .reduce(0, (prevSum, value)-> prevSum + value);

        return sum;
    }

    public void printItems() {

        suitcases.stream()
        .forEach(suitcase -> suitcase.printItems());
    }

    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }

        if (this.suitcases.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg)";
        }

        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
