public class display {
   private int limit;
   private int value;

   public display(int limit){
       this.limit=limit;
   }
   public void  increase(){
       value++;
       if (value==limit){
           value=0;
       }
   }
   public int getValuee(){
       return value;
    }
    public static void main(String[] args) {




}
}