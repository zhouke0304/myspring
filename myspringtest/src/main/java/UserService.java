public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(){
        System.out.println("UserService开始执行save操作");
        userDao.insert();
        System.out.println("UserService执行save操作结束");
    }
}
