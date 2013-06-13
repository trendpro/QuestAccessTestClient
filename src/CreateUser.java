import com.qaccess.examples.BusinessClient;
import com.qaccess.examples.BusinessServer;
import com.qaccess.examples.BusinessService;
import com.qaccess.net.Server;
import com.qaccess.useraccess.Service;
import com.qaccess.useraccess.User;
import com.qaccess.useraccess.UserExistsException;


public class CreateUser {
	public static void main(String args [])
	{
		BusinessServer.main(args);
		Server serv = Server.getExistingServer("business");
		Service service = new Service("dataAccess", BusinessService.class, serv, 1);
		
		try {
			User user = new User("dmitry","pass","localhost", serv, service);
		} catch (UserExistsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
