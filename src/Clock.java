public class Clock {
    int clockNumber;
    int hours = 0;
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
    
    public void setClockNumber(int clockNumber) {
        this.clockNumber = clockNumber;
    }
    
    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    
    public void tick(){
        
        minutes++;
        if(minutes == 60) {
            hours++;
            minutes = 0;
        }
        
        if (hours  >= 24) {
            hours = 1;
        }
        
        
        
    }
    
    void addMin(int ADD){
        minutes = minutes + ADD;
        int minutesDifference = minutes % 60;
           
        
        if(minutes >= 60) {
            minutes = minutesDifference;
            hours++;
        }
        
        if (hours >= 24)
        {
            hours = 0;
            minutes = minutesDifference;
        }
        
    }

    @Override
    public String toString() {
        return "Zegar " + "#" + clockNumber + ", Godzina:" + hours + ", Minuta:" + minutes;
    }
}

