public class Demo04chat_user1 {

    public static void main(String[] args) {
//        SendThread u1=new SendThread(7078);
//        ReceiveThread u2=new ReceiveThread(1222);
//        u1.start();
//        u2.start();
        Send02Thrad u1=new Send02Thrad(3366);
        Receive02Thread u2=new Receive02Thread(3388);
        u1.start();
        u2.start();
    }
}
