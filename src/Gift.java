//Ethan Sexton | CSC 325 Assignment 3
public class Gift extends Skill {
    // Constructors for 3 arguments, 2 arguments, and no arguments
    public Gift(String name, String type, int level) {
        super(name, type, level);
    }

    public Gift(String name, int level) {
        super(name, "Gift", level);
    }

    public Gift() {
    }
}