
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
                    + " 5) Payment bank"
                + " 0) Exit");
            
        int function = in.nextInt();
        
         
        switch(function){
            case 0 -> {
                System.out.println("Account system closed!");
            }
            
            case 1 -> {
                double numberAccount =  Math.random();
                String status = "open";

                System.out.println("Chose type account: "
                        + " 1) CC"
                        + " 2) CP");
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
                newAccount.accountFunctions();
            }
            
            case 2 -> {
                System.out.println("Value to withdraw: ");
                int withdrawn = in.nextInt();
                
                float newValue = getValue() - withdrawn;
                
                this.setValue(newValue);
                
                this.showAccount();
                this.accountFunctions();
            }
            
            case 3 -> {
                System.out.println("Close account?"
                        + " 1) Yes"
                        + " 2) No");
                int closeAccount = in.nextInt();
                
                if(closeAccount == 1)
                {
                    System.out.println("Account closed!");
                    setStatus("Closed");
                    this.showAccount();
                    this.accountFunctions();
                }else {
                    this.accountFunctions();
                }
            }
            
            case 4 -> {
                System.out.println("New value: ");
                float newValue = in.nextFloat();
                
                float resetValue = getValue() + newValue;
                setValue(resetValue);
                
                this.showAccount();
                this.accountFunctions();
            }
            
            case 5 -> {
                System.out.println("Payment bank now? "
                        + " 1) Yes"
                        + " 2) No");
                int option = in.nextInt();
                
                if(option == 1)
                {
                    if(getStatus() == "open")
                    {
                        System.out.println("This account is actived!");
                        this.accountFunctions();
                    }
                    else { 
                        float newValue = getValue() - 100;
                        
                        if(getValue() <= 0 && newValue <= 0){
                            System.out.println("Error in payment bank!");
                            
                            this.accountFunctions();  
                        }else {
                            setValue(newValue);
                            setStatus("open");

                            System.out.println("Payment has bee success!");

                            this.showAccount();
                            this.accountFunctions();    
                        }
                    }

                }else {
                    this.showAccount();
                    this.accountFunctions();
                }
               
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
