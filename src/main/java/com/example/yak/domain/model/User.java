package com.example.yak.domain.model;

import java.io.Serializable;

import lombok.Data;

/**
 * @author 周加克
 */
@Data
public class User implements Serializable  {


		private static final long serialVersionUID = 1L;

		private Long id;
		
		private String userName;
		
		private String passWord;
		
		private String email;
		
		private String nickName;
		
		private String regTime;
		

}
