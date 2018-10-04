package pages;

import base.Keywords;
import exceptions.ApplicationException;

public class PageSignUp extends Keywords {

    private String keyImgGetgoCard = "Getgo.SignUp.ImgGetgoCard";
    private String keyLblPageCaption1 = "Getgo.SignUp.LblCaption1";
    private String KeyLblPageCaption2 = "Getgo.SignUp.LblCaption2";
    private String keyBtnCreateVirutalCard = "Getgo.SignUp.BtnCreateVirtualCard";
    private String keyBtnRegisterPesoCard = "Getgo.SignUp.BtnRegisterPhysicalCard";

    private String keyTxtEmailAddress = "Getgo.SignUp.TxtEmailAddress";
    private String keyBtnNext = "Getgo.SignUp.BtnNext";
    private String keyLinkAlreadyHaveaPrepaidCard = "Getgo.SignUp.LinkAlreadyHaveaPrepaidCard";
    private String keyLblPageTitle = "Getgo.SignUp.LblPageTitle";
    private String keyLblPageHeader = "Getgo.SignUp.LblPageHeader";
    private String keyBtnBack = "Getgo.SignUp.BtnBack";
    private String keyLblErrorMessage = "Getgo.SignUp.LblErrorMessage";


    public void doesPageContains(String caption, String caption2, String createVirutalCardBtnTxt, String registerPhysicalCardBtnTxt) throws ApplicationException
    {
        WAIT.forSeconds(5);
        verify.elementIsPresent(keyImgGetgoCard);
        verify.elementTextMatching(keyBtnCreateVirutalCard,createVirutalCardBtnTxt);
        verify.elementTextMatching(keyBtnRegisterPesoCard,registerPhysicalCardBtnTxt);
        verify.elementTextMatching(keyLblPageCaption1,caption);
        verify.elementTextMatching(KeyLblPageCaption2,caption2);
    }

    public void registerVirtualCard() throws ApplicationException {
        WAIT.forSeconds(5);
        click.elementBy(keyBtnCreateVirutalCard);
    }

    public void verifyPageTitle(String ititle) throws ApplicationException {
        WAIT.forSeconds(2);
        verify.elementTextMatching(keyLblPageTitle,ititle);

    }


    public void verifySignUpPageContents () throws ApplicationException
    {
        WAIT.forSeconds(2);
        verify.elementTextMatching(keyLblPageHeader,"Enter your email address to sign-up");
        verify.elementIsPresent(keyTxtEmailAddress);
        verify.elementAttributeMatching(keyTxtEmailAddress,"text","Email Address");
        verify.elementIsPresent(keyBtnBack);
        verify.elementIsPresent(keyBtnNext);
        verify.elementIsPresent(keyLinkAlreadyHaveaPrepaidCard);

    }

    public void verifyErrorMessage(String ierror) throws ApplicationException
    {
        WAIT.forSeconds(1);
        verify.elementTextMatching(keyLblErrorMessage,ierror);

    }

    public void enterEmailAddress(String iemail) throws ApplicationException
    {
        type.data(keyTxtEmailAddress,iemail);
        WAIT.forSeconds(5);
    }

    public void clickNext() throws ApplicationException
    {
        click.elementBy(keyBtnNext);
    }

}
