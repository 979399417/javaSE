public class Demo05chat_user2 {
    public static void main(String[] args) {
//        ReceiveThread u1=new ReceiveThread(7078);
//        SendThread u2=new SendThread(1222);
//        u2.start();
//        u1.start();
        Send02Thrad u1=new Send02Thrad(3388);
        Receive02Thread u2=new Receive02Thread(3366);
        u1.start();
        u2.start();
        System.out.println(Enum.STUDENT.ordinal());

    }
}
