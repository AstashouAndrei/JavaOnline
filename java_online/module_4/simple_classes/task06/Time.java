package by.java_online.module_4.simple_classes.task06;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {

        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }

        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }

        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    public void changeHours(int hours) {
        if (this.hour + hours >= 0 && this.hour + hours < 24) {
            this.hour = this.hour + hours;
        } else if (this.hour + hours >= 24) {
            this.hour = (this.hour + hours) % 24;
        } else {
            this.hour = 24 - Math.abs((this.hour + hours) % 24);
        }
    }

    public void changeMinutes(int minutes) {
        if (0 < this.minute + minutes && this.minute + minutes < 60) {
            this.minute = this.minute + minutes;
        } else if (this.minute + minutes >= 60) {
            changeHours((this.minute + minutes) / 60);
            this.minute = (this.minute + minutes) % 60;
        } else {
            if (Math.abs(this.minute + minutes) > 60) {
                changeHours((this.minute + minutes) / 60 - 1);
                this.minute = 60 - Math.abs((this.minute + minutes) % 60);
            } else {
                changeHours((this.minute + minutes) / 60 - 1);
                this.minute = Math.abs((this.minute + minutes) % 60);
            }
        }
    }

    public void changeSeconds(int second) {
        if (0 < this.second + second && this.second + second < 60) {
            this.second = this.second + second;
        } else if (this.second + second >= 60) {
            changeMinutes((this.second + second) / 60);
            this.second = (this.second + second) % 60;
        } else {
            if (Math.abs(this.second + second) > 60) {
                changeMinutes((this.second + second) / 60 - 1);
                this.second = 60 - Math.abs((this.second + second) % 60);
            } else {
                changeMinutes((this.second + second) / 60 - 1);
                this.second = Math.abs((this.second + second) % 60);
            }
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void setHour(int hour) {
        if (hour < 24 && hour > 0) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if (minute < 24 && minute > 0) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        if (second < 24 && second > 0) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    public int getSecond() {
        return second;
    }
}
