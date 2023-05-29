public class Normal_tick extends GildedRose{
    public Normal_tick(String name, int quality, int daysRemaining){
        super(name, quality, daysRemaining);
    }

    public void tick(){
        daysRemaining = daysRemaining - 1;

        if(quality > 0){
            quality = quality -1;
        }

        if(quality > 0 && daysRemaining <=0){
            quality = quality -1;
        }

    }

    public int getQuality(){
        return quality;
    }

    public int getRemainingDays(){
        return daysRemaining;
}
}