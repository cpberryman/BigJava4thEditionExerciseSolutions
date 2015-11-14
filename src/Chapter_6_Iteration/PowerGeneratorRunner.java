package Chapter_6_Iteration;

/**
 * Solution to exercise P6.5

 * @author ChrisBerryman
 */
public class PowerGeneratorRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PowerGenerator myGenerator = new PowerGenerator(10);
         for (int i = 0; i < 12; i++) {
             System.out.println(myGenerator.nextPower());
         }
    }    
}
