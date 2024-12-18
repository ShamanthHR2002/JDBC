
package com.xworkz.commounmodule.repository;

import com.xworkz.commounmodule.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

    boolean save(UserEntity userEntity);
}
