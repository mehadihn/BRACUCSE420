import java.io.File;
import java.util.Scanner;
public class lab4{
  public static void main (String[] args){
    try{
     Scanner sc = new Scanner(new File("input.txt"));
     while(sc.hasNext()){
       String temp = sc.nextLine();
       String temp1 = sc.next();
       if (temp.contains("(") && temp1.contains("{")){

        String[] t1 = temp.split("\\("); 
        
        String[] a = t1[0].split(" ");
        int t = a.length;
        System.out.print(a[t-1]);
     
        String p2 = "("+t1[1];
        System.out.print(p2);
        
        System.out.println(", return type: "+ a[t-2]);

       }
     }
     
    }
    catch (Exception e){}
  }
}