package edu.mit.dao;

import java.util.Date;
import org.apache.ibatis.annotations.Select;

import edu.mit.dao.TwoVO;

public interface QuizMapper {
	//@Select("select sysdate from dual")
	Date now();
	void input(TwoVO vo);
}