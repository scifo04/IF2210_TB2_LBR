package org.lbr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Omnivore extends Animal {
    private static Map<String, Omnivore> omnivoreMap = new HashMap<String, Omnivore>();

    static {
        omnivoreMap.put("AYAM", new Omnivore("AYAM",5, new Product("TELUR")));
        omnivoreMap.put("BERUANG", new Omnivore("BERUANG",25, new Product("DAGING_BERUANG")));
    }

    public Omnivore(String name, int weight_to_ready, Product product){
        super(name,weight_to_ready,product);
    }

    public Omnivore(String name, int weight_to_ready, int weight, Product product, boolean is_protected, boolean is_trap, ArrayList<Item> activeItems) {
        super(name, weight_to_ready, weight, product, is_protected, is_trap, activeItems);
    }

    public Omnivore (Omnivore other){
        super(other);
    }

    public Omnivore(String name){
        this(omnivoreMap.get(name));
    }

    @Override
    public void eat(Product p) {
        try {
            this.addWeight(p.getAddWeight());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
