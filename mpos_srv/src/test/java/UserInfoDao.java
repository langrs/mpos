import com.site.base.MyBatisDaoImpl;

public class UserInfoDao extends MyBatisDaoImpl<String,UserInfo> {
    @Override
    public String getNamespace() {
        return null;
    }
}
