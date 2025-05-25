package com.gildedrose;

public class AgedBrieStrategy implements QualityStrategy {
    @Override
    public void update(Item item) {
        item.sellIn--;
        if (item.quality < 50) item.quality++;
        if (item.sellIn < 0 && item.quality < 50) item.quality++;
    }
}
