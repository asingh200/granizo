package org.granizo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
	public class HomeController {

	    @RequestMapping("/b")
	    public String index() {
	        return "Greetings from Granizo!";
	    }
	    
	    private static final String template = "Hello, %s!";
	    private final AtomicLong counter = new AtomicLong();

	    @RequestMapping(method=RequestMethod.GET)
	    public @ResponseBody String ello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
	        return "Hi This is Granizo copyright";
	    }

}