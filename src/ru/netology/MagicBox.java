package ru.netology;

import java.util.Random;

public class MagicBox<T> {
    protected T item;
    protected int maxItems;
    T[] items = (T[]) new Object[maxItems];
    Random random = new Random();


    public MagicBox(int maxItems) {
        this.maxItems = maxItems;
        this.items = (T[]) new Object[maxItems];
    }

    public T getItem() {
        return item;
    }

    public long getTotal() {
        return maxItems;
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
    public T pick(){
            int counter = 0;
            for (int i = 0; i < items.length; i ++)
                if (items[i] != null)
                    counter ++;
            if (counter < items.length){
                System.out.println("Box not full enough, there is room left for " + (items.length - counter) + " items." );
                String msg = "BOX NEED ITEMS!!!";
                throw new RuntimeException(msg);
            }else{
                int randomInt = random.nextInt(items.length);
                return items[randomInt];
    }
    }

}
