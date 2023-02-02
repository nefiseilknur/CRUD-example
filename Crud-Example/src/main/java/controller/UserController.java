package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.User;

import service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping
	public ResponseEntity<User> save(@RequestBody User user) {
		User saved = userService.save(user);
		return new ResponseEntity<User>(saved, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<User>> getAll() {
		List<User> all = userService.findAll();
		return new ResponseEntity<List<User>>(all, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable(name = "id") Long id) {
		User user = userService.findById(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<User> updateById(@RequestBody Long id, User user) {
		User updated = userService.update(id, user);
		return new ResponseEntity<User>(updated, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable(name = "id") Long id) {
		userService.delete(id);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
}

