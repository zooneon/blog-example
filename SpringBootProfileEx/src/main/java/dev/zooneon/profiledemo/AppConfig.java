package dev.zooneon.profiledemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${me.nickname}")
    private String nickname;
    @Value("${me.age}")
    private int age;
    @Value("${me.github}")
    private String github;
//    @Value("${me.univ}")
//    private String univ;
//    @Value("${me.major}")
//    private String major;
    @Value("${db.username}")
    private String dbUsername;
    @Value("${db.password}")
    private String dbPassword;

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public String getGithub() {
        return github;
    }

//    public String getUniv() {
//        return univ;
//    }
//
//    public String getMajor() {
//        return major;
//    }

    public String getDbUsername() {
        return dbUsername;
    }

    public String getDbPassword() {
        return dbPassword;
    }
}
