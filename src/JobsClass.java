public class JobsClass implements JobsInterface {
    @Override
    public void job(String j) {
        System.out.print("��������� ��������� �� ������������� \"" + j + "\". ");
    }

    @Override
    public void salary(int s) {
        System.out.print("���������� ����� �� " + s + "������.");
    }

    @Override
    public void pnumber(String n) {
        System.out.println("�������: " + n);
    }
}
