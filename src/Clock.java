public class Clock {
    int minutesToAdd;
    int clockNumber;
    int hours = 0;
    int minToAdd =  minutesToAdd - 1; // DEFAULT Ilosc dodawanych min
    int minutes = 0;
    
    public Clock(int clockNumber, int hours, int minutes) {
        this.clockNumber = clockNumber;
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getClockNumber(){
        return clockNumber;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
    
    public int addMin(int a)
    {
        a += minutes;
        return a;
    }

    public void tick(){
        minutes++;
        
            if(minutes == 60) {
                hours++;
                minutes = 0;
            }
    }

    @Override
    public String toString() {
        return "Zegar " +
                "#" + clockNumber +
                ", Godzina:" + hours +
                ", Minuta:" + minutes;
    }
}

