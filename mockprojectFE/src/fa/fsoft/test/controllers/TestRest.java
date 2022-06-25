package fa.fsoft.test.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestRest {
	
	@RequestMapping(value="/index")
	public ModelAndView getView(Model model) {
		RestTemplate restTemplate = new RestTemplate();
		String sources = "http://localhost:8001/greeting";
		ResponseEntity<String> entity = restTemplate.getForEntity(sources, String.class);
		model.addAttribute("text", entity.getBody());
		return new ModelAndView("index");
	}
}
