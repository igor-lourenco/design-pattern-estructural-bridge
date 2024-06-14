package estructural.bridge.backend.dao;

import estructural.bridge.backend.model.User;

public class UserMongoDao implements UserDao {

    @Override
    public void save(User user) {
	System.out.println("Saving the user in the Mongo Database!");
    }
}
