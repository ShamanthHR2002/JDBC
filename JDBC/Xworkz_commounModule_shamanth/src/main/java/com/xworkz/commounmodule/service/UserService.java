package com.xworkz.commounmodule.service;

import com.xworkz.commounmodule.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    boolean valid(UserDTO userDTO);
}
