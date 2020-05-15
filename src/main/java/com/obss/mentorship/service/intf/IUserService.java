package com.obss.mentorship.service.intf;

import java.util.List;

import com.obss.mentorship.model.ResponseMentoringRecord;

public interface IUserService {

	List<ResponseMentoringRecord> getMentoringRecords(Long menteeId);

}