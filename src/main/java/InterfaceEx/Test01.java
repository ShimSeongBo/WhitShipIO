package InterfaceEx;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
       Bird bird = new Bird();
       bird.fly();
       bird.jump();

       Flyable flyingBird = new Bird();
       flyingBird.fly();

       Jumpable jumpingBird = new Bird();
       jumpingBird.jump();

       Flyable fly = new Flyable() {
           @Override
           public void fly() {
               System.out.println("Anonymous Bird ");
           }
       };
       fly.fly();

        List<Runnable> actions = new ArrayList<Runnable>();
        actions.add(new Runnable() {
            @Override
            public void run() {

            }
        });

        List<Flyable> list = new ArrayList<Flyable>();
        list.add(new Bird());

    }
    interface Flyable {
        void fly();
    }

    interface Jumpable {
        void jump();
    }

    static class Bird implements Flyable, Jumpable {

        @Override
        public void fly() {
            System.out.println("Bird's Flying");
        }

        @Override
        public void jump() {
            System.out.println("Bird's Jumping");
        }
    }
}
