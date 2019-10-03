package notes.rest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HalloWorld {
	
	@Value("${server.port}${spring.datasource.url}")
	private String address;
	
	@RequestMapping(method=RequestMethod.GET,value="/say")
	public String sayHalloWorld() {
		
		return this.address;
	}

}
