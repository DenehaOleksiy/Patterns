package State;

/**
 * Created by Администратор on 12.10.2016.
 */
public class Main {
    public static void main(String[] args) {

        Channel channel = new STB();
        TV tv = new TV();
        tv.setChannel(channel);

        for (int i = 0; i <10 ; i++) {
            tv.watchTV();
            tv.swithChannel();
        }
    }
}

interface Channel{
    void show();
}

class Inter implements Channel{
    public void show() {
        System.out.println("show Inter");
    }
}
class ICTV implements Channel{
    public void show() {
        System.out.println("show ICTV");
    }
}
class STB implements Channel{
    public void show() {
        System.out.println("show STB");
    }
}

class TV{
    Channel channel;

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    void swithChannel(){
        if (channel instanceof Inter)
            setChannel(new ICTV());
        else if (channel instanceof ICTV)
            setChannel(new STB());
        else if (channel instanceof STB)
            setChannel(new Inter());
    }
    void watchTV(){
        channel.show();
    }
}