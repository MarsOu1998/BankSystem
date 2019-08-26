package MySQL;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "用户表", schema = "登录注册表", catalog = "")
public class 用户表Entity {
    private String 账号;
    private String 密码;
    private String 姓名;

    @Id
    @Column(name = "账号")
    public String get账号() {
        return 账号;
    }

    public void set账号(String 账号) {
        this.账号 = 账号;
    }

    @Basic
    @Column(name = "密码")
    public String get密码() {
        return 密码;
    }

    public void set密码(String 密码) {
        this.密码 = 密码;
    }

    @Basic
    @Column(name = "姓名")
    public String get姓名() {
        return 姓名;
    }

    public void set姓名(String 姓名) {
        this.姓名 = 姓名;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        用户表Entity 用户表Entity = (用户表Entity) o;
        return Objects.equals(账号, 用户表Entity.账号) &&
                Objects.equals(密码, 用户表Entity.密码) &&
                Objects.equals(姓名, 用户表Entity.姓名);
    }

    @Override
    public int hashCode() {
        return Objects.hash(账号, 密码, 姓名);
    }
}
