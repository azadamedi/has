
    package com.ds;

public class Entry<T> {
    String key;
    T value ;

    public String getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }

    Entry next;
   public Entry(String key, T value){
        this.key =key;
        this.value=value;
        next=null;

    }
    public Entry(){

        next=null;

    }

}

