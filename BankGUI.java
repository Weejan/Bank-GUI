  
/**
 * Write a description of class BankGUI here.
 *
 * @author (22068187 Weejan Maharjan)
 * @version (may 7th)
 */
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class BankGUI implements ActionListener
{
    //----------------------------------------------------------declaring all the components here----------------------------------------------------------
    private JFrame frame;
    private ArrayList<BankCard> cards = new ArrayList<BankCard>() ;
    private JLabel hbankLabel;
    
    //----------------------------------------------------------declaring withdraw component---------------------------------------------------------- 
    private JLabel withdrawalDateL, withdrawL,withdrawCardIdL,withdrawalAmountL,pinNumberL;
    private JTextField withdrawCardIdTF, withdrawalAmountTF,pinNumTF;
    private JComboBox withdrawDayBox,withdrawMonthBox,withdrawYearBox;
    
    
    //----------------------------------------------------------declaring debit card component----------------------------------------------------------
    private JLabel debitCardL, debitBalanceAmountL,debitCardIDL,debitBankAccountL,debitIssuerBank,debitClientNameL,debitExpirationDateL,debitPinNumberL;
    private JTextField debitBalanceTF,debitCardIdTF,debitBankTF,debitIssuerTF,debitIClientTF,debitPinNumTF;
    private JComboBox creditDayBox,creditMonthBox,creditYearBox;
    
    
    //----------------------------------------------------------declaring credit card component----------------------------------------------------------
    private JLabel creditCardL, creditBalanceAmountL,creditCardIdL,creditBankAccountL,creditIssuerBankL,creditClientNameL,creditCvcNumberL,creditInterestRateL,creditDxpirationDateL;
    private JTextField creditBalanceTF,creditCardIdTF,creditBankTF,creditIssuerTF,creditClientTF,clientCvcNumTF,clientInterestTF;
    
    
    
    
    //----------------------------------------------------------set credit limit components ----------------------------------------------------------
    private JLabel setCardIdL,setCreditLimitL,creditLimitL,gracePeriodL;
    private JTextField setCardIdTF,creditLimitTF,gracePeriodTF;
    
    
    //----------------------------------------------------------cancel credit card ----------------------------------------------------------
    private JLabel  cancelCardIdL;
    private JTextField cancelcardIdTF;
    
    //----------------------------------------------------------Buttons Buttons----------------------------------------------------------
    private JButton addDebitCardB,displayB ,clearB , setCreditLimit ,cancelCreditCardB ,withdrawB, addCreditCard ,creDisplay,debDisplay;
    
    
    private JLabel mLine1 ,mLine2,bLine1;

    
    public BankGUI(){
        
        
        //-----------------------------------------------------create the code to write the GUI-----------------------------------------------------
        frame = new JFrame();
        hbankLabel = new JLabel("Bank GUI");
        hbankLabel.setBounds(341, 9, 84, 25);
        
        frame.add(hbankLabel);
        
        //-------------------------------------------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------creating GUI for debit card----------------------------------------------------- 
        //-------------------------------------------------------------------------------------------------------------------------------------------------
        
         debitCardL = new JLabel("Debit Card");
        
         debitBalanceAmountL = new JLabel("Balance Amount");
        debitBalanceTF = new JTextField();
        
         debitCardIDL = new JLabel("Card ID");
        debitCardIdTF = new JTextField();
        
         debitBankAccountL = new JLabel("Bank Account");
        debitBankTF = new JTextField();
        
        debitIssuerBank = new JLabel("Issuer Bank");
        debitIssuerTF = new JTextField();
        
        debitClientNameL = new JLabel("Client Name");
        debitIClientTF = new JTextField();
        
        debitPinNumberL = new JLabel("PIN Number");
        debitPinNumTF = new JTextField();
        
        addDebitCardB = new JButton("Add Debit Card");
        
        debDisplay = new JButton("Display Cards");
        
    
        //------------------------------------------------------------Withdraw-------------------------------------------------------------------------
         withdrawL = new JLabel("Withdraw");
         withdrawalAmountL = new JLabel("Withdrawal Amount");
        withdrawalAmountTF = new JTextField();
        withdrawCardIdL = new JLabel("Card Id");
        withdrawCardIdTF = new JTextField();
        
        pinNumberL = new JLabel("PIN Number");
        pinNumTF = new JTextField();
        
        withdrawalDateL = new JLabel("Withdrawal Date");
        withdrawDayBox = new JComboBox();
        for (int d = 1; d <=31; d++){
            withdrawDayBox.addItem(d);
        }
        withdrawMonthBox = new JComboBox();
        for (int m = 1; m <=12; m++){
            withdrawMonthBox.addItem(m);
        }
        withdrawYearBox = new JComboBox();
        for (int y = 1900; y <=2023; y++){
            withdrawYearBox.addItem(y);
        }
        
        withdrawB = new JButton("Withdraw");
        //-------------------------------------------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------Line Separations Cancel Credit Card-----------------------------------------------------
        //---------------------------------------------------------------------------------------------------------------------------------------------
         mLine1 = new JLabel("---------------------------------------------------------------------------------------------------");
         
        JLabel cancelCardIdL = new JLabel("Card ID");
        cancelcardIdTF = new JTextField();
        
        cancelCreditCardB = new JButton("Cancel Credit Card");
        
         mLine2 = new JLabel("---------------------------------------------------------------------------------------------------");
        
        //-------------------------------------------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------creating GUI for credit card-----------------------------------------------------
        //-------------------------------------------------------------------------------------------------------------------------------------------------
        creditCardL = new JLabel("Credit Card");
        
        creditBalanceAmountL = new JLabel("Balance Amount");
        creditBalanceTF = new JTextField();
        
        creditCardIdL = new JLabel("Card ID");
        creditCardIdTF = new JTextField();
        
        creditBankAccountL = new JLabel("Bank Account");
        creditBankTF = new JTextField();
        
        creditIssuerBankL = new JLabel("Issuer Bank");
        creditIssuerTF = new JTextField();
        
        creditClientNameL = new JLabel("Client Name");
        creditClientTF = new JTextField();
        
        creditCvcNumberL = new JLabel("CVC Number");
        clientCvcNumTF = new JTextField();
        
        creditInterestRateL = new JLabel("Interest Rate");
        clientInterestTF = new JTextField();
        
        creditDxpirationDateL = new JLabel("Expiration Date");
        creditDayBox = new JComboBox();
        for (int d = 1; d <=31; d++){
            creditDayBox.addItem(d);
        }
        creditMonthBox = new JComboBox();
        for (int m = 1; m <=12; m++){
            creditMonthBox.addItem(m);
        }
        creditYearBox = new JComboBox();
        for (int y = 1900; y <=2023; y++){
            creditYearBox.addItem(y);
        }
        //=================================================buttons
        addCreditCard = new JButton("Add Credit Card");
        creDisplay = new JButton("Display Cards");
        //-----------------------------------------------------credit card (credit limit)-----------------------------------------------------
        
        setCreditLimitL = new JLabel("Set Credit Limit");
        
        setCardIdL = new JLabel("Card ID");
        setCardIdTF = new JTextField();
        
        creditLimitL = new JLabel("Credit Limit");
        creditLimitTF = new JTextField();
        
        gracePeriodL = new JLabel("Grace Period");
        gracePeriodTF = new JTextField();
        //=================================================buttons
        setCreditLimit = new JButton("Set Credit Limit");
        
        
        //-------------------------------------------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------Bottom Buttons-----------------------------------------------------
        //---------------------------------------------------------------------------------------------------------------------------------------------
         bLine1 = new JLabel("------------------------------------------------------------------------------------------------");
        displayB = new JButton("Display");
        clearB = new JButton("clear");
        
        
        //-------------------------------------------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------credit card bounds---------------------------------------------------
        //----------------------------------------------------------------------------------------------------------------------------------------------
        creditCardL.setBounds(141,44,118,21);
        
        creditBalanceAmountL.setBounds(24, 85, 106, 19);
        creditBalanceTF.setBounds(200, 80, 187, 31);
        
        creditCardIdL.setBounds(24, 124, 50, 19);
        creditCardIdTF.setBounds(200, 119, 187, 31);
        
        creditBankAccountL.setBounds(24, 162, 90, 19);
        creditBankTF.setBounds(200, 159, 187, 31);
        
        creditIssuerBankL.setBounds(24, 201, 77, 19);
        creditIssuerTF.setBounds(200, 196, 187, 31);
        
        creditClientNameL.setBounds(24, 239, 80, 19);
        creditClientTF.setBounds(200, 235, 187, 31);
        
        creditCvcNumberL.setBounds(24, 278, 87, 19);
        clientCvcNumTF.setBounds(200, 274, 187, 31);
        
        creditInterestRateL.setBounds(24, 317, 92, 19);
        clientInterestTF.setBounds(200, 312, 187, 31);
        
        creditDxpirationDateL.setBounds(24, 355, 108, 19);
        creditDayBox.setBounds(132, 350, 68, 31);
        creditMonthBox.setBounds(208, 350, 80, 31);
        creditYearBox.setBounds(296, 350, 90, 31);
        
        addCreditCard.setBounds(196, 405, 131, 31);
        creDisplay.setBounds(64, 405, 131, 31);
        
        // ----------------------------------------------------credit limit bounds---------------------------------------------------
        setCreditLimitL.setBounds(542, 44, 115, 22);
        
        setCardIdL.setBounds(419, 88, 55, 20);
        setCardIdTF.setBounds(574, 80, 180, 32);
        
        creditLimitL.setBounds(419, 129, 82, 20);
        creditLimitTF.setBounds(574, 119, 180, 32);
        
        gracePeriodL.setBounds(419, 162, 90, 19);
        gracePeriodTF.setBounds(574, 159, 180, 32);
        
        setCreditLimit.setBounds(627, 215, 126, 32);
        
        //-------------------------------------------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------cancel credit card bounds---------------------------------------------------
        //----------------------------------------------------------------------------------------------------------------------------------------------
        mLine1.setBounds(7, 447, 777, 1);
        
        cancelCardIdL.setBounds(196, 464, 48, 20);
        cancelcardIdTF.setBounds(278, 458, 130, 32);
        cancelCreditCardB.setBounds(442, 458, 164, 32);
        
        mLine2.setBounds(7, 501, 777, 1);
        //-------------------------------------------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------debit card bounds---------------------------------------------------
        //----------------------------------------------------------------------------------------------------------------------------------------------
        debitCardL.setBounds(123, 519, 108, 22);
        
        debitBalanceAmountL.setBounds(24, 574, 106, 19);
        debitBalanceTF.setBounds(196, 568, 187, 31);
        
        debitCardIDL.setBounds(24, 615, 50, 19);
        debitCardIdTF.setBounds(196, 609, 187, 31);
        
        debitBankAccountL.setBounds(24, 656, 90, 19);
        debitBankTF.setBounds(196, 650, 187, 31);
        
        debitIssuerBank.setBounds(24, 697, 77, 19);
        debitIssuerTF.setBounds(196, 691, 187, 31);
        
        debitClientNameL.setBounds(24, 738, 80, 19);
        debitIClientTF.setBounds(196, 732, 187, 31);
        
        debitPinNumberL.setBounds(24, 779, 80, 19);
        debitPinNumTF.setBounds(196, 773, 187, 31);
    
        addDebitCardB.setBounds(196, 828, 126, 32);
        debDisplay.setBounds(64, 828, 126, 32);
        
        
        
        // ----------------------------------------------------withdraw---------------------------------------------------
        withdrawL.setBounds(546, 519, 70, 22);
        
        withdrawCardIdL.setBounds(401, 574, 55, 20);
        withdrawCardIdTF.setBounds(574, 568, 180, 31);
        
        withdrawalAmountL.setBounds(401, 615, 126, 20);
        withdrawalAmountTF.setBounds(574, 609, 180, 31);
        
        withdrawalDateL.setBounds(401, 656, 107, 20); 
        withdrawDayBox.setBounds(517, 650, 68, 31); 
        withdrawMonthBox.setBounds(587, 650, 80, 31); 
        withdrawYearBox.setBounds(667, 650, 90, 31);
        
        pinNumberL.setBounds(401, 697, 77, 20);
        pinNumTF.setBounds(574, 691, 180, 31);
        
        
        withdrawB.setBounds(627, 748, 126, 32);
        
        //----------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------Bottom bounds -------------------------------------------------------------
        //----------------------------------------------------------------------------------------------------------------------------------------------
         
         
        bLine1.setBounds(7, 867, 777, 1);
        displayB.setBounds(245, 870, 126, 32);
        clearB.setBounds(388, 870, 126, 32);
        //----------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------changing font -------------------------------------------------------------
        //----------------------------------------------------------------------------------------------------------------------------------------------
        
        setCreditLimitL.setFont(new Font ("Helveti",Font.BOLD,14));
        creditCardL.setFont(new Font ("Helveti",Font.BOLD,14));
        debitCardL.setFont(new Font ("Helveti",Font.BOLD,14));
        withdrawL.setFont(new Font ("Helveti",Font.BOLD,14));
        hbankLabel.setFont(new Font ("Helveti" ,Font.BOLD, 18));
        bLine1.setFont(new Font("Helveti",Font.BOLD,18));
        mLine1.setFont(new Font("Helveti",Font.BOLD,18));
        mLine2.setFont(new Font("Helveti",Font.BOLD,18));
        
        
        //----------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------adding credit card to frame-------------------------------------------------------------
        //----------------------------------------------------------------------------------------------------------------------------------------------
        frame.add(creditCardL);
        
        frame.add(creditBalanceAmountL);
        frame.add(creditBalanceTF);
        
        frame.add(creditCardIdL);
        frame.add(creditCardIdTF);
        
        frame.add(creditBankAccountL);
        frame.add(creditBankTF);
        
        frame.add(creditIssuerBankL);
        frame.add(creditIssuerTF);
        
        frame.add(creditClientNameL);
        frame.add(creditClientTF);
        
        frame.add(creditCvcNumberL);
        frame.add(clientCvcNumTF);
        
        frame.add(creditInterestRateL);
        frame.add(clientInterestTF);
        
        frame.add(creditDxpirationDateL);
        frame.add(creditDayBox);
        frame.add(creditMonthBox);
        frame.add(creditYearBox);
        
        frame.add(addCreditCard);
        frame.add(creDisplay);
        
        //-----------------------------------------------------adding set credit limit -----------------------------------------------------
        frame.add(setCreditLimitL);
        
        frame.add(setCardIdL);
        frame.add(setCardIdTF);
        
        frame.add(creditLimitL);
        frame.add(creditLimitTF);
        
        frame.add(gracePeriodL);
        frame.add(gracePeriodTF);
        
        frame.add(setCreditLimit);
        
        //----------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------cancel credit card to frame-------------------------------------------------------------
        //----------------------------------------------------------------------------------------------------------------------------------------------
        frame.add(mLine1);
        frame.add(mLine2);
        frame.add(cancelCardIdL);
        frame.add(cancelcardIdTF);
        frame.add(cancelCreditCardB);
        //----------------------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------adding debit card to frame-------------------------------------------------------------
        //----------------------------------------------------------------------------------------------------------------------------------------------
        frame.add(debitCardL);
        
        frame.add(debitBalanceAmountL);
        frame.add(debitBalanceTF);
        
        frame.add(debitCardIDL);
        frame.add(debitCardIdTF);
        
        frame.add(debitBankAccountL);
        frame.add(debitBankTF);
        
        frame.add(debitIssuerBank);
        frame.add(debitIssuerTF);
        
        frame.add(debitClientNameL);
        frame.add(debitIClientTF);
        
        frame.add(debitPinNumberL);
        frame.add(debitPinNumTF);
        
        frame.add(addDebitCardB);
        frame.add(debDisplay);
        
        
        //-----------------------------------------------------adding withdrawal -----------------------------------------------------
        frame.add(withdrawL);
        
        frame.add(withdrawCardIdL);
        frame.add(withdrawCardIdTF);
        
        frame.add(withdrawalAmountL);
        frame.add(withdrawalAmountTF);
        
        frame.add(withdrawalDateL);
        frame.add(withdrawDayBox);
        frame.add(withdrawMonthBox);
        frame.add(withdrawYearBox);
        
        frame.add(pinNumberL);
        frame.add(pinNumTF);
        
        frame.add(withdrawB);
        
        //----------------------------------------------------------------------------------------------------------------------------------------------
        frame.add(bLine1);
        frame.add(displayB);
        frame.add(clearB);
        
    
        //----------------------------------------------------------------------------------------------------------------------------------------------
        addDebitCardB.addActionListener(this);
        addCreditCard.addActionListener(this);
        displayB.addActionListener(this);
        clearB.addActionListener(this);
        setCreditLimit.addActionListener(this);
        cancelCreditCardB.addActionListener(this);
        withdrawB.addActionListener(this);
        debDisplay.addActionListener(this);
        creDisplay.addActionListener(this);
            
        
        
        
       
         
        
        //-----------------------------------------------------frame bounds-----------------------------------------------------
        frame.setSize(772,950);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
        
        
        
        
    }
    
    
    
    
    //implement the mothod of the 
    //ActionListener
    
    public void actionPerformed(ActionEvent e){
        //----------------------------------------------------------------------------------------------------------------------------------------------
        //----------------------------------------------------------------Debit Card Button----------------------------------------------------------
        //----------------------------------------------------------------------------------------------------------------------------------------------
        // Check if the addDebitCardB button was pressed
        if(e.getSource() == addDebitCardB ){
            //declaring variables
            String debBalanceAmountTxt, debCardIdTxt, debBankAccountTxt,  debIssuerBankTxt,  debClientNameTxt , debPinNumberTxt;
            int debBalanceAmount,debCardId,debPinNumber;
            //initialing variable with value from text field
            debBalanceAmountTxt = debitBalanceTF.getText();
            debCardIdTxt = debitCardIdTF.getText();
            debBankAccountTxt = debitBankTF.getText();
            debIssuerBankTxt = debitIssuerTF.getText();
            debClientNameTxt = debitIClientTF.getText();
            debPinNumberTxt = debitPinNumTF.getText();
            
            // Checking if any of the text fields are empty
            if(debBalanceAmountTxt.isEmpty()|| debCardIdTxt.isEmpty()|| debBankAccountTxt.isEmpty()||  debIssuerBankTxt.isEmpty()||  debClientNameTxt.isEmpty()||
            debPinNumberTxt.isEmpty()){
                JOptionPane.showMessageDialog(frame, "Empty text field detected!! Please fill up all the text fields.", "Empty Field", JOptionPane.WARNING_MESSAGE);
            }
            
            else{
                    try{// Converting string values to integers
                        debBalanceAmount = Integer.parseInt(debitBalanceTF.getText());
                        debCardId = Integer.parseInt(debitCardIdTF.getText());
                        debPinNumber = Integer.parseInt(debitPinNumTF.getText());
                            
                            if(cards.isEmpty()){ //Checking if the array list is empty,then creating new DebitCard object and adding it to the arraylist
                            DebitCard debitCardObject = new DebitCard( debBalanceAmount, debCardId, debBankAccountTxt,  debIssuerBankTxt,  debClientNameTxt , debPinNumber);
                            cards.add(debitCardObject);
                            JOptionPane.showMessageDialog(frame, "Debit Card has be successfully added!!","Debit Card",JOptionPane.INFORMATION_MESSAGE);
                            
                        }
                        else{// Checking if the card with the same cardId already exists
                            boolean cardExits = false;
                            for(BankCard card: cards){
                                if(card instanceof DebitCard){
                                    if(card.getcardId() == debCardId){
                                        cardExits = true;
                                    }
                                }
                            }
                            if(cardExits == true){
                                            JOptionPane.showMessageDialog(frame,"The Debit Cardis already added!","Existing Card",JOptionPane.ERROR_MESSAGE);
                                        }
                            if(cardExits == false){// Creating a new DebitCard object and adding it to the cards ArrayList
                            DebitCard debitCardObject = new DebitCard( debBalanceAmount, debCardId, debBankAccountTxt,  debIssuerBankTxt,  debClientNameTxt , debPinNumber);
                            cards.add(debitCardObject);
                            JOptionPane.showMessageDialog(frame,"The Debit Card has been successfully added");
        
                            }            
                        }
                    }
                    
                    
                    catch(NumberFormatException a ){
                        JOptionPane.showMessageDialog(frame,"Invalid Input!! Please enter the correct data type!","Invalid Input",JOptionPane.ERROR_MESSAGE);
                    }
                }
        }
        
        
        // Check if the debDisplay button was pressed
        if(e.getSource() == debDisplay){
                for(BankCard cardObject : cards){ //checking if the object in cards ArrayList is instance of debitcard and calling display method
                    if(cardObject instanceof DebitCard){
                    cardObject.display();
                }
            }
        }
        
        
        //----------------------------------------------------------------------------------------------------------------------------------------------
        //----------------------------------------------------------------Credit Card Button----------------------------------------------------------
        //----------------------------------------------------------------------------------------------------------------------------------------------
    
        // Check if the addCreditCard button was pressed
        if(e.getSource() == addCreditCard ){
            //----------------------------------------------------------declaring variable------------------------------------------------
            String creBalanceAmountTxt , creCardIdTxt, creBankAccountTxt, creIssuerBankTxt,
            creClientNameTxt,  creCvcNumberTxt,  creInterestRateTxt,  creExpirationDateTxt;
            
            int creBalanceAmount, creCardId, creCvcNumber, creInterestRate;
            
            CreditCard creditCardObject;
            
            // Initialize variables with values from the text fields and combo boxes
            
            creCardIdTxt =creditCardIdTF.getText();    
            creClientNameTxt = creditClientTF.getText();
            creIssuerBankTxt = creditIssuerTF.getText();
            creBankAccountTxt = creditBankTF.getText();
            creBalanceAmountTxt = creditBalanceTF.getText();
            creCvcNumberTxt = clientCvcNumTF.getText();
            creInterestRateTxt = clientInterestTF.getText();
            creExpirationDateTxt = String.valueOf(creditDayBox.getSelectedItem())+"/"+ String.valueOf(creditMonthBox.getSelectedItem())+"/"+
                                    String.valueOf(creditYearBox.getSelectedItem());
                                    
              // Check if any fields are empty and display a warning message if they are
            
            if( creBalanceAmountTxt.isEmpty()|| creCardIdTxt.isEmpty()||creBankAccountTxt.isEmpty()|| creIssuerBankTxt.isEmpty()||creClientNameTxt.isEmpty()||
                creCvcNumberTxt.isEmpty()||creInterestRateTxt.isEmpty()||creExpirationDateTxt.isEmpty())
                {
                    JOptionPane.showMessageDialog(frame, "Empty text field detected!! Please fill up all the text fields.", "Empty Field", JOptionPane.WARNING_MESSAGE);
                }
                // If all fields are filled, attempt to add the credit card
                else
                { 
                    try
                    {
                        creBalanceAmount = Integer.parseInt(creBalanceAmountTxt);
                        creCardId = Integer.parseInt(creCardIdTxt);
                        creCvcNumber = Integer.parseInt(creCvcNumberTxt);
                        creInterestRate = Integer.parseInt(creInterestRateTxt);
                         // Check if any credit cards have already been added
                         
                        if(cards.isEmpty()){
                            // If no credit cards have been added, create a new CreditCard object and add it to the cards list
                            creditCardObject = new CreditCard(creBalanceAmount , creCardId, creBankAccountTxt, creIssuerBankTxt,
                            creClientNameTxt,  creCvcNumber,  creInterestRate,  creExpirationDateTxt);
                            cards.add(creditCardObject);
                            JOptionPane.showMessageDialog(frame, "Credit Card has be successfully added!!");
                        } 
                        else{
                            // If credit cards have already been added, check if the new card already exists
                            boolean cardExits = false;
                            for(BankCard card: cards){
                                   
                                    if(card instanceof CreditCard){
                                        if(card.getcardId() == creCardId){
                                            cardExits = true;
                                        }
                                    }
                            }
                            // If the card already exists, display an error message
                            if(cardExits == true){
                                            JOptionPane.showMessageDialog(frame,"The Credit Card is already added!","Existing Card",JOptionPane.ERROR_MESSAGE);
                                        }
                                        // If the card does not already exist, create a new CreditCard object and add it to the cards list
                            if(cardExits == false){
                                creditCardObject = new CreditCard(creBalanceAmount , creCardId, creBankAccountTxt, creIssuerBankTxt,
                                creClientNameTxt,  creCvcNumber,  creInterestRate,  creExpirationDateTxt);
                                cards.add(creditCardObject);
                                JOptionPane.showMessageDialog(frame,"The Credit Card has been successfully added");
                                }
                        }
                    }
                    // Catch any NumberFormatException that might be thrown while parsing integers from the text fields
                    catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(frame, "Invalid Input!! Please enter the correct data type!", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                    }
                    
            }
        }
        
        // Check if the creDisplay button was pressed
        if(e.getSource() == creDisplay){
                for(BankCard cardObject : cards){
                    // Check if the card is a CreditCard object and call the display method if it is
                    if(cardObject instanceof CreditCard){
                    cardObject.display();
                }
            }
        }
        
        // Check if the clearB button was pressed
        if(e.getSource() == clearB){
            
            //set all the textfield text to null
            debitBalanceTF.setText("");
            debitCardIdTF.setText(null);
            debitBankTF.setText(null);
            debitIssuerTF.setText(null);
            debitIClientTF.setText(null);
            debitPinNumTF.setText(null);
            
            

            creditCardIdTF.setText(null);    
            creditClientTF.setText(null);
            creditBankTF.setText(null);
            creditBalanceTF.setText(null);
            clientCvcNumTF.setText(null);
            creditIssuerTF.setText(null);
            clientInterestTF.setText(null);
            creditDayBox.setSelectedItem(null);
            creditMonthBox.setSelectedItem(null);
            creditYearBox.setSelectedItem(null);
            
             withdrawCardIdTF.setText(null);
             withdrawalAmountTF.setText(null);
             pinNumTF.setText(null);
             withdrawDayBox.setSelectedItem(null);
             withdrawMonthBox.setSelectedItem(null);
             withdrawYearBox.setSelectedItem(null);
            
             setCardIdTF.setText(null);
             creditLimitTF.setText(null);
             gracePeriodTF.setText(null);
             
             cancelcardIdTF.setText(null);
        }
        // Check if the displayB button was pressed
        if(e.getSource() == displayB){
                for(BankCard cardObject : cards){
                    //call the display method
                    cardObject.display();
                }
            }
         
            // Check if the withdrawB button was pressed
        if(e.getSource() == withdrawB){
            // Declare variables
            String cardIdTxt,withdrawAmountTxt,pinNumTxt ,dateOfWithdrawal;
            int cardId ,withdrawAmount,pinNum;
            boolean cardExists;
            
            // initializing variable with textfield inputs
            cardIdTxt = withdrawCardIdTF.getText();
            withdrawAmountTxt = withdrawalAmountTF.getText();
            pinNumTxt = pinNumTF.getText();
            
            // Get date of withdrawal from the combo boxes
            dateOfWithdrawal = String.valueOf(withdrawDayBox.getSelectedItem()) +"/"+ String.valueOf(withdrawMonthBox.getSelectedItem()) +"/"+
                                                String.valueOf(withdrawYearBox.getSelectedItem());
            // Check if any text field is empty, if yes, show a warning message.
            if(cardIdTxt.isEmpty()||withdrawAmountTxt.isEmpty()||pinNumTxt.isEmpty())
            {
            JOptionPane.showMessageDialog(frame, "Empty text field detected!! Please fill up all the text fields.", "Empty Field", JOptionPane.WARNING_MESSAGE);
            }
            else{
                try{
                    // Parse the user inputs into integer variables
                    cardId = Integer.parseInt(cardIdTxt);
                     withdrawAmount = Integer.parseInt(withdrawAmountTxt);
                     pinNum = Integer.parseInt(pinNumTxt);
                     cardExists = false;// Initialize the cardExists flag to false
                    }   
                catch(NumberFormatException x){// Show a warning message if an invalid input is entered
                    JOptionPane.showMessageDialog(frame, "Invalid Input!! Please enter the correct data type!", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                // Initialize a DebitCard object
                DebitCard debitC;
                for(BankCard card : cards){// Check all BankCard objects in the ArrayList
                    if(card instanceof DebitCard){// Check if the BankCard object is an instance of DebitCard
                        debitC = (DebitCard) card;// Cast the BankCard object to DebitCard type
                        if(card.getcardId() == cardId){// Check if the entered cardId matches the current debit card's cardId
                             cardExists = true;
                        }
                        
                        if(cardExists == true){ // If cardExists is true show message dialog
                            JOptionPane.showMessageDialog(null, "Hello "+debitC.getclientName()+"."+"Your Card ID is"+debitC.getcardId()+".");
                               if(debitC.getpinNumber() != pinNum){ // Check if the entered pinNumber matches the current debit card's pinNumber
                                JOptionPane.showMessageDialog(frame,"Your PIN Number is incorrect!!","Wrong PIN Number", JOptionPane.WARNING_MESSAGE);
            
                            }
                            else{
                                if(withdrawAmount >=0)// If withdrawAmount is greater than or equal to 0
                                {
                                    if(debitC.getbalanceAmount() <  withdrawAmount){ // If balanceAmount is less than the withdrawAmount, show a warning message
                                        JOptionPane.showMessageDialog(frame, "Your balance amount is insufficient transaction failed!",
                                        "Insufficient Balance Amount", JOptionPane.WARNING_MESSAGE);
                    
                                    }
                                    
                                    else{  // Withdraw the amount, show a success message and display the debit card details
                                        debitC.withdraw(withdrawAmount, dateOfWithdrawal, pinNum);
                                        JOptionPane.showMessageDialog(frame,"Withdraw Successful");
                                        debitC.display();
                                        break; // Break out of the loop
                                    }
                                }
                            
                                else{ //show message dialog
                                JOptionPane.showMessageDialog(frame, "Withdraw amount cannot be negative!!",
                                    "Invalid Input", JOptionPane.WARNING_MESSAGE);
                                }
                            }
                        }
                    }
                }
                if(cardExists == false){// if cardExists is false show message dialog
                        JOptionPane.showMessageDialog(frame, "Debit card doesnt exist");
                        cardExists = false;
                        }
                
            } 
            }
            
            
            
            
        if(e.getSource() == cancelCreditCardB){
            //declare and initialize variable
            int cardId;
            String cardIdTxt = cancelcardIdTF.getText();
            boolean exists = false;
            if(cardIdTxt.isEmpty()){// Check if card ID text field is empty
                JOptionPane.showMessageDialog(frame, "Empty text field detected!! Please fill up all the text fields.", "Empty Field", JOptionPane.WARNING_MESSAGE);
            }
            else{
            try{
                cardId = Integer.parseInt(cardIdTxt);
            }
            catch(NumberFormatException excep){// Catch NumberFormatException
                JOptionPane.showMessageDialog(frame, "Invalid Input!! Please enter the correct data type!", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                return;
            }
            for(BankCard card : cards){// Loop through cards array list to check if Credit Card exists
                if(card instanceof CreditCard){
                    CreditCard creCard = (CreditCard)card;
                    if(creCard.getcardId() == cardId){
                        exists = true;
                        creCard.cancelCreditCard();// Cancel the credit card
                        creCard.display();
                        JOptionPane.showMessageDialog(frame, "Your Credit Card has been successfully canceled.");
                    }
                }
                
            }
            if(exists != true){// If Credit Card does not exist
                JOptionPane.showMessageDialog(frame, "Credit Card does not exist", "Error", JOptionPane.ERROR_MESSAGE);              
            }
            }
        }
        
        // If setCreditLimit button is clicked
        if(e.getSource() == setCreditLimit){
            //Declare variable
            int cardId,gracePeriod;
            String cardIdTxt,gracePeriodTxt,creditLimitTxt;
            double creditLimit;
            
            // Get the user inputs from the text fields
            cardIdTxt = setCardIdTF.getText();
            gracePeriodTxt = gracePeriodTF.getText();
            creditLimitTxt = creditLimitTF.getText();
            
            // Check if any of the fields are empty
            if(cardIdTxt.isEmpty()||gracePeriodTxt.isEmpty()||creditLimitTxt.isEmpty()){
                JOptionPane.showMessageDialog(frame, "Empty text field detected!! Please fill up all the text fields.", "Empty Field", JOptionPane.WARNING_MESSAGE);
            }
            else{
                try{// Parse the user inputs into integers and double
                    cardId = Integer.parseInt(setCardIdTF.getText());
                    gracePeriod = Integer.parseInt(gracePeriodTF.getText());
                    creditLimit = Double. parseDouble(creditLimitTF.getText());
                }
                catch(NumberFormatException excep){
                    JOptionPane.showMessageDialog(frame, "Invalid Input!! Please enter the correct data type!","Invalid Input",JOptionPane.WARNING_MESSAGE);
                    return;
                }
                 // Check if the cards list is empty
                if(cards.isEmpty()){
                        JOptionPane.showMessageDialog(frame," Make sure to enter you credit card first!","No Credit Card found",JOptionPane.WARNING_MESSAGE);
                        }
                boolean cardExist = false;
                // Check if the entered card ID exists in the cards list
                for(BankCard card : cards){
                    if(card instanceof CreditCard){
                        CreditCard creCard = (CreditCard)card;
                        if(creCard.getcardId() == cardId){
                            cardExist = true;
                        }
                        // Set the credit limit and grace period for the matching credit card
                        if(cardExist == true){
                            creCard.setcreditLimit(creditLimit, gracePeriod);
                            JOptionPane.showMessageDialog(frame, "Credit Limit has been successfully set.");
                            creCard.display();
                        }
                    }
                    
                }
                 // Display an error message if the entered card ID does not exist in the cards list
                if(cardExist == false){
                            
                            JOptionPane.showMessageDialog(frame, "Credit ID does not exist!!!","Error!!",JOptionPane.ERROR_MESSAGE);
                            
                        }
            }
        }
    }
        
    public static void main(String[] args){
        BankGUI obj = new BankGUI();
    }
}    
        
        
        
        
        
       
    
   
    