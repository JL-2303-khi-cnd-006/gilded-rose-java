import org.apache.commons.lang3.StringUtils;

public class GildedRose {

    public String name;
    public int quality;
    public int daysRemaining;

    public GildedRose(String name, int quality, int daysRemaining) {
        this.name = name;
        this.quality = quality;
        this.daysRemaining = daysRemaining;
    }

    public void tick() {
        if(name.equals("Aged Brie")){
            Aged_Brie aged_brie = new Aged_Brie(name, quality, daysRemaining);
            aged_brie.tick();
            quality = aged_brie.getQuality();
            daysRemaining = aged_brie.getRemainingDays();
        }

        else if(name.equals("normal")){
            Normal_tick normal = new Normal_tick(name, quality, daysRemaining);
            normal.tick();
            quality = normal.getQuality();
            daysRemaining = normal.getRemainingDays();
        }

        else if(name.equals("Backstage passes to a TAFKAL80ETC concert")){
            Backstage_pass backstage_pass = new Backstage_pass(name, quality, daysRemaining);
            backstage_pass.tick();
            quality = backstage_pass.getQuality();
            daysRemaining = backstage_pass.getRemainingDays();
        }

        else if(name.equals("Sulfuras, Hand of Ragnaros")){
            Sulfuras sulfuras = new Sulfuras(name, quality, daysRemaining);
            sulfuras.tick();
            quality = sulfuras.getQuality();
            daysRemaining = sulfuras.getRemainingDays();
        }

        else if(name.equals("Conjured Item")){
            Conjured conjured = new Conjured(name, quality, daysRemaining);
            conjured.tick();
            quality = conjured.getQuality();
            daysRemaining = conjured.getRemainingDays();
        }
       
    }
    
}