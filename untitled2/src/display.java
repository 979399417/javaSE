public class display {




        private int shi,fen,miao;

        public display(int shi, int fen, int miao) {
            this.shi = shi;
            this.fen = fen;
            this.miao = miao;
        }
        public String star(){
            miao++;
            if(miao==60){
                miao=0;
                fen++;
            }
            if(fen==60){
                shi++;
                fen=0;
            }
            if(shi==24){
                shi=0;
            }
            return ;
        }



    }
