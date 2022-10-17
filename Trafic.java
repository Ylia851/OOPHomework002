public class Trafic implements Checkable {
    public void rotate() {
        System.out.println("Швейная машинка работает крутится");
    }

    @Override
    public void check() {
        System.out.println("Ок");
    }
}
