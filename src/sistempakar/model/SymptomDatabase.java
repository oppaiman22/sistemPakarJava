package sistempakar.model;

import java.util.ArrayList;

/**
 *
 * @author iqbal
 */
public class SymptomDatabase {
    private ArrayList<SymptomModel> symptoms;

    public ArrayList<SymptomModel> getSymptoms() {
        return symptoms;
    }
    
    private SymptomDatabase() {
        symptoms = new ArrayList<>();
        createChildSymptoms();
        createDiseases();
        createViruses();
        addDiseaseRules();
        addVirusRules();
    }
    
    private void createChildSymptoms(){
        symptoms.add(new ChildSymptom("Apakah anda sering mengalami buang air besar (lebih dari 2 kali)?"));
        symptoms.add(new ChildSymptom("Apakah anda mengalami berak encer?"));
        symptoms.add(new ChildSymptom("Apakah anda mengalami berak berdarah?"));
        symptoms.add(new ChildSymptom("Apakah anda merasa lesu dan tidak bergairah?"));
        symptoms.add(new ChildSymptom("Apakah anda tidak selera makan?"));
        symptoms.add(new ChildSymptom("Apakah anda merasa mual dan sering muntah (lebih dari 1 kali) ?"));
        symptoms.add(new ChildSymptom("Apakah anda merasa sakit di bagian perut ?"));
        symptoms.add(new ChildSymptom("Apakah tekanan darah anda rendah ?"));
        symptoms.add(new ChildSymptom("Apakah anda merasa pusing ?"));
        symptoms.add(new ChildSymptom("Apakah anda mengalami pingsan ?"));
        symptoms.add(new ChildSymptom("Apakah suhu badan anda tinggi ?"));
        symptoms.add(new ChildSymptom("Apakah anda mengalami luka di bagian tertentu ?"));
        symptoms.add(new ChildSymptom("Apakah anda tidak dapat menggerakkan anggota badan tertentu ?"));
        symptoms.add(new ChildSymptom("Apakah anda pernah memakan sesuatu ?"));
        symptoms.add(new ChildSymptom("Apakah anda memakan daging ?"));
        symptoms.add(new ChildSymptom("Apakah anda memakan jamur ?"));
        symptoms.add(new ChildSymptom("Apakah anda memakan makanan kaleng ?"));
        symptoms.add(new ChildSymptom("Apakah anda membeli susu ?"));
        symptoms.add(new ChildSymptom("Apakah anda meminum susu ?"));
    }
    
    private void createDiseases() {
        symptoms.add(new DiseaseSymptom("Mencret"));
        symptoms.add(new DiseaseSymptom("Muntah"));
        symptoms.add(new DiseaseSymptom("Sakit perut"));
        symptoms.add(new DiseaseSymptom("Darah rendah"));
        symptoms.add(new DiseaseSymptom("Koma"));
        symptoms.add(new DiseaseSymptom("Demam"));
        symptoms.add(new DiseaseSymptom("Septicaemia"));
        symptoms.add(new DiseaseSymptom("Lumpuh"));
        symptoms.add(new DiseaseSymptom("Mencret berdarah"));
        symptoms.add(new DiseaseSymptom("Makan daging"));
        symptoms.add(new DiseaseSymptom("Makan jamur"));
        symptoms.add(new DiseaseSymptom("Makan makanan kaleng"));
        symptoms.add(new DiseaseSymptom("Minum susu"));        
    }
    
    private void createViruses(){
        symptoms.add(new VirusSymptom("Staphylococcus aureus"));
        symptoms.add(new VirusSymptom("jamur beracun"));
        symptoms.add(new VirusSymptom("Salmonellae"));
        symptoms.add(new VirusSymptom("Clostridium botulinum"));
        symptoms.add(new VirusSymptom("Campylobacter"));
    }
    
    private void addDiseaseRules() {
        //mencret
        symptoms.get(19).addRules(0);
        symptoms.get(19).addRules(1);
        symptoms.get(19).addRules(2);
        symptoms.get(19).addRules(4);
        
        //muntah
        symptoms.get(20).addRules(3);
        symptoms.get(20).addRules(4);
        symptoms.get(20).addRules(5);
        
        //sakit perut
        symptoms.get(21).addRules(3);
        symptoms.get(21).addRules(6);   
        
        //darah rendah
        symptoms.get(22).addRules(3);
        symptoms.get(22).addRules(7);
        symptoms.get(22).addRules(8);
        
        //koma
        symptoms.get(23).addRules(7);
        symptoms.get(23).addRules(9);
        
        //demam
        symptoms.get(24).addRules(3);
        symptoms.get(24).addRules(4);
        symptoms.get(24).addRules(8);
        symptoms.get(24).addRules(10);
        
        //Septicaemia
        symptoms.get(25).addRules(3);
        symptoms.get(25).addRules(4);
        symptoms.get(25).addRules(7);
        symptoms.get(25).addRules(11);
        
        //lumpuh
        symptoms.get(26).addRules(3);
        symptoms.get(26).addRules(12);
        
        //mencret berdarah
        symptoms.get(27).addRules(1);
        symptoms.get(27).addRules(2);
        symptoms.get(27).addRules(3);
        symptoms.get(27).addRules(4);
        symptoms.get(27).addRules(5);
        
        //makan daging
        symptoms.get(28).addRules(13);
        symptoms.get(28).addRules(14);
        
        //makan jamur
        symptoms.get(29).addRules(13);
        symptoms.get(29).addRules(15);
        
        // Makan makanan kaleng
        symptoms.get(30).addRules(13);
        symptoms.get(30).addRules(16);
        
        //minum susu
        symptoms.get(31).addRules(17);
        symptoms.get(31).addRules(18);
    }
    
    private void addVirusRules() {
        //Staphylococcus aureus
        symptoms.get(32).addRules(19);
        symptoms.get(32).addRules(20);
        symptoms.get(32).addRules(21);
        symptoms.get(32).addRules(22);
        symptoms.get(32).addRules(28);
        
        //jamur beracun
        symptoms.get(33).addRules(19);
        symptoms.get(33).addRules(20);
        symptoms.get(33).addRules(21);
        symptoms.get(33).addRules(23);
        symptoms.get(33).addRules(29);
        
        //Salmonellae
        symptoms.get(34).addRules(19);
        symptoms.get(34).addRules(20);
        symptoms.get(34).addRules(21);
        symptoms.get(34).addRules(24);
        symptoms.get(34).addRules(25);
        symptoms.get(34).addRules(28);
        
        // Clostridium botulinum
        symptoms.get(35).addRules(20);
        symptoms.get(35).addRules(26);
        symptoms.get(35).addRules(30);
        
        //Campylobacter 
        symptoms.get(36).addRules(28);
        symptoms.get(36).addRules(22);
        symptoms.get(36).addRules(24);
        symptoms.get(36).addRules(32);
    }
    
    public static SymptomDatabase getInstance() {
        return SymptomDatabaseHolder.INSTANCE;
    }
    
    private static class SymptomDatabaseHolder {

        private static final SymptomDatabase INSTANCE = new SymptomDatabase();
    }
}
