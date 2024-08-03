
/**
 * Write a description of class CrediCard here.
 * 
 * @author (22068187 Weejan Maharjan)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard
{
    private int cvcNumber;//declaring attributes
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    public CreditCard(int balanceAmount,int cardId,String bankAccount,String issuerBank, String clientName, int cvcNumber//creating constructor with 8 parameters
    , double interestRate, String expirationDate)
    {
        super(balanceAmount,cardId,bankAccount,issuerBank);//calling super constructor with 4 parameters
        setclientName(clientName);
        this.cvcNumber = cvcNumber;//initializing instance variable with value of parameter
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }
    
    public void setcreditLimit(double creditLimit, int gracePeriod)//creating setter method for creditLimit 
    {
        if (creditLimit <= 2.5 * getbalanceAmount()){/*condition for code to run*/ 
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted = true;
        } else {
            System.out.println("Credit cannot be issued.");
        }
    }
    
    public void cancelCreditCard()//method to cancel credit
    {
        if (isGranted == true){/*condition for code to run*/
            this.cvcNumber = 0;
            this.creditLimit = 0;
            this.gracePeriod = 0;
            this.isGranted = false;
        } else {
            System.out.println("No credit card to cancel.");
        }
    }
    
    public void display()//method to display all data in the class
    {
        if (isGranted == true) {
            System.out.println("-------------------------------");
            System.out.println("Credit Card");
            super.display();
            System.out.println("CVC number: " + cvcNumber);
            System.out.println("Credit limit: " + creditLimit);
            System.out.println("Interest rate: " + interestRate);
            System.out.println("Expiration date: " + expirationDate);
            System.out.println("Grace period: " + gracePeriod);
        } else {
            System.out.println("-------------------------------");
            System.out.println("Credit Card");
            super.display();
            System.out.println("CVC number: " + cvcNumber);
            System.out.println("Interest rate: " + interestRate);
            System.out.println("Expiration date: " + expirationDate);
            System.out.println("");
        }
    }

    public int getcvcNumber()//getter method for cvcNumber
    {
        return cvcNumber;
    }
    
    public double getcreditLimit()//getter method for creditLimit
    {
        return creditLimit;
    }
    
    public double getinterestRate()//getter method for intersetRate
    {
        return interestRate;
    }
    
    public String getexpirationDate()//getter method for expirationDate
    {
        return expirationDate;
    }
    
    public int getgracePeriod()//getter method for gracePeriod
    {
        return gracePeriod;
    }
    
    public boolean getisGranted()//getter method for isGranted
    {
        return isGranted;
    }
}
