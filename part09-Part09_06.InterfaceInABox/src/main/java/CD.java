public class CD implements Packable {

    private double weight;
    private String artist;
    private String name;
    private int year;

    public CD(String artist, String name, int year){
        this.weight = 0.1;
        this.artist = artist;
        this.name = name;
        this.year = year;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    public String toString(){
        return this.artist + ": "+name+" ("+year+")";

    }
}
