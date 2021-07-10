package app;

import config.SysConfig;
import model.SysUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lys
 * @DESCRIPTION 开心写好每一行代码，认真、严谨。
 * @create 2021/7/11 0:26
 */
public class TestApp01 {

    public static void main(String[] args) {
        // 获取容器
        ApplicationContext ac =new AnnotationConfigApplicationContext(SysConfig.class);
        // 获取 bean
        SysUser user = (SysUser) ac.getBean("sysUser");
        System.out.println("==你好="+user.toString());
    }
}
