package com.example.coding_dictionary;

public class InformationActivity {
    private String name;
    private String print;
    private boolean isOpen = false;

    public void setisOpen(boolean isOpen){
        this.isOpen = isOpen;
    }
    public String getName() {
        return name;
    }

    public String getPrint() {
        return print;
    }

    public InformationActivity(String name, String print) {
        this.name = name;
        this.print = print;
    }
}
