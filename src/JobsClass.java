public class JobsClass implements JobsInterface {
    @Override
    public void job(String j) {
        System.out.print("Требуются работники по специальности \"" + j + "\". ");
    }

    @Override
    public void salary(int s) {
        System.out.print("Заработная плата от " + s + "рублей.");
    }

    @Override
    public void pnumber(String n) {
        System.out.println("Телефон: " + n);
    }
}
