package springboot.service;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import springboot.zz.Doctor;

/**
 * @author zzzz
 * @create 2019-10-15 下午12:15
 */

@Repository
public interface SearchService {
    public Doctor search(int i);
}
