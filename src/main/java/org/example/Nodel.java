package org.example;

public class Nodel {
    private String item;
    private int count;
    private Nodel link;
    public Nodel(){
        link = null;
        item = null;
        count = 0;
    }
    public Nodel(String newItem, int newCount, Nodel linkValue){
        setData(newItem, newCount);
        link = linkValue;
    }
    public void setData(String newItem, int newCount){
        item = newItem;
        count = newCount;
    }

    public void setLink(Nodel newLink){
        link = newLink;
    }
    public String getItem(){
        return item;
    }
    public  int getCount(){
        return count;
    }
    public Nodel getLink(){
        return link;
    }
}
