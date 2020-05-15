package com.obss.mentorship.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.obss.mentorship.model.MentoringRecord;
import com.obss.mentorship.model.ResponseMentoringRecord;
import com.obss.mentorship.repository.MentoringRecordRepository;
import com.obss.mentorship.repository.UserRepository;
import com.obss.mentorship.service.UserService;

@RestController
@RequestMapping("/api")
public class MentoringRecordController {

	private static final String PATH = "/mentoringRecords";

	@Autowired
	UserService userService;
	
	@GetMapping("/mentoringRecords/filter/{menteeId}")
    public List<ResponseMentoringRecord> getMentoringRecords(@PathVariable(value = "menteeId") Long menteeId) {
        return userService.getMentoringRecords(menteeId);
    }
}