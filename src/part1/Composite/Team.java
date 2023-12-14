package part1.Composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> developers = new ArrayList<Developer>();

    public void addDev(Developer developer){
        developers.add(developer);
    }

    public void removeDev(Developer developer){
        developers.remove(developer);
    }

    public void createProject(){
        System.out.println("Работают дворфы");
        for(Developer developer: developers){
            developer.writeCode();
        }
    }
}
