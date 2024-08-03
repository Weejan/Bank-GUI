
/**
 * Write a description of class BankCard here.
 *
 * @author (22068187 Weejan Maharjan)
 * @version (1.0.0)
 */
public class BankCard
{
    //attribute
    private int cardId; // declaring the attributes
    private String clientName = ""  ;// declaring and initializing attribute as and empty string
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;
    
    //constructor
    public BankCard(int balanceAmount,int cardId,String bankAccount,String issuerBank)
    { //constructor that accepts 4 parameterized values
        this.balanceAmount = balanceAmount;//initializing attributes with parameterized values
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
        
    }
    
    //methods
    public int getcardId()//getter for CardId (returns the value of CardId when method is called)
    {
        return this.cardId;
    }
    
    public String getclientName(){/* getter for clientName (returns the value of clientName when method is called)*/
        return this.clientName;
    }
    
    public String getissuerBank(){/*getter for issureBank (return the value of issuerBank when method is called)*/
        return this.issuerBank;
    }
    
    public String getbankAccount(){/*(getter for bankAccount (return the value of bankAccount when method is called)*/
        return this.bankAccount;
    }
    
    public int getbalanceAmount()//getter for balance amount(returns balance amount when method is called)
    {
        return this.balanceAmount;
    }
    
    public void setclientName(String clientName)//setter for client Name (sets attribute with parameterized value)
    {
        this.clientName = clientName;
    }
    
    public void setissuerBank(String issuerBank)//setter for issuer bank (sets attribute with parameterized value)
    {
        this.issuerBank = issuerBank;
    }
    
    public void setbalanceAmount(int balanceAmount)//setter for balance amount (sets attribute with parameterized value)
    {
        this.balanceAmount = balanceAmount;
    }   
    
    public void display()//method to display all the details 
    {
        if(this.clientName == ""){
            System.out.println("Client Name is Empty");
        
        }
        else{
            System.out.println("The Bank CardId:" + cardId);
            System.out.println("The Client Name:" + clientName);
            System.out.println("The Issuer Bank:" + issuerBank);
            System.out.println("The Bank Account:" + bankAccount);
            System.out.println("The Balance Amount:" + balanceAmount);
        }
    }
}
