package com.project.financial.repository;

import com.project.financial.constant.RiskAversionStatus;
import com.project.financial.entity.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;

@SpringBootTest
@TestPropertySource(locations="classpath:application-test.properties") // 테스트 실행시 우선되는 설정파일
class UserRepositoryTest {
    @Autowired //필드 Bean 주입
    UserRepository userRepository;

    @Test //Method 테스트 대상 지정
    @DisplayName("유저 정보 세팅") // 테스트명
    public void createUserTest(){
        User user = new User();
        user.setEmail("ekg1229@naver.com");
        user.setPassword("password");
        user.setName("김정윤");
        user.setToken(1000000);
        user.setRegTime(LocalDateTime.now());
        user.setUpdateTime(LocalDateTime.now());
        user.setRiskAversionStatus(RiskAversionStatus.RISK);
        user.setRiskFreeType("채권");
        user.setRiskFreeAmount(900);

        User savedUser = userRepository.save(user);
        System.out.println(savedUser);
    }
}