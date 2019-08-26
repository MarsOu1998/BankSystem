package Actions;

import ActionForms.WithdrawActionForm;
import DAO.UserDAO;
import PO.Users;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class WithdrawAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        WithdrawActionForm withdrawActionForm=(WithdrawActionForm)form;
        double money=withdrawActionForm.getMoney();
        HttpSession session=request.getSession();
        Users users=(Users)session.getAttribute("users1");
        if (users.getBalance()<money)
        {
            ActionMessages actionMessages=new ActionMessages();
            ActionMessage actionMessage=new ActionMessage("info.error.withdraw");
            actionMessages.add("withdraw",actionMessage);
            this.saveErrors(request,actionMessages);
            return mapping.getInputForward();
        }

            System.out.println(users.getBalance()-money);
            users.setBalance(users.getBalance() - money);
            UserDAO userDAO = new UserDAO();
            userDAO.updateUser(users);
            return new ActionForward("/operate.jsp");


    }
}
