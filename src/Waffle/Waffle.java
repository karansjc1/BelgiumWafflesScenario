// Component

package Waffle;

public abstract class Waffle {
    String description="";

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public void prepareDough(String type) {
        System.out.println("Preparing "+ type + " dough");
    }

    public void cookDough(String type) {
        System.out.println("Cooking " + type + " dough");
    }

    public void serve(String type) {
        System.out.println("Serving " + type);
    }
}
