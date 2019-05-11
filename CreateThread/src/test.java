public class test {
    public static void main(String[] args) {
        TicketRunnable t=new TicketRunnable();
        Thread a=new Thread(t,"售票点1");
        Thread b=new Thread(t,"售票点2");
        Thread c=new Thread(t,"售票点3");
        Thread d=new Thread(t,"售票点4");
        a.start();
        b.start();
        c.start();
        d.start();
//        TicketThread e=new TicketThread("售票点1");
//        TicketThread f=new TicketThread("售票点1");
//        TicketThread g=new TicketThread("售票点1");
//        TicketThread h=new TicketThread("售票点1");
//        e.start();
//        f.start();
//        g.start();
//        h.start();
    }
}
