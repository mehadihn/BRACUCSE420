import java.util.*; 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Lab01{
  public static void main (String [] args){
    File text = new File("input.txt");
    Scanner sc;
    try{
      sc = new Scanner(text);
      
      ArrayList <String> keywords = new ArrayList(Arrays.asList(
                                                                "abstract", "break", "boolean", "byte", "case",
                                                                "catch", "char", "class", "continue", "default", "do", "double",
                                                                "else", "extends", "final", "finally", "float", "for", "if",
                                                                "implements", "import", "instanceof", "int", "interface", "long",
                                                                "native", "new", "package", "private", "protected", "public",
                                                                "return", "short", "static", "super", "switch", "synchronized",
                                                                "this", "throw", "throws", "transient", "try", "void", "volatile",
                                                                "while", "false", "true", "null"));
      
      ArrayList <String> identifiers = new ArrayList(Arrays.asList("a", "b", "c", "d","e",
                                                                   "f", "g", "h", "i", "j",
                                                                   "k", "l", "m", "n", "o",
                                                                   "p", "q", "r", "s", "t", 
                                                                   "u", "v", "w", "x",
                                                                   "y", "z", "A", "B", "C", 
                                                                   "D","E", "F", "G", "H", "I", 
                                                                   "J", "K", "L", "M", "N", "O",
                                                                   "P", "Q", "R", "S", "T", "U", 
                                                                   "V", "W", "X", "Y", "Z"));
      
      ArrayList <String> logic = new ArrayList(Arrays.asList(">", "<", ">=", "<=","||","&&","^","|","&","!"));
      ArrayList <String> math = new ArrayList(Arrays.asList("+", "-", "=", "/","%","*","++","--"));
      ArrayList <String> others = new ArrayList(Arrays.asList(",", ";", "(",")","{","}","[","]"));
      
      
      Set<String> pmath = new HashSet<String>(); 
      Set<String> pothers = new HashSet<String>(); 
      Set<String> pid = new HashSet<String>(); 
      Set<String> pnum = new HashSet<String>(); 
      Set<String> pkey = new HashSet<String>();
      Set<String> plogic = new HashSet<String>();
      
      
      String temp;
      
      while (sc.hasNext()){

        temp = sc.next();

        if(keywords.contains(temp)){
          pkey.add(temp);
        }

        else if(identifiers.contains(temp)){
          pid.add(temp);
        }

        else if(logic.contains(temp)){
          plogic.add(temp);
        }

        else if(math.contains(temp)){
          pmath.add(temp);
        }

        else if(others.contains(temp)){
          pothers.add(temp);
        }

        else{
          pnum.add(temp);

        }
      }
      
      System.out.println("Output:");
      
      System.out.print("Keywords: ");
      Iterator<String> i = pkey.iterator(); 
      int j = pkey.size();
      for (int k = 0 ; k < j-1; k++){
        System.out.print(i.next() + " , ");
      }
      System.out.println(i.next());
        
      System.out.print("Identifiers: ");
      i = pid.iterator(); 
      j = pid.size();
      for (int k = 0 ; k < j-1; k++){
        System.out.print(i.next() + " , ");
      }
      System.out.println(i.next());
      
      System.out.print("Math Operators: ");
      i = pmath.iterator(); 
      j = pmath.size();
      for (int k = 0 ; k < j-1; k++){
        System.out.print(i.next() + " , ");
      }
      System.out.println(i.next());
      
      System.out.print("Logical Operators: ");
      i = plogic.iterator(); 
      j = plogic.size();
      for (int k = 0 ; k < j-1; k++){
        System.out.print(i.next() + " , ");
      }
      System.out.println(i.next());
      
      System.out.print("Numerical Values: ");
      i = pnum.iterator(); 
      j = pnum.size();
      for (int k = 0 ; k < j-1; k++){
        System.out.print(i.next() + " , ");
      }
      System.out.println(i.next());
      
      System.out.print("Others: ");
      i = pothers.iterator(); 
      j = pothers.size();
      for (int k = 0 ; k < j-1; k++){
        System.out.print(i.next() + " , ");
      }
      System.out.println(i.next());
      
    }
    catch (FileNotFoundException e){
      System.out.println("File not found");
    }
  }
}