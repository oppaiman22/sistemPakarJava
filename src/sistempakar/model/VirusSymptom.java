package sistempakar.model;

/**
 *
 * @author iqbal
 */
public class VirusSymptom extends SymptomModel{
    private String virusName;

    public VirusSymptom(String virusName) {
        super();
        this.virusName = virusName;
    }

    public String getVirusName() {
        return virusName;
    }
    
}
