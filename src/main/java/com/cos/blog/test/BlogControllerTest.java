package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

// 스프링이 com.cos.blog 패키지 이하를 스캔해서 모든파일을 메모리에 new 하는것은 아니다.
// 특정 어노테이션이 붙어있는 어노테이션이 붙어있는 클래스파일들을 new홰서(IOC)스프링 컨테이너에서 관리해줍니다.
@RestController 
public class BlogControllerTest {

		//http://localhost:8080/test/hello
		@GetMapping("/test/hello")
		public String hello() {
			return "<h1>hello spring boot</h1>";
		}
}
