package accountbank;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Piassa
 */
public class AccountBank {

    public static void main(String[] args) throws IOException  {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Star system bank?"
                + " 1) Yes"
                + " 2) No");
        int started = in.nextInt();
        
        if(started == 1){
        
            account functions = new account();
            
            functions.accountFunctions();
           
        }else{
            System.out.println("Bye!");
        }
  
 
    }
    
}
