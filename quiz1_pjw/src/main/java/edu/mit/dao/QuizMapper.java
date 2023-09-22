package edu.mit.dao;

import java.util.Date;
import org.apache.ibatis.annotations.Select;

public interface QuizMapper {
	//@Select("select sysdate from dual")
	Date now();
}