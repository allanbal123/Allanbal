import java.util.Random;

public class sw11task3 {

  public static void main(String[] args) {
    Random random = new Random();
    
    boolean isHeads;
    
    isHeads = random.nextBoolean();
    
    if(isHeads){
      System.out.println("HEADS");
      }
    else{
      
      System.out.println("TAILS");
      }
    }
  }