package com.example.demo.controller;

import com.example.demo.exception.GrilException;
import com.example.demo.repository.GrilRepository;
import com.example.demo.service.GrilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.example.demo.domain.Gril;
import javax.validation.Valid;
import com.example.demo.domain.Result;
import com.example.demo.utils.ResultUtil;


@RestController
@RequestMapping(value = "/gril")
public class GrilController {

    @Autowired
    GrilRepository grilRepository;

    @Autowired
    GrilService grilService;

    /**
     * 添加一个女生
     * @param gril
     * @param bindingResult
     * @return
     */
    @PostMapping(value = "/grils")
    public Result<Gril> grilAdd(@Valid Gril gril, BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }
        Gril gril1s = grilRepository.save(gril);
        return ResultUtil.success(gril1s);
    }

    /**
     *
     * @param id
     * @throws Exception
     */
    @GetMapping(value = "/grils/{id}")
    public void getAge(@PathVariable("id") Integer id) throws GrilException{
        grilService.getAge(id);
    }

}
