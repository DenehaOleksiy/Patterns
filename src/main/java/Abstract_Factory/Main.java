package Abstract_Factory;

/**
 * Created by Администратор on 12.10.2016.
 */
public class Main {
    public static void main(String[] args) {

        AbstractFactory abstractFactory = getFactory("Japan");
        Phone phone = abstractFactory.getPhone();
        NoteBook noteBook = abstractFactory.getBook();
        phone.listenMusic();
        phone.speak();
        noteBook.clickMouse();
        noteBook.printText();
    }
    static AbstractFactory getFactory(String country){
        if (country.equalsIgnoreCase("Japan"))
            return new JapanFactory();
        else if (country.equalsIgnoreCase("China"))
            return new ChinaFactory();
        else throw new RuntimeException("No such country  " + country);
    }
}
interface NoteBook{
    void printText();
    void clickMouse();
}
interface Phone{
    void speak();
    void listenMusic();
}
class JapanBook implements NoteBook{
    public void printText() {
        System.out.println("print Japan text");
    }

    public void clickMouse() {
        System.out.println("click Japan mouse");
    }
}
class ChinaBook implements NoteBook{
    public void printText() {
        System.out.println("print China text");
    }

    public void clickMouse() {
        System.out.println("click China mouse");
    }
}
class JapanPhone implements Phone{
    public void speak() {
        System.out.println("speak Japan");
    }

    public void listenMusic() {
        System.out.println("listen Japan music");
    }
}
class ChinaPhone implements Phone{
    public void speak() {
        System.out.println("speak China");
    }

    public void listenMusic() {
        System.out.println("listen China music");
    }
}

interface AbstractFactory{
    NoteBook getBook();
    Phone getPhone();
}
class JapanFactory implements AbstractFactory{
    public NoteBook getBook() {
        return new JapanBook();
    }

    public Phone getPhone() {
        return new JapanPhone();
    }
}
class ChinaFactory implements AbstractFactory{
    public NoteBook getBook() {
        return new ChinaBook();
    }

    public Phone getPhone() {
        return new ChinaPhone();
    }
}