package ActionForms;

import org.apache.struts.action.ActionForm;

public class LoginActionForm extends ActionForm {
    private String account,password;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
