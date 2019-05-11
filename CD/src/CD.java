public class CD extends item {



    private String artist;
    private int numoftracks;



    public CD(String artist, String title, int numoftacks, int payingtime, String coment) {
        super(title,coment,payingtime,false);
        this.artist = artist;
        this.numoftracks=numoftacks;
    }
    @Override
    public String toString(){
        return "CD [artist="+artist+",numiftracks="+numoftracks+",toString()="+super.toString()+"}";
    }
    @Override
    public boolean equals(Object obj){
        CD ce=(CD)obj;
        return artist.equals(ce.artist);
    }



    public static void main(String[] args) {

        CD cd=new CD("a","b",2,2,"...");
        CD cd1=new CD("a","b",2,2,"...");
        System.out.println(cd.equals(cd1));
        cd.print();
        String s="aa"+cd;
        System.out.print(s);
    }


  /*  public void print() {
        System.out.println("cd"+title + ":" + artist);
    }*/
}
