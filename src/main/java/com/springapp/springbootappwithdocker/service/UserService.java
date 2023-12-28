package com.springapp.springbootappwithdocker.service;

import com.springapp.springbootappwithdocker.repository.EmployeeEntity;
import com.springapp.springbootappwithdocker.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public String getUserNameById(Long id) {
        EmployeeEntity employee = userRepository.getFirstById(id);
        return employee.getName();
    }
}
