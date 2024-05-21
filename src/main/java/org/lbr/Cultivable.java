package org.lbr;

import java.util.ArrayList;

public abstract class Cultivable extends GameObject {
    protected boolean is_protected;
    protected boolean is_trap;
    protected ArrayList<Item> activeItems;
    protected Product product;

    public Cultivable(String name){
        super(name);
        is_protected = false;
        is_trap = false;
        activeItems = new ArrayList<Item>();
    }

    public Cultivable(String name, boolean is_protected, boolean is_trap, ArrayList<Item> activeItems){
        super(name);
        this.is_protected = is_protected;
        this.is_trap = is_trap;
        this.activeItems = activeItems;
    }

    // getter
    public boolean getIsProtected(){
        return is_protected;
    }

    public boolean getIsTrap(){
        return is_trap;
    }


    public Product getProduct() {
        return product;
    }

    public ArrayList<Item> getActiveItems() {
        return activeItems;
    }

    //setter
    public void enableProtect() {
        this.is_protected = true;
    }

    public void enableTrap() {
        this.is_protected = true;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProtected: " + getIsProtected() + "\nTrap: " + getIsTrap();
    }

    public void addActiveItem(Item item){
        activeItems.add(item);
    }

    // effects
    public abstract void accelerate();

    public abstract void delay();

    public abstract void protect();

    public abstract void trap();



}
