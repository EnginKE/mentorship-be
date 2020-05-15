package com.obss.mentorship.service;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obss.mentorship.model.ResponseMentoringRecord;
import com.obss.mentorship.model.User;
import com.obss.mentorship.repository.MentoringRecordRepository;
import com.obss.mentorship.repository.UserRepository;
import com.obss.mentorship.service.intf.IUserService;


@Service
public class UserService implements IUserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	MentoringRecordRepository mentoringRecordRepository;

    @Autowired
    EntityManagerFactory emf;

    @Override
    public List<ResponseMentoringRecord> getMentoringRecords(Long menteeId)
    {
        EntityManager em = emf.createEntityManager();
        //em.getTransaction().begin( );

        Query query = em.createQuery("SELECT new com.obss.mentorship.model.ResponseMentoringRecord(mentor.id, mentor.name, mentor.surname, mentor.email, "
    			+ "mentee.id, mentee.name, mentee.surname, mentee.email, "
    			+ "mRecord.id, mRecord.startDate, mRecord.endDate, mRecord.surveyRating, mRecord.surveyComment, mRecord.status) "
    			+ "FROM User mentee, MentoringRecord mRecord, User mentor "
    			+ "WHERE mRecord.menteeId = :menteeId "
    			+ "AND mentee.id = mRecord.menteeId "
    			+ "AND mentor.id = mRecord.mentorId");
        @SuppressWarnings("unchecked")
        List<ResponseMentoringRecord> list =(List<ResponseMentoringRecord>)query.setParameter("menteeId", menteeId).getResultList();
        System.out.println("Student Name :");
        em.close();

        return list;

    }

    
    
//    @Query(value = "SELECT new com.example.easynotes.model.ResponseMentoringRecord( mentor.name, mentor.surname, mentor.email) "
//			//+ "mentee.id, mentee.name, mentee.surname, mentee.email,"
//			//+ "mRecord.id, mRecord.startDate, mRecord.endDate, mRecord.surveyRating, mRecord.surveyComment, mRecord.status) "
//			+ "FROM User mentee, MentoringRecord mRecord, User mentor "
//			+ "WHERE mRecord.menteeId = :menteeId "
//			+ "AND mentee.id = mRecord.menteeId "
//			+ "AND mentor.id = mRecord.mentorId")
//	List<ResponseMentoringRecord> getMentoringRecords(@Param("menteeId") Long menteeId);
    
    
    
    public List<User> studentAllData()
    {
        return userRepository.findAll();
    }

}