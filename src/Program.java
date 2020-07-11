import java.util.LinkedList;
import java.util.List;

public class Program extends Clock {


    public Program(int hours, int minutes) {
        super(hours, minutes);
    }


    public static void main(String[] args) {

        Clock clock = new Clock(7, 30);
        Clock clock1 = new Clock(9, 30);
        Clock clock2 = new Clock(10, 50);



    List Clock = new LinkedList<Clock>();
        Clock.add(clock.toString());
        Clock.add(clock1.toString());
        Clock.add(clock2.toString());




    for(int i = 0; i < 1;i++){
        System.out.println("Zegary przed zmiana");
        System.out.println(clock);
        System.out.println(clock1);
        System.out.println(clock2);

        clock.increment();
        clock1.increment();
        clock2.increment();
        System.out.println("\n");
        System.out.println("zegary po zmianie");
        System.out.println(clock.toString());
        System.out.println(clock1.toString());
        System.out.println(clock2.toString());

        System.out.println("\n");
        System.out.println("lista po zmianie");
        System.out.println(clock);
        System.out.println(clock1);
        System.out.println(clock2);

    }
}
}
