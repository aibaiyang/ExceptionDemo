package com.example.demo.service;

import com.example.demo.repository.GrilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.domain.Gril;
import com.example.demo.exception.GrilException;
import com.example.demo.enums.ResultEnum;


@Service
public class GrilService {


    @Autowired
    private GrilRepository grilRepository;


    public void getAge(Integer id) throws GrilException{
        Gril gril = grilRepository.findOne(id);
        Integer age = gril.getAge();
        if (age < 10) {
            //返回“你还在上小学吧” code=100
            throw new GrilException(ResultEnum.PRIMARY_SCHOOL);
        }else if(age > 10 && age < 16){
            //返回“你可能在上初中” code=101
            throw new GrilException(ResultEnum.MIDDLE_SCHOOL);
        }

        //如果>16岁,加钱
        //...

    }


}
