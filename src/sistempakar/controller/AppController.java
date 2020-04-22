package sistempakar.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import sistempakar.model.ChildSymptom;
import sistempakar.model.CustomCheckBox;
import sistempakar.model.SymptomDatabase;
import sistempakar.model.SymptomModel;
import sistempakar.model.VirusSymptom;
import sistempakar.view.MainAppFrame;

/**
 *
 * @author iqbal
 */
public class AppController {
    private final MainAppFrame frame;
    private final SymptomDatabase DB = SymptomDatabase.getInstance();
    public final int QUESTION_LAST_INDEX = 19;
    public final int QUESTION_FIRST_INDEX = 0;
    public final int DISEASE_LAST_INDEX = 32;
    public final int DISEASE_FIRST_INDEX = 19;
    public final int VIRUS_LAST_INDEX = 32;
    public final int VIRUS_FIRST_INDEX =37;
    
    public static void main(String[] args) {
        AppController a = new AppController();
    }
    
    public AppController() {
        frame = new MainAppFrame();
        addButtonToPanel();
        frame.addProceedButonListener(new proceedButtonPressed());
        frame.setVisible(true);
    }
    
    public void addButtonToPanel(){
        for (int i = 0; i < 19; i++) {
            ChildSymptom tempSymptom = (ChildSymptom)DB.getSymptoms().get(i);
            CustomCheckBox temp = new CustomCheckBox();
            temp.setText(tempSymptom.getQuestion());
            temp.setId(i);
            temp.addItemListener(new chekBoxItemChange());
            frame.addCheckBoxToPanel(temp);
        }
    }
    
    public void performDiseaseCheck(){
        SymptomModel temp;
        int rulesCount;
        float percentage;
        for (int i = 19; i < 32; i++) {
            percentage = 0;
            temp = DB.getSymptoms().get(i);
            rulesCount = temp.getRules().size();
            for (int j = 0; j < rulesCount; j++) {
                int index = temp.getRules().get(j);
                percentage += DB.getSymptoms().get(index).getPercentage();
            }
            temp.setPercentage(percentage/rulesCount);
        }
    }
    
    public void performVirusCheck(){
        SymptomModel temp;
        int rulesCount;
        float percentage;
        for (int i = 32; i < 37; i++) {
            percentage = 0;
            temp = DB.getSymptoms().get(i);
            rulesCount = temp.getRules().size();
            for (int j = 0; j < rulesCount; j++) {
                int index = temp.getRules().get(j);
                percentage += DB.getSymptoms().get(index).getPercentage()/rulesCount;
            }
            temp.setPercentage(percentage);
        }
    }
    
    
    private class proceedButtonPressed implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
              
            float value = frame.getPercentageText();
            frame.clearTextArea();
            performDiseaseCheck();
            performVirusCheck();
            for (int i = 32; i < 37; i++) {
                VirusSymptom temp = (VirusSymptom) DB.getSymptoms().get(i);
                float percentage = temp.getPercentage()*100;
                frame.appendTextArea(temp.getVirusName()+" = "+percentage +"%");
                if(percentage >= value)
                    frame.setSymptomLabel(temp.getVirusName());
            }   
        }
        
    }
    
    private class chekBoxItemChange implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e) {
            
            CustomCheckBox a = (CustomCheckBox) e.getSource();
            if(e.getStateChange() == ItemEvent.SELECTED){
                DB.getSymptoms().get(a.getId()).setPercentage(1);
            }else{
                DB.getSymptoms().get(a.getId()).setPercentage(0);
            } 
        }
    }
   
}
