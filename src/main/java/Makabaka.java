public class Makabaka implements Tradable, Domesticatable {
    private String voice = "maka";

    public Makabaka(String str){
        this.voice = str;
    }

    @Override
    public String sound(){
        return voice;
    }

    @Override
    public int getPrice(){
        return 1000;
    }
}
