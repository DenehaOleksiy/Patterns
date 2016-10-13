package Strategy;

/**
 * Created by Администратор on 13.10.2016.
 */
public class Main {
    public static void main(String[] args) {

        Developer developer = new Developer();
        developer.setActivity(new Work());
        developer.execute();

        developer.setActivity(new Eat());
        developer.execute();

        developer.setActivity(new Sleep());
        developer.execute();
    }
}
interface Activity{
    void doSomething();
}
class Sleep implements Activity{
    public void doSomething() {
        System.out.println("Sleeping");
    }
}
class Work implements Activity{
    public void doSomething() {
        System.out.println("Working");
    }
}
class Eat implements Activity{
    public void doSomething() {
        System.out.println("Eating");
    }
}

class Developer{
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    void execute(){
        activity.doSomething();
    }
}