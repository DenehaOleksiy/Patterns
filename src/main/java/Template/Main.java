package Template;

/**
 * Created by Администратор on 13.10.2016.
 */
public class Main {
    public static void main(String[] args) {

        Website welcome = new WelcomePage();
        welcome.template();

        Website news = new NewsPage();
        news.template();
    }
}
abstract class Website{
    void template(){
        System.out.println("Header");
        System.out.println("Menu");
        content();
        System.out.println("Footer");
        System.out.println("===============");
    }
    abstract void content();
}

class WelcomePage extends Website{
    void content() {
        System.out.println("Hello content");
    }
}

class NewsPage extends Website{
    void content() {
        System.out.println("News content");
    }
}