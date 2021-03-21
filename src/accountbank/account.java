
package accountbank;

import java.util.Scanner;

/**
 *
 * @author Piassa
 */
public class account {
    
        public double numAccount;
        protected String type;
        private String ownerBy;
        private float value;
        private String status;
        
    public account(){
        
    }   

    public account(double numAccount, String type, String ownerBy, float value, String status) {
        setNumAccount(numAccount);
        setType(type);
        setOwnerBy(ownerBy);
        setValue(value);
        setStatus(status);
    }

    public void showAccount()
    {
        System.out.println("Account: " + this.numAccount);
        System.out.println("Type: " + this.type);
        System.out.println("Owner: " + this.ownerBy);
        System.out.println("Current: " + this.value);
        System.out.println("Stauts: " + this.status);
    }
    
    public void accountFunctions(){
        Scanner in = new Scanner(System.in);

            
        System.out.println("Chose your function: ");
        System.out.println("1) New account"
                    + " 2) Whithdrawn money"
                    + " 3) Close account"
                    + " 4) Add new money"
                    + " 5) Payment bank");
            
        String function = in.nextLine();
        
         
        switch(function){
            case "1" -> {
                double numberAccount =  Math.random();
                String status = "open";

                System.out.println("Chose type account: "
                        + "1) Current"
                        + "2) Account");
                String typeAccount = in.nextLine();

                //
                System.out.println("Please, insert your name: ");
                String ownerBy = in.nextLine();;

                //
                System.out.println("Deposit new value: ");
                float valueStarted = in.nextFloat();


                account newAccount = new account(
                        numberAccount,
                        typeAccount,
                        ownerBy,
                        valueStarted,
                        status
                );

                newAccount.showAccount();
            }
        }
    }
            
    
    public double getNumAccount() {
        return numAccount;
    }

    public void setNumAccount(double numAccount) {
        this.numAccount = numAccount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwnerBy() {
        return ownerBy;
    }

    public void setOwnerBy(String ownerBy) {
        this.ownerBy = ownerBy;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }   
    
}
