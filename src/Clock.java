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
        if (hours  >= 24  && hours >=0) {
            hours = 1;
        }
        
        if(minutes == 60) {
            hours++;
            minutes = 0;
        }
        
    }
    
    void addMin(int add){
        
        int minutesDifference = add % 60;
            minutes = minutes + add;
    
        
        
        if(minutes > 60) {
            minutes = minutesDifference;
        }
        
    }

    @Override
    public String toString() {
        return "Zegar " + "#" + clockNumber + ", Godzina:" + hours + ", Minuta:" + minutes;
    }
}

