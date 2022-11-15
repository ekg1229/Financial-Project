package com.project.financial.service;

import com.project.financial.constant.RiskAversionStatus;
import com.project.financial.dto.SignUpDto;
import com.project.financial.entity.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(locations="classpath:application-test.properties")
class UserServiceTest {
    @Autowired
    UserService userService;

    @Autowired
    PasswordEncoder passwordEncoder;

    public User createUser(){
        SignUpDto signUpDto = new SignUpDto();
        signUpDto.setName("김정윤");
        signUpDto.setEmail("test@email.com");
        signUpDto.setPassword("password");
        return User.createUser(signUpDto, passwordEncoder);
    }

    @Test
    @DisplayName("회원가입 테스트")
    public void saveUserTest(){
        User user = createUser();
        User savedMember = userService.saveUser(user);
        assertEquals(user.getName(), savedMember.getName()); //A and B 객체가 같은 값을 가지는지 확인
        assertEquals(user.getEmail(), savedMember.getEmail());
        assertEquals(user.getPassword(), savedMember.getPassword());
        assertEquals(user.getRiskAversionStatus(), savedMember.getRiskAversionStatus());
    }
}