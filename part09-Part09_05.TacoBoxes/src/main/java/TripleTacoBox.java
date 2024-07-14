public class TripleTacoBox implements TacoBox {

    private int tacos;

    public TripleTacoBox(){
        this.tacos = 3;
    }

    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
        this.tacos -= 1;

        if(this.tacos<0){
            this.tacos = 0;
        }


    }

}
