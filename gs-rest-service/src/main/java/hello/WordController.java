package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import hello.WordService;





@RestController
public class WordController {
    // TODO Implement the /words/{word} endpoint
	
	@Autowired
	WordService wordservice;
	
	
	@GetMapping(value="/words/{word}")
	 public ResponseEntity<Object> saveData(@PathVariable("word") String word) {	 
	 
	  return wordservice.palindromeObj(word);
	
	 }
	
}
