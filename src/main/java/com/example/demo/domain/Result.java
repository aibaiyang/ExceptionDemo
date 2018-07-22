package com.example.demo.domain;

import lombok.Data;

/**http请求返回的最外层对象
 * @author by
 *
 */
@Data
public class Result<T> {
	
	/*错误码*/
	private Integer code;
	
	/*提示信息*/
	private String msg;
	
	/*具体的内容*/
	private T data;

}
