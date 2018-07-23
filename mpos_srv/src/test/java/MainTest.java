/**
 * Created by langrs on 2016-11-11.
 */
public class MainTest {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("lzm");
        userInfo.setUserNo("001");
        UserInfoDao userInfoDao = new UserInfoDao();
        userInfoDao.update(userInfo);
    }
}
