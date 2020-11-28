package com.company;

public class Cake extends Food {
    private String icing;

    public Cake(String icing) {
        super("Пирожное");
        this.icing = icing;
    }

    public void consume() {
        System.out.println(this + " съедено.");
    }
    public String getIcing() {
        return icing;
    }

    public void setIcing(String icing) {
        this.icing = icing;
    }
/*
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Cake)) return false;
            return icing.equals(((Cake) arg0).icing);
        } else
            return false;
    }
*/

    public String toString() {
        return super.toString() + " с '" + icing.toUpperCase() + "' глазурью";
    }
}
