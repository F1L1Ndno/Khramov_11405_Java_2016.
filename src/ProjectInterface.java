import java.util.ArrayList;

public interface ProjectInterface {
    public void name(String p); //название проекта

    public void spec(ArrayList<String> s); //специалисты, которые нужны в проекте

    public void time(int t); //время на разработку в днях
}
