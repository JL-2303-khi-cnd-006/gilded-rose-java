public class Conjured  extends GildedRose{

    public Conjured(String name, int quality, int daysRemaining) {
        super(name, quality, daysRemaining);

    }

    public void tick(){
        daysRemaining = daysRemaining -1;
        if(quality > 1){
            quality = quality - 2;
        }

        if(quality > 1 && daysRemaining <=0){
            quality = quality - 2;
        }

        if( quality <=1 ){
            quality = 0;
        }
    }

    public int getQuality(){
        return quality;
    }

    public int getRemainingDays(){
        return daysRemaining;
}
}
