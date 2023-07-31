package com.mycompany.q1;
public class Item {
    
    private int location;
    private String description;
    
    public Item(int location, String description){
        this.location = location;
        this.description = description;
    }
    
    public int getlocation(){
        return location;
    }

    public void setlocation(int location){
        this.location = location;
    }
    
    public String getdescription(){
        return description;
    }

    public void setdescription(String description){
        this.description = description;
    }
    
}
