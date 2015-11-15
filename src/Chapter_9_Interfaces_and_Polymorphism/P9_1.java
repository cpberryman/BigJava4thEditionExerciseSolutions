package Chapter_9_Interfaces_and_Polymorphism;

/**
 * Solution to exercise P9.1
 *
 * @author ChrisBerryman
 */
 public class P9_1 {

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
      Die d = new Die(6);
      Die d1 = new Die(6);
      Die d2 = new Die(6);
      Die d3 = new Die(6);
      Die d4 = new Die(6);

      DataSet set = new DataSet();

      set.add(d);
      set.add(d1);
      set.add(d2);
      set.add(d3);
      set.add(d4);

      System.out.println(set.getAverage());
     }

}
