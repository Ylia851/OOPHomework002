public class MachineAvtomat extends Base {
    @Override
    protected void startInternal() {
        System.out.println("Швейная машинка-автомат запущена");
    }

    @Override
    protected void stopInternal() {
        System.out.println("Швейная машинка-автомат остановлена");
    }

    @Override
    protected void sevinMachineUpInteral(int level) {
        System.out.println("Швейная машинка-автомат ускорен");
    }

    @Override
    public void check() {
        System.out.println("Ок");
}
