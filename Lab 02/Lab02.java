import java.util.Scanner;
public class Lab02{
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter How Many Numbers?:");
    int n = sc.nextInt();
    String s[] = new String[n];
    int lineCheck[] = new int [n];
    int errorCheck = 0;
    //int webLine = new int [n];
    
    for (int i = 0 ; i < n ; i++){
      System.out.println("Enter Web/Email:");
      s[i] = sc.next();
    }
    
    for (int i = 0 ; i < n ; i++){
      
      if(s[i].startsWith("www.") && s[i].endsWith(".com")){
        String[] check = s[i].split("\\." );
        char[] c = check[1].toCharArray();
        
        for(int j = 0 ; j < c.length ; j++){
          int a = (int) c[j];
          if((a>=65 && a <=90) || (a>=97 && a<=122) || (a>=48 && a<=57)){
            //lineCheck[i] = "web";
          }
          else{
            System.out.println(c[j]);
            errorCheck++;
          }
        }
        
        if(errorCheck==0){
          System.out.println("Valid");
          lineCheck[i] = 1;
        }
        errorCheck = 0;
      }
      
      
      else if(s[i].contains("@") && s[i].endsWith(".com")){
        lineCheck[i] = 2;
      }
    }
    
    String web = "";
    String email = "";
    
    System.out.print("Email Lines: ");
    for(int i = 0 ; i <n ; i++){
      if (lineCheck[i] == 2){
        System.out.print(i + " " );
      }
    }
    System.out.println();
    System.out.print("Website Lines: ");
    for(int i = 0 ; i <n ; i++){
      if (lineCheck[i]== 0){
        System.out.print(i + " " );
      }
    }
  }
  
//    System.out.println(web);
//    System.out.println(email);
  
}
