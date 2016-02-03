package com.springapp.mvc;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springapp.mvc.model.Board;
import com.springapp.mvc.model.Reply;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

	@RequestMapping(value = "/complexTest2/{test}", method = RequestMethod.POST)
	public ResponseEntity complexTest2(@ModelAttribute("test") String test, @RequestParam("complexObject") String complexObject) {
		ObjectMapper mapper = new ObjectMapper();
		HashMap<String, Reply> parseComplexObject = new HashMap<String, Reply>();
		try {
			parseComplexObject = mapper.readValue(complexObject, new TypeReference<HashMap<String, Reply>>() {});
			System.out.println(parseComplexObject);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return new ResponseEntity(parseComplexObject, HttpStatus.OK);
	}

	@RequestMapping(value = "/complexTest/{test}", method = RequestMethod.POST)
	public ResponseEntity complexTest(@ModelAttribute("test") String test, @RequestParam("complexObject") String complexObject) {
		ObjectMapper mapper = new ObjectMapper();
		HashMap<String, ArrayList<HashMap<String,String>>> parseComplexObject = new HashMap<String, ArrayList<HashMap<String,String>>>();
		try {
			parseComplexObject = mapper.readValue(complexObject, new TypeReference<HashMap<String, ArrayList<HashMap<String,String>>>>() {});
		} catch (IOException e) {
			e.printStackTrace();
		}

		return new ResponseEntity(parseComplexObject, HttpStatus.OK);
	}

	@RequestMapping(value = "/get3test/{test}", method = RequestMethod.GET)
	public ResponseEntity getTest(@ModelAttribute("test") String test, @RequestParam("board") String board) {
		ObjectMapper mapper = new ObjectMapper();
		Board parseBoard = new Board();

		try {
			parseBoard = mapper.readValue(board, Board.class);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return new ResponseEntity(parseBoard, HttpStatus.OK);
	}

	@RequestMapping(value = "/post3test/{test}", method = RequestMethod.POST)
	public ResponseEntity postTest(@ModelAttribute("test") String test, @RequestParam("board") String board) {
		ObjectMapper mapper = new ObjectMapper();
		Board parseBoard = new Board();

		try {
			parseBoard = mapper.readValue(board, Board.class);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return new ResponseEntity(parseBoard, HttpStatus.OK);
	}

	@RequestMapping(value = "/get2Test/{test}", method = RequestMethod.GET)
	public ResponseEntity getTest(@ModelAttribute("test") String test, @ModelAttribute("reply") Reply reply) {
		return new ResponseEntity(reply, HttpStatus.OK);
	}

	@RequestMapping(value = "/post2Test/{test}", method = RequestMethod.POST)
	public ResponseEntity postTest(@ModelAttribute("test") String test, @ModelAttribute("reply") Reply reply) {
		return new ResponseEntity(reply, HttpStatus.OK);
	}

	@RequestMapping(value = "/getTest/{test}", method = RequestMethod.GET)
	public ResponseEntity getTest(@ModelAttribute("test") String test, @ModelAttribute("name") String name, @ModelAttribute("id") String id) {
		return new ResponseEntity(name, HttpStatus.OK);
	}

	@RequestMapping(value = "/postTest/{test}", method = RequestMethod.POST)
	public ResponseEntity postTest(@ModelAttribute("test") String test, @ModelAttribute("name") String name, @ModelAttribute("id") String id) {
		return new ResponseEntity(name, HttpStatus.OK);
	}

	@RequestMapping(value = "/putTest/{test}", method = RequestMethod.PUT)
	public ResponseEntity putTest(@ModelAttribute("test") String test, @ModelAttribute("name") String name, @ModelAttribute("id") String id) {
		return new ResponseEntity(name, HttpStatus.OK);
	}

	@RequestMapping(value = "/deleteTest/{test}", method = RequestMethod.DELETE)
	public ResponseEntity deleteTest(@ModelAttribute("test") String test, @RequestBody MultiValueMap<String,String> body) {
		String name = body.getFirst("name");
		return new ResponseEntity(name, HttpStatus.OK);
	}
}