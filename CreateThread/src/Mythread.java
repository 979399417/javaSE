public class Mythread extends Thread {
    public Mythread() {
        super();
    }
    public Mythread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            if(interrupted()){
                System.out.println("释放资源");
                break;
            }
            System.out.println(getName()+":"+i);
        }
    }
}
