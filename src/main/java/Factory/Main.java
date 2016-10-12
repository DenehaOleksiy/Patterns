package Factory;

/**
 * Created by Администратор on 12.10.2016.
 */
public class Main {
    public static void main(String[] args) {

        Factory factory = getFactory("Red");
        Vine vine = factory.getFactory();
        vine.drinkVine();
    }
    static Factory getFactory(String vineType){
        if (vineType.equalsIgnoreCase("red"))
            return new RedVineFactory();
        else if (vineType.equalsIgnoreCase("white"))
            return new WhiteVineFactory();
        else throw new RuntimeException("No such factory  " + vineType);
    }
}
interface Vine{
    void drinkVine();
}
class RedVine implements Vine{
    public void drinkVine() {
        System.out.println("Drink red vine");
    }
}
class WhiteVine implements Vine{
    public void drinkVine() {
        System.out.println("Drink white vine");
    }
}

interface Factory{
    Vine getFactory();
}

class RedVineFactory implements Factory{
    public Vine getFactory() {
        return new RedVine();
    }
}
class WhiteVineFactory implements Factory{
    public Vine getFactory() {
        return new WhiteVine();
    }
}