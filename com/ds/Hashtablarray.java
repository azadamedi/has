
      package com.ds;
import java.util.Hashtable;
public class Hashtablarray<T> { //"T" to select datatype of hashtable
    Entry[]arrayHash;
    private static int Size;

    private static int arraysize;
    public static int getSize() {
        return Size;
    }


    public Hashtablarray(int Size){ // constracture
        this .Size=Size;
        arrayHash=new Entry[this.Size];
        for(int i=0;i<arrayHash.length;i++)
            arrayHash[i]=new Entry<T>();

    }
    int GetHash(String key){

         int key1=Math.abs(key.hashCode())%Size ; // many way
        return key1;
    }
    public void put(String key ,T value){
int index= GetHash(key);
Entry ArrayValue=arrayHash[index]; // link list
Entry newitem=new Entry<T>(key,value);
newitem.next=ArrayValue.next;
ArrayValue.next=newitem;


    }
    public T Get(String key){
        T value=null;
        int index=GetHash(key);
        Entry ArrayValue=arrayHash[index];
        while(ArrayValue!=null)
        {
            if (ArrayValue.getKey()==key){
                value=(T)ArrayValue.getValue();
                break;
            }
            ArrayValue=ArrayValue.next;
        }

        return value;

    }
}






