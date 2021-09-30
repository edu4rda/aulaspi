package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventosAtvController {
	
	@RequestMapping("/eventos/forms")
	public String form() {
		return "formAtvEvento";
	}
	
}
