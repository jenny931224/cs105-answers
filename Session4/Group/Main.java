import java.lang.String;

public class Main{
  
    public static void main(String[] args)
    {
      
        final String accessLevel= AccessLevel.FULL_ACCESS.symbol;
        AccessLevel.checkAccess(accessLevel);
        Personnel p1 = new Personnel();
        
        if (p1.validateLogin())
            System.out.println("Success");
        else
            System.out.println("Failed");
        
        
    }
    
}
