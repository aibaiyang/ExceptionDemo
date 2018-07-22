package com.example.demo.handle;

import com.example.demo.constant.GrilConstant;
import com.example.demo.domain.Result;
import com.example.demo.exception.GrilException;
import com.example.demo.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author by
 *
 */
@ControllerAdvice
public class ExceptionHandle {

	/**
	 * 方法一
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public Result handle(Exception e){
		//instanceof用来判断内存中实际对象A是不是B类型
		if (e instanceof GrilException) {
			//必须经过这一行代码，grilException对象才能调用GrilException里的方法
			GrilException grilException = (GrilException) e;
			return ResultUtil.error(grilException.getCode(), grilException.getMessage());
		}else{
			return ResultUtil.error(GrilConstant.code,GrilConstant.grilException);
		}
	}


	/**
	 * 方法二：定义两个异常，当请求处理出现异常时会根据异常处理器的配置顺序依次尝试异常匹配和处理
	 * @param e
	 * @return
	 */
	/*@ExceptionHandler(value = GrilException.class)
	@ResponseBody
	public Result GrilExceptionHandle(GrilException e){
		 return ResultUtil.error(e.getCode(), e.getMessage());
	}


	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public Result exceptionHandle(Exception e){
		return ResultUtil.error(GrilConstant.code,GrilConstant.grilException);
	}*/

}
