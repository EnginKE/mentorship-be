package com.obss.mentorship.model;


import javax.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "MENTORS")
@EntityListeners(AuditingEntityListener.class)
public class Mentor {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "USER_ID")
    private Long userId;

	@Column(name = "MENTOR_GROUP_ID")
    private Long mentorGroupId;

	@Column(name = "IS_ACTIVE")
    private Integer isActive;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getMentorGroupId() {
		return mentorGroupId;
	}

	public void setMentorGroupId(Long mentorGroupId) {
		this.mentorGroupId = mentorGroupId;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

}
