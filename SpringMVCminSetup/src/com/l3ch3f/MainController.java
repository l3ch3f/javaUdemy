package com.l3ch3f;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

		@RequestMapping(value = "/", method = RequestMethod.GET)
		public String welcome() {
			return "hello";
		}
}
