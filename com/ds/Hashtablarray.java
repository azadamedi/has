package com.ds;

public class Hashtablarray<T> { //"T" to select datatype of hashtable
    Entry[]arrayHash;
    int Size;
    public Hashtablarray(int Size){ // constracture
        this .Size=Size;
        arrayHash=new Entry[this.Size];
        for(int i=0;i<arrayHash.length;i++)
            arrayHash[i]=new Entry<T>();

    }
    int GetHash(int key){

        return key%Size; // many way
    }
    public void put(int key ,T value){
int index= GetHash(key);
Entry ArrayValue=arrayHash[index]; // link list
Entry newitem=new Entry<T>(key,value);
newitem.next=ArrayValue.next;
ArrayValue.next=newitem;


    }
    public T Get(int key){
        T value=null;
        int index=GetHash(key);
        Entry ArrayValue=arrayHash[index];
        while(ArrayValue!=null)
        {
            if (ArrayValue.Getkey()==key){
                value=(T)ArrayValue.getValue();
                break;
            }
            ArrayValue=ArrayValue.next;
        }

        return value;

    }
}



