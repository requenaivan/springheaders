package co.com.spring.web.app.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class IndexController {

	/**
	 *  home
	 * @return ResponseEntity
	 */
	@GetMapping(value="/")
	public ResponseEntity<Object> home() {
		return getResponseOK();
	}

	/**
	 *  isOnline
	 * @return ResponseEntity
	 */
	@PostMapping(value="/isOnline")
	public ResponseEntity<Object> isOnline() {
		return getResponseOK();
	}
	
	/**
	 * Method Generic for response Ok
	 * @return
	 */
	private ResponseEntity<Object> getResponseOK() {
        return new ResponseEntity<Object>("Response Ok", HttpStatus.OK);
	}
}
