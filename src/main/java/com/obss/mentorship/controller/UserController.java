package com.obss.mentorship.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.obss.mentorship.exception.ResourceNotFoundException;
import com.obss.mentorship.model.MentoringRecord;
import com.obss.mentorship.model.User;
import com.obss.mentorship.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	private static final String PATH = "/users";

	@Autowired
	UserRepository userRepository;

	@GetMapping(value = PATH)
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@PostMapping(value = PATH)
	public User createUser(@Valid @RequestBody User note) {
		return userRepository.save(note);
	}

	@GetMapping(value = PATH + "/{id}")
	public User getUserById(@PathVariable(value = "id") Long userId) {
		return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
	}

	@PutMapping(value = PATH + "/{id}")
	public User updateUser(@PathVariable(value = "id") Long userId, @Valid @RequestBody User userDetails) {

		User user = userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

		user.setName(userDetails.getName());
		user.setSurname(userDetails.getSurname());
		user.setEmail(userDetails.getEmail());

		User updatedUser = userRepository.save(user);
		return updatedUser;
	}

	@DeleteMapping(value = PATH + "/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Long userId) {
		User user = userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));

		userRepository.delete(user);

		return ResponseEntity.ok().build();

	}
}