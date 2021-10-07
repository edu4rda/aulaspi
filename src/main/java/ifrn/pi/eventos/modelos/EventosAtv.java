package ifrn.pi.eventos.modelos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class EventosAtv {

	@Controller
	public class EventosAtvController {

		@RequestMapping("/")
		public String formAtvEvento() {
			System.out.println("Chamou o método index.");
			return "formAtvEvento";
		}
		
	}
}
