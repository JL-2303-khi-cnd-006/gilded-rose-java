public class Sulfuras extends GildedRose{

    public Sulfuras(String name, int quality, int daysRemaining){
        super(name, quality, daysRemaining);
    }

    public void tick(){
        if(daysRemaining<=5){
            return;
        }

        else if(quality<=10){
            return;
        }
    }

    public int getQuality(){
        return quality;
    }

    public int getRemainingDays(){
        return daysRemaining;
    }
}