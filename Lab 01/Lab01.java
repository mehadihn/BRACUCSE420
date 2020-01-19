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
      // String mathOp[] = {"+", "-", "="};
      // String keywords[] = {"int", "float", "if", "else"};
      // String logic[] = {">"};
      // String other[] = {"(" , ")" , "{" , "}"};
      // String id[] = {"a", "b", "c", "d", "e"};
      // double num[] = {5, 6, 2.0, 6.0};

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
                                                               "y", "z"));

      ArrayList <String> logic = new ArrayList(Arrays.asList(">", "<", ">=", "<=","||","&&","^","|","&","!"));
      ArrayList <String> math = new ArrayList(Arrays.asList("+", "-", "=", "/","%","*","++","--"));
      ArrayList <String> others = new ArrayList(Arrays.asList(",", ";", "(",")","{","}","[","]"));
        
      
      Set<String> pmath = new HashSet<String>(); 
      Set<String> pothers = new HashSet<String>(); 
      Set<String> pid = new HashSet<String>(); 
      Set<String> pnum = new HashSet<String>(); 
      Set<String> pkey = new HashSet<String>();
      Set<String> plogic = new HashSet<String>();
      
      //int words[] = sc.split(' ');
      
      
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
      System.out.println("Keywords: "+pkey);
      System.out.println("Identifiers: "+pid);
      System.out.println("Math Operators: "+pmath);
      System.out.println("Logical Operators: "+plogic);
      System.out.println("Numerical Values: "+pnum);
      System.out.println("Others: "+pothers);
      
      
    }
    catch (FileNotFoundException e){
      System.out.println("File not found");
    }
}
}

