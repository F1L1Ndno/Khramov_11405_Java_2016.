public class TestingClass implements TestingInterface {
    @Override
    public void bnum(int b) {
        System.out.print("Отделом тестировщиков найдено " + b + " багов, ");
    }

    @Override
    public void cbnum(int cb) {
        System.out.print("из них " + cb + " критических. Следовательно, ");
    }

    @Override
    public void prod(boolean r) {
        if (r)
            System.out.print("продукт можно выпускать в продакшн.");
        else
            System.out.println("продукт не готов к выпуску, требуются багфиксы.");

    }

}
