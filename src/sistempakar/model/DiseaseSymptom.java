
package sistempakar.model;

/**
 *
 * @author iqbal
 */
public class DiseaseSymptom extends SymptomModel{
    private String diseaseName;

    public DiseaseSymptom(String diseaseName) {
        super();
        this.diseaseName = diseaseName;
    }
    
    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }
    
}
