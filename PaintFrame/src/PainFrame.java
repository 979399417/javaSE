public class PainFrame {
    public  static void drawFrame(MyFrame f){
        System.out.println("启动线程");
        System.out.println("增加循环");
        System.out.println("查看消息线");

        f.paint();
        System.out.println("启动缓存，提升效率");
    }
    public static void main(String[] args){
        drawFrame(new GameFrame02());
    }
}
class GameFrame01 implements MyFrame{
    public void paint(){
        System.out.println("GameFrame01.paint()");
        System.out.println("画窗口");
    }
}
class GameFrame02 implements MyFrame{
    public void paint(){
        System.out.println("GameFrame02.paint()");
        System.out.println("画窗口");
    }
}