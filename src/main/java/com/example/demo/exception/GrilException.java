package com.example.demo.exception;

import com.example.demo.enums.ResultEnum;
import lombok.Data;

@Data
public class GrilException extends RuntimeException{

	private Integer code;

//	private String emage;

	//获取父类中的错误信息
	public GrilException(ResultEnum resultEnum) {
		super(resultEnum.getMsg());
		this.code = resultEnum.getCode();
	}

	/*public GrilException(ResultEnum resultEnum){
		this.code = resultEnum.getCode();
		this.emage = resultEnum.getMsg();
	}*/

}
