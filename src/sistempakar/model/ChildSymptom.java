package sistempakar.model;

/**
 *
 * @author iqbal
 */
public class ChildSymptom extends SymptomModel{
    private String Question;

    public ChildSymptom(String Question) {
        super();
        this.Question = Question;
    }

    
    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }
    
}
