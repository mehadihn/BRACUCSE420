import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Lab03{
  public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    
    System.out.println("How Many RE?:");
    int n = sc.nextInt();
    String[] reA = new String [n];
    
    for (int  i = 0 ; i < n ; i++){
      System.out.println("Enter RE "+ i);
      reA[i] = sc.next();
    }
    
    System.out.println("How Many Sentences?:");
    n = sc.nextInt();
    String[] lineA = new String [n];
    
    for (int  i = 0 ; i < n ; i++){
      System.out.println("Enter Sentences "+ i);
      lineA[i] = sc.next();
    }

    Matcher m;
    Pattern r;


    for (int i = 0 ; i < lineA.length ; i++){
      Boolean a = false;
      int line = 100 ;
      for (int j = 0 ; j < reA.length ; j++){
        r = Pattern.compile(reA[j]);
        m = r.matcher(lineA[i]);
        
          if(m.find()){
           // System.out.println("YES, " + j);
            a =true;
            line  = j;
            break;
          }
          
        }
      
      if(a){
        System.out.println("YES, " + line);
      }
      else{
        System.out.println("No Match");
      }

      
    }
  }
}