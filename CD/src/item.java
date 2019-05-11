public class item {
    private String title;//protect同一个包内可以访问
    private int payingtime;
    private boolean gotit = false;
    private String coment;
    public item(){

    }
    public void settitle(String title){
        this.title=title;
    }

    public item(String title,String coment,int payingtime,boolean gotit) {
        super();
        this.title = title;
        this.coment=coment;
        this.gotit=gotit;
        this.payingtime=payingtime;
    }

    public void print(){
        System.out.println(title);

    }
}
