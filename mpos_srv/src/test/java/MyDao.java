import com.site.entity.QueryMap;

import java.io.Serializable;
import java.util.List;

/**
 * Created by langrs on 2016-11-11.
 */
public interface MyDao<PK extends Serializable,T> {
     T query(PK id);
    List<T> queryList(QueryMap queryMap);
     void delete(PK id);
     void update(T entity);
     void create(T entity);
}
