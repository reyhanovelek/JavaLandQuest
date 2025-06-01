package com.codeland;

public class MagicBox<T> {
    private T item;

    //put items in the Box

    public void set(T item) {
        this.item = item;
    }

    // TODO: Handle null cases with exception
    //get items from the Box
    public T get() throws  EmptyBoxException{
        if (item == null) {
            throw new EmptyBoxException("❌ Empty Box!");
        }
        return item;
    }
}
