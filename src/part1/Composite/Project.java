package part1.Composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer JavaDev = new JavaDev();
        Developer CDev = new CDev();
        Developer PythonDev = new PythonDev();

        team.addDev(JavaDev);
        team.addDev(CDev);
        team.addDev(PythonDev);

        team.createProject();
    }
}
