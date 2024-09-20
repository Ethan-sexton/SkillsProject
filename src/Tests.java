//Ethan Sexton | CSC 325 Assignment 3
public class Tests {
    public static void main(String[] args) throws Exception {

        HardSkill cSharp = new HardSkill("cSharp", 5);
        SoftSkill communication = new SoftSkill("Communication", 7);
        Gift humility = new Gift("Humility", 3);
        Virtue patience = new Virtue("Patience", 8);
        cSharp.identifySkill();
        communication.identifySkill();
        humility.identifySkill();
        patience.identifySkill();
    }
}
