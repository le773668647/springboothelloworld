package springboot.zz;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author zzzz
 * @create 2019-10-15 下午12:15
 */
@Component
public class Doctor {
    private String id;
    private String name;
    private String object;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;
}
