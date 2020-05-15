package com.obss.mentorship.model;

import java.util.Date;

import javax.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "MENTORING_RECORDS")
@EntityListeners(AuditingEntityListener.class)
public class MentoringRecord {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "MENTOR_ID")
	private Long mentorId;
	
	@Column(name = "MENTEE_ID")
	private Long menteeId;
	
	@Column(name = "START_DATE", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
	
	@Column(name = "END_DATE", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    @Column(name="SURVEY_RATING", nullable = true)
    private Integer surveyRating;

    @Column(name="SURVEY_COMMENT", nullable = true)
    private String surveyComment;
    
    @Column(name="STATUS")
    private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMentorId() {
		return mentorId;
	}

	public void setMentorId(Long mentorId) {
		this.mentorId = mentorId;
	}

	public Long getMenteeId() {
		return menteeId;
	}

	public void setMenteeId(Long menteeId) {
		this.menteeId = menteeId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getSurveyRating() {
		return surveyRating;
	}

	public void setSurveyRating(Integer surveyRating) {
		this.surveyRating = surveyRating;
	}

	public String getSurveyComment() {
		return surveyComment;
	}

	public void setSurveyComment(String surveyComment) {
		this.surveyComment = surveyComment;
	}

    
}
