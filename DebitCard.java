
/**
 * Write a description of class DebitCard here.
 * 
 * @author (22068187 Weejan Maharjan)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard
{
    private int pinNumber;          //new attributes are made
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;

    public DebitCard(int balanceAmount,int cardId,String bankAccount, String issuerBank, String clientName ,int pinNumber)
    {           /*constructor  is made with 6 parameterized values*/
        super(balanceAmount,cardId,bankAccount,issuerBank);         //calls attribute value from parent class
        setclientName(clientName);          //calls method from bankcard and sets client name passing client name as parameter 
        this.pinNumber = pinNumber;         //initializing attribute with parameterized value
        this.hasWithdrawn = false;          //initializing attribute with value
    }
    
    public void setwithdrawalAmount (int withdrawalAmount)
    {           /*setter method to set withdrawal amount (sets attribute with parameterized value)*/
        this.withdrawalAmount = withdrawalAmount;
    }
    
    public void withdraw(int withdrawalAmount,String dateOfWithdrawal,int pinNumber){ //            method to withdraw money which takes 3 parameters
        if(this.pinNumber == pinNumber && super.getbalanceAmount() >= withdrawalAmount ){           /*conditions for withdrawal process to start*/
            super.setbalanceAmount(super.getbalanceAmount() - withdrawalAmount);            // deducts withdrawal amount from balance amount and sets new balance amount
            this.withdrawalAmount = withdrawalAmount;           //initializing attribute with parameterized value
            this.dateOfWithdrawal = dateOfWithdrawal;       //initializing attribute with parameterized value
            this.hasWithdrawn = true;
            //initializing attribute with value
            System.out.println();
            System.out.println("Withdrawal has been successful.");
            System.out.println("New Balance: " + super.getbalanceAmount());
        }
        else if(this.pinNumber != pinNumber){
            System.out.println("Invalid PIN number.Withdrawal unsuccessful.");
        }
        else{
            System.out.println("Insufficient balance ammount.Withdrawal unsuccessuful");
        }
    }

    public void display()
    {//method to display all the details 
        System.out.println("-------------------------------");
        System.out.println("Debit Card");
        super.display();            //calls display method from parent class /super class
        if (hasWithdrawn == true) {
            System.out.println("Pin number: " + pinNumber);
            System.out.println("Withdrawal amount: " + withdrawalAmount);
            System.out.println("Date of withdrawal: " + dateOfWithdrawal);
        } else {
            System.out.println("No withdrawal has been made yet.");
        }
        System.out.println("");
    }
    
     public int getpinNumber()//creating getter method for pinNumber(return value of pinNumber)
     {
        return pinNumber;
    }
    
    public int getwithdrawalAmount()//creating getter method for withdrawalAmount(return value of withdrawalAmount)
    {
        return withdrawalAmount;
    }
    
    public String getdateOfWithdrawal()//creating getter method for dateOfWithdrawal(return value of dateOfWithdrawal)
    {
        return dateOfWithdrawal;
    }
    
    public boolean gethasWithdrawn()//creating getter method for hasWithdrawn(return value of hasWithdrawn)
    {
        return hasWithdrawn;
    }
}
