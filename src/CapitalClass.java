public class CapitalClass extends AlgebraicClass implements CapitalInterface {
    @Override
    public void cap(int c) {
        System.out.println("Начальный капитал проекта " + c + " рублей. ");
    }

    @Override
    public void teamcap(int tc) {
        System.out.println("Общая зарплата команды " + tc + " рублей. ");
    }

    @Override
    public void prcap(int prc) {
        System.out.println("Деньги на PR компанию и прочие расходы - " + prc + " рублей. ");
    }

    @Override
    public void salecap(int sc) {
        System.out.println("Деньги, вырученные с продажи продукта - " + sc + " рублей. ");
    }

    @Override
    public void paidoff(boolean po) {
        if (po)
            System.out.println("Проект окупился.");
        else System.out.println("Проект не окупился.");
    }

}
