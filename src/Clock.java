public class Clock {

    int hours = 0;
    int minutes = 0;
    //int seconds;


    public Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void increment(){
            minutes++;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }
}

