package config;

import model.SysUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lys
 * @DESCRIPTION 开心写好每一行代码，认真、严谨。
 * @create 2021/7/11 0:24
 */
@Configuration
public class SysConfig {

    @Bean
    public SysUser sysUser(){
        return new SysUser("zhangsan","123");
    }
}
