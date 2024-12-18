
package com.xworkz.commounmodule.service;

import com.xworkz.commounmodule.dto.UserDTO;
import com.xworkz.commounmodule.entity.UserEntity;
import com.xworkz.commounmodule.repository.UserRepository;

import com.xworkz.commounmodule.repository.UserRepositoryImp;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Random;

@Service
public class UserServiceImp implements UserService {

    public char[] passwordGenerate() {
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";


        String values = Capital_chars + Small_chars +
                numbers;


        Random rndm = new Random();

        char[] password = new char[6];

        for (int i = 0; i < 6; i++) {

            password[i] = values.charAt(rndm.nextInt(values.length()));

        }
        return password;
    }

    @Override
    public boolean valid(UserDTO userDTO) {
        boolean valid=false;
        if(userDTO.getEmail()!=null) {
            UserEntity userEntity=new UserEntity();
            System.out.println("length : "+userDTO.getEmail().length());
            char[] password = passwordGenerate();
            userEntity.setName(userDTO.getName());
            userEntity.setEmail(userDTO.getEmail());
            userEntity.setPassword(Arrays.toString(password));
            userEntity.setPhoneNo(Long.parseLong(userDTO.getPhoneNo()));
            userEntity.setAltEmail(userDTO.getAltEmail());
            userEntity.setAltPhoneNo(Long.parseLong(userDTO.getAltPhhoneNo()));
            userEntity.setLocation(userDTO.getLocation());

            valid=true;

            System.out.println( "generated password  : "+password);
            UserRepository userRepository= (UserRepository) new UserRepositoryImp();
            boolean saved=userRepository.save(userEntity);
        }
        return valid;
    }
}
