package com.project.financial.entity;

import com.project.financial.constant.RiskAversionStatus;
import com.project.financial.dto.SignUpDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="user")
@Getter
@Setter
@ToString
public class User{
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id; //유저 아이디

    @Column(unique = true)
    private String email; //이메일; @필수

    private String password; //비밀번호; 10자리 이하

    private String name; //사용자 이름

    private Integer token; //토큰

    private LocalDateTime regTime; //등록 시간

    private LocalDateTime updateTime; //수정 시간

    @Enumerated(EnumType.STRING)
    private RiskAversionStatus riskAversionStatus; //투자 성향(RISK: 위험, NORMAL: 보통, SAFE: 안전)

    private String riskFreeType; //무위험자산 종류

    private Integer riskFreeAmount; //무위험자산 양

    public static User createUser(SignUpDto signUpDto, PasswordEncoder passwordEncoder){
        User user = new User();
        user.setName(signUpDto.getName());
        user.setEmail(signUpDto.getEmail());
        String password = passwordEncoder.encode(signUpDto.getPassword());
        user.setPassword(password);
        return user;
    }
}