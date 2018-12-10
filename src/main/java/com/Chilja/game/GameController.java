package com.Chilja.game;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Chilja.game.*;

@RestController
public class GameController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from CarQuartet!";
	}
}
