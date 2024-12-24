package mvc_demo;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class MyClass {
	
	@RequestMapping("/hello")
	@ResponseBody
	 String hello() {
		return "hello myclass" ;
		
	}
	@RequestMapping("/hi")
	@ResponseBody
	String hi() {
		return "hiiii da sunni" ;
		
	}
	
	@RequestMapping("/otp")
	@ResponseBody
	String otp() {
		return "otp " + new Random().nextInt(1000,10000) ;
		
	}
	
	
	
	
	

}
