package model;

/**
 * @author lys
 * @DESCRIPTION 开心写好每一行代码，认真、严谨。
 * @create 2021/7/11 0:19
 */
public class SysUser {
    private String username;
    private String password;
    public SysUser() {
    }

    public SysUser(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
