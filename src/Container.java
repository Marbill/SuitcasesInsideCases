
import java.util.ArrayList;


/* @author marbi */
public class Container {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() <= this.maxWeight) {
            suitcases.add(suitcase);
            this.maxWeight -= suitcase.totalWeight();
        }
    }

    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }

    public String toString() {
        int weight = 0;
        String itemDesciption = "";

        for (Suitcase suitcase : suitcases) {
            weight += suitcase.totalWeight();
        }

        if (suitcases.size() == 0) {
            itemDesciption = "empty ";
            return itemDesciption + "(" + weight + " kg)";
        } else if (suitcases.size() == 1) {
            itemDesciption = " suitcase ";
        } else {
            itemDesciption = " suitcases ";
        }

        return suitcases.size() + itemDesciption + "(" + weight + " kg)";
    }
}
