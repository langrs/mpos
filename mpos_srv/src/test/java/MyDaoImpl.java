import com.site.entity.QueryMap;

import java.io.Serializable;
import java.util.List;

/**
 * Created by langrs on 2016-11-11.
 *
 */
public class MyDaoImpl<PK extends Serializable,T> implements MyDao<PK,T>{
    public void create(T entity) {
        System.out.println("create方法:"+entity.toString());
    }

    public T query(PK id) {
        System.out.println("query方法:" + id.toString());
        return null;
    }

    public List<T> queryList(QueryMap queryMap) {
        System.out.println("queryList方法:" + queryMap.toString());
        return null;
    }

    public void delete(PK id) {
        System.out.println("delete方法:" + id.toString());
    }

    public void update(T entity) {
        System.out.println("update方法:" + entity.toString());
    }
}

