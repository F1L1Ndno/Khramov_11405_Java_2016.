import java.util.ArrayList;

public class ProjectClass implements ProjectInterface {
    @Override
    public void name(String p) {
        System.out.print("Для проекта " + p + " ");
    }

    @Override
    public void spec(ArrayList<String> s) {
        System.out.print("требуются специалисты: ");
        for (String x : s) {
            System.out.print(x + ", ");
        }
    }

    @Override
    public void time(int t) {
        System.out.print("время на разработку - " + t + " дней");
    }
}
