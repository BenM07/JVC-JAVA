import jvc.sys.Program;
import jvc.escape.Color;

public class Test extends Program {
    
    public Test() {
        
        String name = "";
        name = input("what is your name: ", name);
        println(Color.GREEN + "Hello " + name + Color.RESET);
        
    } // close constructor
    
    public static void main(String[] args) {
        
        Test test = new Test();
        
    } // close main method
    
} // close class


