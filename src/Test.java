import DAO.UserDAO;
import PO.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
    public static void main(String[] args) {
        UserDAO userDAO=new UserDAO();
        Users users=new Users();
        users.setName("88");
        users.setPassword("88");
        users.setAccount("88");
        users.setBalance(88);
        userDAO.updateUser(users);
    }
}
