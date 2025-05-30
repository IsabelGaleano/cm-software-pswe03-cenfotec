package com.gildedrose;

public class Main {

    public static void main(String[] args) {
        Item[] items = new Item[] {
            new Item("+5 Dexterity Vest", 10, 20),
            new Item("Aged Brie", 2, 0),
            new Item("Elixir of the Mongoose", 5, 7),
            new Item("Sulfuras, Hand of Ragnaros", 0, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49)
        };

        GildedRose app = new GildedRose(items);

        System.out.println("Items before update:");
        for (Item item : items) {
            System.out.println(item);
        }

        app.updateQuality();

        System.out.println("\nItems after update:");
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
