public class TestingClass implements TestingInterface {
    @Override
    public void bnum(int b) {
        System.out.print("������� ������������� ������� " + b + " �����, ");
    }

    @Override
    public void cbnum(int cb) {
        System.out.print("�� ��� " + cb + " �����������. �������������, ");
    }

    @Override
    public void prod(boolean r) {
        if (r)
            System.out.print("������� ����� ��������� � ��������.");
        else
            System.out.println("������� �� ����� � �������, ��������� ��������.");

    }

}
