package pages;

import base.Keywords;
import base.Test;
import constants.Keys;
import constants.OS;
import exceptions.ApplicationException;
import helper.Device;
import xpath.Contains;
import xpath.Matching;

import java.text.ParseException;

public class PageCardTransferReview extends Keywords {

    private String keyBtnTransfer="Getgo.CardTransferReview.BtnTransfer";
    private String keyTransferFrom="Getgo.CardTransferReview.LblTransferFrom";
    private String keyTransferTo="Getgo.CardTransferReview.LblTransferTo";
    private String keyTransferFees="Getgo.CardTransferReview.LblTransferFees";
    private String keyTransferAmount="Getgo.CardTransferReview.LblTransferAmount";
    private String keyTransferDate="Getgo.CardTransferReview.LblTransferDate";
    private String keyTransferMessage="Getgo.CardTransferReview.LblMessage";

    private String keyLblPageTitle=" Getgo.CardTransferReview.LblPageTitle";
    private String keyBtnClose="Getgo.CardTransferReview.BtnClose";
    private String keyBtnEdit=" Getgo.CardTransferReview.BtnEdit";
    private String keyLblPageDescription="Getgo.CardTransferReview.LblPageDescription";
    private String keyLblTransferFeesNotes="Getgo.CardTransferReview.LblTransferFeesNotes";

    public void fromDetails(String fromCard,String fromUser) throws ApplicationException {
        if(Test.attributes.get(Keys.OS).equalsIgnoreCase(OS.ANDROID))
        {
            verify.elementTextContains(keyTransferFrom,fromUser);
            //verify.elementTextContains(keyTransferFrom,fromCard);
            verify.elementIsPresent(keyTransferFrom);
        }else if(Test.attributes.get(Keys.OS).equalsIgnoreCase(OS.iOS)){
           verify.elementTextContains(keyTransferFrom,fromUser);
            verify.elementTextContains(xpathOf.textView(Contains.name("fund-transfer-from-card")),fromCard);
        }
    }

    public void toDetails(String toCard,String toUser) throws ApplicationException {
        if(Test.attributes.get(Keys.OS).equalsIgnoreCase(OS.ANDROID))
        {
            verify.elementTextContains(keyTransferTo,toUser);
            verify.elementTextContains(keyTransferTo,toCard);
        }else if(Test.attributes.get(Keys.OS).equalsIgnoreCase(OS.iOS)){
            verify.elementTextContains(keyTransferTo,toUser);
            verify.elementTextContains(xpathOf.textView(Contains.name("fund-transfer-to-card")),toCard);
        }
    }

    public void transferFees(double transferFees) throws ApplicationException
    {
        if(Device.isAndroid()) {
            String expectedValue = Test.tools.pesoAmount(transferFees);
            String actualValue = Test.tools.nbspRemove(get.elementBy(keyTransferFees).getText());
            verify.isMatching(expectedValue, actualValue);
        }
        else
        {
            String expectedValue = Test.tools.pesoAmount(transferFees);
            String actualValue = Test.tools.nbspRemove(get.elementBy(keyTransferFees).getText());
            verify.isMatching(expectedValue, actualValue);
        }
    }

    public void transferMessage(String message) throws ApplicationException {
        verify.elementTextContains(keyTransferMessage,message);
    }

    public void transferAmount(double transferAmount) throws ApplicationException
    {
        if(Device.isAndroid()) {
            String expectedValue = Test.tools.pesoAmount(transferAmount);
            String actualValue = Test.tools.nbspRemove(get.elementBy(keyTransferAmount).getText());
            verify.isMatching(expectedValue, actualValue);
        }
        else
        {
            String expectedValue = Test.tools.pesoAmount(transferAmount);
            String actualValue = Test.tools.nbspRemove(get.elementBy(keyTransferAmount).getText());
            verify.isMatching(expectedValue, actualValue);
        }
    }

    public void transferDate(String day,String month,String year) throws ParseException, ApplicationException {
        String transferDate=null;
        if(Test.attributes.get(Keys.OS).equalsIgnoreCase(OS.ANDROID))
        {
            transferDate = Test.tools.getDateInFormat(day,month,year,"MMMM dd, YYYY");
            verify.elementTextContains(keyTransferDate,transferDate);

        }else if(Test.attributes.get(Keys.OS).equalsIgnoreCase(OS.iOS))
        {
            transferDate = Test.tools.getDateInFormat(day,month,year,"MMM dd, YYYY");
            verify.elementTextContains(keyTransferDate,transferDate);
        }
    }

    public void clickTransfer() throws ApplicationException {
        swipe.vertical(2,0.9,0.5,5);
        click.elementBy(keyBtnTransfer);
    };

    public void verifyTitle(String ititle) throws ApplicationException {
        WAIT.forSeconds(3);
        verify.elementTextMatching(keyLblPageTitle,ititle);
    }

    public void verifyPageContents() throws ApplicationException {
        WAIT.forSeconds(3);
        verify.elementIsPresent(keyBtnClose);
        verify.elementIsPresent(keyBtnEdit);
        verify.elementTextMatching(keyLblPageDescription,"Always check and review your details to ensure that the information is correct.");
        verify.elementTextMatching(keyLblTransferFeesNotes,"A PHP 20.00 transaction fee will charge on top of this transaction");

    }
    public void verifyTransactionMessage(String itext) throws ApplicationException {
        verify.elementTextMatching(keyTransferMessage,itext);

    }
    public void verifyTransactionDate() throws ApplicationException {
        verify.elementIsPresent(keyTransferDate);

    }
}