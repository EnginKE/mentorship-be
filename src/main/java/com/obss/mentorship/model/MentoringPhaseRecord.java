package com.obss.mentorship.model;

import java.util.Date;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "MENTORING_PHASE_RECORDS")
@EntityListeners(AuditingEntityListener.class)
public class MentoringPhaseRecord {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "GROUP_ID")
	private Long groupId;
	
	@Column(name = "START_DATE", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
	
	@Column(name = "END_DATE", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
	
	@Column(name="PHASE")
    private String phase;

    @Column(name="SURVEY_RATING")
    private Integer surveyRating;

    @Column(name="SURVEY_COMMENT")
    private String surveyComment;
    
    @Column(name="MENTEE_INTERM_COMMENT")
    private String menteeIntermComment;
    
    @Column(name="STATUS")
    private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
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

	public String getPhase() {
		return phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
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

	public String getMenteeIntermComment() {
		return menteeIntermComment;
	}

	public void setMenteeIntermComment(String menteeIntermComment) {
		this.menteeIntermComment = menteeIntermComment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
