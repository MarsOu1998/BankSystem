package Actions;

import ActionForms.DepositActionForm;
import DAO.UserDAO;
import PO.Users;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DepositAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        DepositActionForm depositActionForm=(DepositActionForm)form;
        double money=depositActionForm.getMoney();
        UserDAO userDAO=new UserDAO();
        HttpSession session=request.getSession();
        Users users=(Users)session.getAttribute("users1");
        users.setBalance(users.getBalance()+money);
        userDAO.updateUser(users);
        return new ActionForward("/operate.jsp");
    }
}
