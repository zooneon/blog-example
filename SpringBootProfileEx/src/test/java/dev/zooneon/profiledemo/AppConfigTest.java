package dev.zooneon.profiledemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AppConfigTest {

    @Autowired
    private AppConfig appConfig;

    @Test
    void groupTest() {
        assertThat(appConfig.getNickname()).isEqualTo("junwon");
        assertThat(appConfig.getAge()).isEqualTo(27);
//        assertThat(appConfig.getUniv()).isEqualTo("Graduate");
//        assertThat(appConfig.getMajor()).isEqualTo("Computer Engineering");
        assertThat(appConfig.getDbUsername()).isEqualTo("prod-user");
        assertThat(appConfig.getDbPassword()).isEqualTo("qwerty!@");
    }
}