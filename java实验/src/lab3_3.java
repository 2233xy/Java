interface Display {
    void display();
}

class Inform implements Display {

    @Override
    public void display() {
        System.out.println("通知内容");
    }
}

class Car implements Display {

    @Override
    public void display() {
        System.out.println("汽车油量");
    }
}

class Adervise implements Display {

    @Override
    public void display() {
        System.out.println("广告消息");
    }
}

public class lab3_3 {

    public static void main(String[] args) {
        Display[] arr = { new Inform(), new Car(), new Adervise() };
        for (Display d : arr) {
            d.display();
        }
    }

}
