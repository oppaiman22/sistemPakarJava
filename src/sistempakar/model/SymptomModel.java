package sistempakar.model;

import java.util.ArrayList;

/**
 *
 * @author iqbal
 */
public class SymptomModel {
    private int id;
    private float percentage;
    private ArrayList<Integer> rules;

    public SymptomModel() {
        rules = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public ArrayList<Integer> getRules() {
        return rules;
    }
    
    public void addRules(Integer id){
        rules.add(id);
    }
    
}
