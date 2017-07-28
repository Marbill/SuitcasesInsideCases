
public class Main {

    public static void addSuitcasesFullOfBricks(Container container) {
        int brickWeight = 1;
        for (int i = 0; i < 100; i++) {
            Thing brick = new Thing("Brick", brickWeight);
            Suitcase suitcase = new Suitcase(brickWeight);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
            if (brickWeight < 101) {
                brickWeight += 1;
            }

        }
    }

    public static void main(String[] args) {
        // use this main class to test your program!
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase tomsCase = new Suitcase(10);
        tomsCase.addThing(book);
        tomsCase.addThing(mobile);

        Suitcase georgesCase = new Suitcase(10);
        georgesCase.addThing(brick);
        
        Suitcase ericksCase = new Suitcase(5);
        ericksCase.addThing(book);
        ericksCase.addThing(mobile);

        Container container = new Container(1000);
        container.addSuitcase(tomsCase);
        container.addSuitcase(georgesCase);
        container.addSuitcase(ericksCase);

        System.out.println(container);
    }

}
