package com.codeland;

public class MagicBox<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        // TODO: Handle null cases with exception
        return item;
    }
}
