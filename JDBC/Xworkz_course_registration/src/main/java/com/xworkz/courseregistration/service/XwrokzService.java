package com.xworkz.courseregistration.service;

import com.xworkz.courseregistration.dto.XworkzDTO;

public interface XwrokzService {

    String save(XworkzDTO dto);

    boolean validate(XworkzDTO dto);

    public String getNameByEmailAndPassword(String email, String password);

}