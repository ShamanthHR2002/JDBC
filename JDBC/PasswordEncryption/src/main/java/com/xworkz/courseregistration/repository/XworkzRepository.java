package com.xworkz.courseregistration.repository;

import com.xworkz.courseregistration.entity.XworkzEntity;

public interface XworkzRepository {
    boolean onSave(XworkzEntity entity);

    String getNameByEmailAndPassword(String email, String password);

    XworkzEntity findByemail(String email);

}