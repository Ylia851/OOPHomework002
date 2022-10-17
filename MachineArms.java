public class MachineArms extends Base {
    @Override
    protected void startInternal() {
        System.out.println("Швейная ручная машинка запущена");
    }

    @Override
    protected void stopInternal() {
        System.out.println("Швейная ручная машинка остановлена");
    }

    @Override
    protected void sevinMachineUpInteral(int level) {
        System.out.println("Швейная ручная машинка ускорена");
    }

    @Override
    public void check() {
        System.out.println("Ок");
}
