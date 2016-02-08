import java.util.ArrayList;

public class ProjectClass implements ProjectInterface {
    @Override
    public void name(String p) {
        System.out.print("��� ������� " + p + " ");
    }

    @Override
    public void spec(ArrayList<String> s) {
        System.out.print("��������� �����������: ");
        for (String x : s) {
            System.out.print(x + ", ");
        }
    }

    @Override
    public void time(int t) {
        System.out.print("����� �� ���������� - " + t + " ����");
    }
}
