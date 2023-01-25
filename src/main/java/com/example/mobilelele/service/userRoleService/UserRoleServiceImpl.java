package com.example.mobilelele.service.userRoleService;

import com.example.mobilelele.repository.UserRoleRepository;
import com.example.mobilelele.service.init.DataBaseInitService;
import com.example.mobilelele.service.userRoleService.UserRoleService;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements UserRoleService, DataBaseInitService {
    private final UserRoleRepository userRoleRepository;

    public UserRoleServiceImpl(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean existInDb() {
        return this.userRoleRepository.count()!=0;
    }
}
