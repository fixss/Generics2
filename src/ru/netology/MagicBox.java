package ru.netology;

import java.util.Random;

public class MagicBox<T> {
    protected int maxItems;
    private T[] items = (T[]) new Object[maxItems];
    private Random random = new Random();


    public MagicBox(int maxItems) {
        this.maxItems = maxItems;
        this.items = (T[]) new Object[maxItems];
    }
    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("Item added successfully");
                return true;
            }
        }
        System.out.println("Box can't hold more items ");
        return false;
    }

    public T pick() {
        int counter = 0;
        for (int i = 0; i < items.length; i++)
            if (items[i] != null) {
                counter++;
            }
        if (counter < items.length) {
            System.out.println("Box not full enough, there is room left for " + (items.length - counter) + " items.");
            String msg = "BOX NEED ITEMS!!!";
            throw new RuntimeException(msg);
        } else {
            int randomInt = random.nextInt(items.length);
            return items[randomInt];
        }
    }

}
