package fa.fsoft.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testRest {
	@GetMapping(value = "greeting")
	public String name() {
		return "hello";
	}
}
