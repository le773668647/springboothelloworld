package springboot.mapper;

import org.springframework.stereotype.Repository;
import springboot.dto.Doctor;

/**
 * @author zzzz
 * @create 2019-10-15 下午12:15
 */

@Repository
public interface SearchMapper {
    public Doctor search(int i);
}
