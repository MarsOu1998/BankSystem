package Actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ActionForms.LoginActionForm;
import DAO.UserDAO;
import PO.Users;
import org.apache.struts.action.*;

public class LoginAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        LoginActionForm loginActionForm=(LoginActionForm)form;
        String account=loginActionForm.getAccount();
        String password=loginActionForm.getPassword();
        UserDAO userDAO=new UserDAO();
        Users users1=userDAO.Login(account,password);
        if (users1==null){
            ActionMessages actionMessages=new ActionMessages();
            ActionMessage actionMessage=new ActionMessage("info.error");
            actionMessages.add("login",actionMessage);
            this.saveErrors(request,actionMessages);
            return mapping.getInputForward();
        }
        else if(users1.getAccount().equals(account)&&users1.getPassword().equals(password)){
            HttpSession session=request.getSession();
            session.setAttribute("users1",users1);
            return new ActionForward("/operate.jsp");
        }
        else{
            ActionMessages actionMessages=new ActionMessages();
            ActionMessage actionMessage=new ActionMessage("info.error");
            actionMessages.add("login",actionMessage);
            this.saveErrors(request,actionMessages);
            return mapping.getInputForward();

        }

    }
}
