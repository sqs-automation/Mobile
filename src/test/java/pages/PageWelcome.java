package pages;

import base.Keywords;
import exceptions.ApplicationException;
import exceptions.EnvironmentException;

public class PageWelcome extends Keywords {

    private String keyBtnLogin="Getgo.Welcome.BtnLogin.ID";
    private String keyBtnSignUp="Getgo.Welcome.BtnSignUp.ID";

    public void launchGetgo() throws EnvironmentException {
	    launchApplication();
    }

    public void doesPageContains(String loginBtnTxt,String signUpBtnTxt,String captionTxt) throws ApplicationException {
	    verify.elementIsPresent("Getgo.Welcome.ImgLogo.ID");
        verify.elementTextMatching("Getgo.Welcome.LblCaption.XPATH",captionTxt);
        verify.elementTextMatching(keyBtnLogin,loginBtnTxt);
        verify.elementTextMatching(keyBtnSignUp,signUpBtnTxt);
    }

    public void clickLogin() throws ApplicationException {
	    click.elementBy(keyBtnLogin);
    }

    public void clickSignUp() throws ApplicationException {
        click.elementBy(keyBtnSignUp);
    }
}