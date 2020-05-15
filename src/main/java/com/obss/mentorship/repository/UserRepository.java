package com.obss.mentorship.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.obss.mentorship.model.MentoringRecord;
import com.obss.mentorship.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query(value = "SELECT mRecord FROM User user, MentoringRecord mRecord where user.id = :menteeId and user.id = mRecord.menteeId and status = 'ACTIVE'")
	List<MentoringRecord> getMentoringRecords(@Param("menteeId") String menteeId);
}
