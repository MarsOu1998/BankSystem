package ActionForms;

import org.apache.struts.action.ActionForm;

public class DepositActionForm extends ActionForm {
    private double money;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
