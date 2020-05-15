package com.obss.mentorship.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseMentoringRecord {
	
	private Long mentorId;
	
    private String mentorName;
	
    private String mentorSurname;
	
    private String mentorEmail;

    private Long menteeId;

    private String menteeName;

    private String menteeSurname;

    private String menteeEmail;

    private Long recordId;

    private Date startDate;

    private Date endDate;

    private Integer surveyRating;

    private String surveyComment;

    private String status;
}
