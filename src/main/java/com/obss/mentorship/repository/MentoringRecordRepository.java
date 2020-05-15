package com.obss.mentorship.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.obss.mentorship.model.MentoringRecord;

@Repository
public interface MentoringRecordRepository extends JpaRepository<MentoringRecord, Long> {
	
	
}