
    public class Clock {
   //    private int x, y,z;
        private display hour=new display(24);
        private display minute=new display(60);
        private  display second=new display(60);
        public Clock(int hour,int minute,int second){
            this.hour=new display(hour);
            this.minute=new display(minute);
            this.second=new display(second);

        }


        public void tick(){

            second.increase();
            if(second.getValuee()==0){
                minute.increase();
            }
            if (minute.getValuee()==0){
               hour.increase();
            }
        }
        public String toString(){
            String x=new String();
            String.format("%02d:%02d;%02d",hour,minute,second);
            return x;
        }
        public void star(){
            while (true){
                tick();
                System.out.println(toString());
            }
        }



    }



