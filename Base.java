public abstract class Base implements Checkable {
    private Boolean work;

    public void start() {
        this.work = true;
        System.out.println("Запущена работа швейной машинки");
        startInternal();
    }

    protected abstract void startInternal();

    public void stop() {
        this.work = false;
        System.out.println("Швейная машинка остановлена");
        stopInternal();
    }

    protected abstract void stopInternal();

    public void sevinMachineUp(int level) {
        if (this.work) {
            System.out.printf("Переключение режима работы швейной машинки на  %d%n", level);
            sevinMachineUpInteral(level);
        }
    }

    protected abstract void sevinMachineUpInteral(int level);

    public void sevinMachineDown(int level) {
        if (this.work) {
            System.out.printf("Возврат швейной машинки на %d%n", level);
        }
    }

    public Boolean getWork() {
        return work;
    }
}