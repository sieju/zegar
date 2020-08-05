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
        Clock clock2 = new Clock(3,0, 59);
    
        List <Clock> clocks = new LinkedList<Clock>();
        clocks.add(clock);
        clocks.add(clock1);
        clocks.add(clock2);
      
        
        for (Clock c: clocks) {
            
            out.println("Zegar #" + c.getClockNumber() + " przed zmianą |"  + " Godzina : "+ c.getHours()+ " Minuta: " + c.getMinutes());
            c.tick();
            out.println("Zegar #" + + c.getClockNumber() + " po zmianie o 1 min |" + " Godzina : "+ c.getHours()+ " Minuta: " + c.getMinutes());
            c.addMin(15);
            out.println("Zegar #" + + c.getClockNumber() + " po dodaniu X min |" + " Godzina : "+ c.getHours()+ " Minuta: " + c.getMinutes());
    
        }
    
        out.println("\n");
        out.println("##########################################################################################################################");
        out.println("\n");
    
        for (Clock c: clocks) {
        
            out.println("Zegar #" + c.getClockNumber() + " przed zmianą |"  + " Godzina : "+ c.getHours()+ " Minuta: " + c.getMinutes());
            //c.tick();
            //out.println("Zegar #" + + c.getClockNumber() + " po zmianie o 1 min |" + " Godzina : "+ c.getHours()+ " Minuta: " + c.getMinutes());
            c.addMin(15);
            out.println("Zegar #" + + c.getClockNumber() + " po dodaniu X min |" + " Godzina : "+ c.getHours()+ " Minuta: " + c.getMinutes());
        
        }
    
        
        
        
        //out.println("Zegary po zmianie o 1 min: " + clocks.toString());
   }
}
