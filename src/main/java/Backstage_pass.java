public class Backstage_pass extends GildedRose{
    
    public Backstage_pass(String name, int quality, int daysRemaining){
        super(name, quality, daysRemaining);
    }

    public void tick(){
        daysRemaining = daysRemaining -1;
        if(quality ==50){
            return;
        }
        quality = quality +1;
        if(daysRemaining<=10){
            quality = quality +1;
        }
        if(daysRemaining<5){
            quality = quality +1;
        }
        if(daysRemaining < 0){
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
