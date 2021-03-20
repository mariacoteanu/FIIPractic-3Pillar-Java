package training1;

public class Time {

    private int hour;
    private int minute;
    private int second;


    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }

    public Time nextSecond() {
        Time t = new Time(this.hour, this.minute, this.second);
        if (t.getSecond() < 59) {
            t.setSecond(t.second + 1);
        }
        else if(t.getSecond() == 59){
            t.setSecond(0);
            if(t.getMinute() == 59){
                t.setMinute(0);
                if(t.getHour() < 23){
                    t.setHour(t.getHour()+1);
                }
                else{
                    t.setHour(0);
                }
            }
            else{
                t.setMinute(t.getMinute()+1);
            }
        }
        return t;
    }

    public Time previousSecond(){
        Time t = new Time(this.hour, this.minute, this.second);
        if(t.getSecond() > 0){
            t.setSecond(t.getSecond()-1);
        }
        else{
            t.setSecond(59);
            if(t.getMinute()>0){
                t.setMinute(t.getMinute()-1);
            }
            else{
                t.setSecond(59);
                if(t.getHour()>0){
                    t.setHour(t.getHour()-1);
                }
                else{
                    t.setHour(23);
                }
            }
        }

        return t;
    }
}
