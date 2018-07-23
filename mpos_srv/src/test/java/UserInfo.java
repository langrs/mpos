/**
 * Created by langrs on 2016-11-11.
 */
public class UserInfo {
    protected String userName;
    protected String userNo;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userName='" + userName + '\'' +
                ", userNo='" + userNo + '\'' +
                '}';
    }
}
