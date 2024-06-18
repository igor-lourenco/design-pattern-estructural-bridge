package estructural.bridge.backend;

import estructural.bridge.backend.dao.UserMongoDao;
import estructural.bridge.backend.dao.UserMysqlDao;
import estructural.bridge.backend.dao.UserOracleDao;
import estructural.bridge.backend.dao.UserPostgresDao;
import estructural.bridge.backend.model.User;
import estructural.bridge.backend.services.UserEJB;
import estructural.bridge.backend.services.UserRest;
import estructural.bridge.backend.services.UserService;
import estructural.bridge.backend.services.UserSoap;

public class Client {

    public static void main(String[] args) {
	User user = new User("user", "user@email.com", "passwd");

	UserService userRestOracleService = new UserRest(new UserOracleDao());
	userRestOracleService.save(user);

	UserService userEJBMongoService = new UserEJB(new UserMongoDao());
	userEJBMongoService.save(user);

	UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
	userSoapPostgresService.save(user);

	// .......

	UserService userRestMysqlService = new UserRest(new UserMysqlDao());
	userRestMysqlService.save(user);

    }
}
