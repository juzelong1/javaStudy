package Service;

import Dao.UserDao;
import Dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        this.userDao.getUser();
    }
}
