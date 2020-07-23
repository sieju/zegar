import java.util.LinkedList;
import java.util.List;

import static java.lang.System.*;

public class Program extends Clock {


    public Program(int clockNumber, int hours, int minutes) {
        super(clockNumber, hours, minutes);
    }

    public static void main(String[] args) {

        Clock clock = new Clock(1,7, 30);
        Clock clock1 = new Clock(2,9, 30);
        Clock clock2 = new Clock(3,23, 59);
        

    for(int i = 0; i < 3;i++){

        out.println("##################################");
        out.println("Zegary przed zmiana");
        out.println(clock);
        out.println(clock1);
        out.println(clock2);

        clock.tick();
        clock1.tick();
        clock2.tick();
        
        
        
        out.println("\n");
        out.println("zegary po zmianie");
        out.println(clock.toString());
        out.println(clock1.toString());
        out.println(clock2.toString());
    
    
        List<Clock> Clock = new LinkedList<Clock>();
        Clock.add(clock);
        Clock.add(clock1);
        Clock.add(clock2);

        out.println("\n");
        out.println("lista po zmianie");
        out.println(Clock);
        out.println("###################################");
        out.println("\n");

    }

}
}
