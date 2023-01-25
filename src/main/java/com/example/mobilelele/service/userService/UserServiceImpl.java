package com.example.mobilelele.service.userService;

import com.example.mobilelele.repository.UserRepository;
import com.example.mobilelele.service.init.DataBaseInitService;
import com.example.mobilelele.service.userService.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService, DataBaseInitService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean existInDb() {
        return this.userRepository.count()!=0;
    }
}
