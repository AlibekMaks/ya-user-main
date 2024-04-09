package com.ya.yausermain.service;

import com.ya.yausermain.dtos.UserDTO;
import com.ya.yausermain.entity.User;
import com.ya.yausermain.mappers.UserMapper;
import com.ya.yausermain.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.expression.ExpressionException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;
    private final UserRepo userRepo;

    @Transactional
    public User saveUser(UserDTO user) {
        User userEntity = userMapper.toEntity(user);
        userEntity.setRegistrationDate(LocalDateTime.now());
        userEntity = userRepo.save(userEntity);
        return userEntity;
    }

    public UserDTO findById(Long id) {
        User userEntity = userRepo.findById(id).orElseThrow(() -> new ExpressionException("USER_NOT_FOUND"));

        return userMapper.toFullDto(userEntity);
    }

    public List<UserDTO> findAll() {
        List<User> all = userRepo.findAll();
        return all.stream().map(userMapper::toFullDto).collect(Collectors.toList());
    }
}
