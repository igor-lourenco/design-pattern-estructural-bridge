package estructural.bridge.backend.services;

import estructural.bridge.backend.dao.UserDao;
import estructural.bridge.backend.model.User;

public abstract class UserService {
    protected UserDao dao;

    public UserService(UserDao dao) {
	this.dao = dao;
    }

    public abstract void save(User user);
}
