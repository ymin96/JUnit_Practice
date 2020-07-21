package iloveyouboss;

import java.util.ArrayList;
import java.util.List;

public class ScoreCollection {
    private List<Scroeable> scores = new ArrayList<>();

    public void add(Scroeable scroeable){
        scores.add(scroeable);
    }

    public int arithmeticMean(){
        int total = scores.stream().mapToInt(Scroeable::getScore).sum();
        return total/ scores.size();
    }
}
