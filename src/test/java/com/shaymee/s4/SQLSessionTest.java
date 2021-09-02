package com.shaymee.s4;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SQLSessionTest extends MyJunitTest{
	
	@Autowired
	private SqlSession sqlSessoin;
	
	@Test
	public void test() {
		assertNotNull(sqlSessoin);
	}

}
