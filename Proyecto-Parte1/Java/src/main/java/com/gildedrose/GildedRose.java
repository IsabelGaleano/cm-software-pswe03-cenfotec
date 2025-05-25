package com.gildedrose;

public class GildedRose {
    private final Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            QualityStrategy strategy = StrategyFactory.getStrategy(item);
            strategy.update(item);
        }
    }
}
