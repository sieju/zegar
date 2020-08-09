import java.util.LinkedList;
import java.util.List;

import static java.lang.System.out;

public class Program extends Clock {
    
    
    public Program(int clockNumber, int hours, int minutes) {
        super(clockNumber, hours, minutes);
    }
    
    public static void main(String[] args) {
        
        final int ADD = 15;

        Clock clock = new Clock(1,7, 45);
        Clock clock1 = new Clock(2,9, 45);
        Clock clock2 = new Clock(3,0, 59);
    
        List <Clock> clocks = new LinkedList<Clock>();
        clocks.add(clock);
        clocks.add(clock1);
        clocks.add(clock2);
      
        
        for (Clock c: clocks) {
            
            out.println("Zegar #" + c.getClockNumber() + " przed zmianą |"  + " Godzina : "+ c.getHours()+ " Minuta: " + c.getMinutes());
            c.tick();
            out.println("Zegar #" + + c.getClockNumber() + " po zmianie o 1 min |" + " Godzina : "+ c.getHours()+ " Minuta: " + c.getMinutes());
            c.addMin(ADD);
            out.println("Zegar #" + + c.getClockNumber() + " po dodaniu X min |" + " Godzina : "+ c.getHours()+ " Minuta: " + c.getMinutes());
    
        }
   }
}
