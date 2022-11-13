package com.project.financial.service;

import com.project.financial.entity.User;
import com.project.financial.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor //bean 주입방법 생성자 final member, @NonNull member 생성자 생성함
public class UserService{

    private final UserRepository userRepository;

    public User saveMember(User user){
        validateDuplicateMember(user);
        return userRepository.save(user);
    }

    private void validateDuplicateMember(User member){
        User findMember = userRepository.findByEmail(member.getEmail());
        if(findMember != null){
            throw new IllegalStateException("이미 가입된 회원입니다."); // 예외 처리
        }
    }
}