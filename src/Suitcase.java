
import java.util.ArrayList;


/* @author marbi */
public class Suitcase {

    private ArrayList<Thing> things;
    private int weightLimit;

    public Suitcase(int weightLimit) {
        this.things = new ArrayList<Thing>();
        this.weightLimit = weightLimit;
    }

    public void addThing(Thing thing) {
        if (thing.getWeight() <= this.weightLimit) {
            things.add(thing);
            this.weightLimit -= thing.getWeight();
        }
    }

    public String toString() {
        int weight = 0;
        String itemDesciption = "";

        weight = totalWeight();

        if (things.size() == 0) {
            itemDesciption = "empty ";
            return itemDesciption + "(" + weight + " kg)";
        } else if (things.size() == 1) {
            itemDesciption = " thing ";
        } else {
            itemDesciption = " things ";
        }

        return things.size() + itemDesciption + "(" + weight + " kg)";
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        int weight = 0;

        for (Thing thing : things) {
            weight += thing.getWeight();
        }

        return weight;
    }

    public Thing heaviestThing() {
        if (!things.isEmpty()) {
            Thing temp = things.get(0);

            for (Thing thing : things) {
                if (thing.getWeight() > temp.getWeight()) {
                    temp = thing;
                }
            }

            return temp;
        }
        
        return null;

    }

}
