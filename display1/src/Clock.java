public class Clock {
    private int hour, minute, second;

    public Clock(int hour, int minure, int second) {
        this.hour = hour;
        this.minute = minure;
        this.second = second;
    }

        public void tick () {
            second++;
            if (second == 60) {
                second = 0;
                minute++;
            }
            if (minute == 60) {
                hour++;
                minute = 0;
            }
            if (hour == 24) {
                hour = 0;
            }
        }


        public String toString () {
            String a = new String();
            String b = new String();
            String c = new String();
            String d = new String();

            b = "";
            c = ":";
            d = ":";
            if (hour < 10) {
                b = "0";
            }
            if (minute < 10) {
                c = ":0";
            }
            if (second < 10) {
                d = ":0";
            }
            return
                    b + hour +
                    c + minute +
                    d + second ;

        }
    }



