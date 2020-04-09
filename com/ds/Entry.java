package com.ds;

public class Entry<T> {
    int key;
    T value ;
    Entry next;
   public Entry(int key, T value){
        this.key =key;
        this.value=value;
        next=null;

    }
    public Entry(){

        next=null;

    }
    public int Getkey(){

        return key;
    }
    public T getValue()
    {
        return value;
    }
}
