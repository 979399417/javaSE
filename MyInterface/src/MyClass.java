public  class MyClass implements MyInterface {

    @Override
    public void text() {
        System.out.println("text");

    }

    @Override
    public int text02(int a, int b) {
        System.out.println("text02");
        return a+b;
    }
}
