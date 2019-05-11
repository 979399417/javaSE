public class clock {
  private int shi,fen,miao;

    public clock(int shi, int fen, int miao) {
        this.shi = shi;
        this.fen = fen;
        this.miao = miao;
    }
    public void clockstart(){
        display c=new display(shi,fen,miao);
        while(true){
            c.star();
        }
    }
}

