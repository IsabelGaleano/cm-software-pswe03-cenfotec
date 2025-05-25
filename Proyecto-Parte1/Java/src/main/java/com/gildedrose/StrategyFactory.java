package com.gildedrose;

public class StrategyFactory {
    public static QualityStrategy getStrategy(Item item) {
        switch (item.name) {
            case "Aged Brie":
                return new AgedBrieStrategy();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePassStrategy();
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasStrategy();
            default:
                return new NormalItemStrategy();
        }
    }
}
