public class CapitalClass extends AlgebraicClass implements CapitalInterface {
    @Override
    public void cap(int c) {
        System.out.println("��������� ������� ������� " + c + " ������. ");
    }

    @Override
    public void teamcap(int tc) {
        System.out.println("����� �������� ������� " + tc + " ������. ");
    }

    @Override
    public void prcap(int prc) {
        System.out.println("������ �� PR �������� � ������ ������� - " + prc + " ������. ");
    }

    @Override
    public void salecap(int sc) {
        System.out.println("������, ���������� � ������� �������� - " + sc + " ������. ");
    }

    @Override
    public void paidoff(boolean po) {
        if (po)
            System.out.println("������ ��������.");
        else System.out.println("������ �� ��������.");
    }

}
