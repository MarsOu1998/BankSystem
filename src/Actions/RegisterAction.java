package Actions;

import ActionForms.RegisterActionForm;
import DAO.UserDAO;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        RegisterActionForm registerAction=(RegisterActionForm)form;
        if(!registerAction.getPassword().equals(registerAction.getPasswordAgain())) {
            return new ActionForward("/notSame.jsp");
        }
        else{
            UserDAO userDAO=new UserDAO();
            boolean flag=userDAO.register(registerAction.getAccount(),registerAction.getPassword(),registerAction.getName());
                if(flag==false){
                    return new ActionForward("/existsError.jsp");
                }
                else
                    return new ActionForward("/success.jsp");
            }
        }

}
