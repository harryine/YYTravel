package com.cx.dao;

import java.util.List;

import com.cx.entity.star;

public interface IStarDao {

	void save (star star);
	
	void delById (Integer id);
	
	List<star> findAll();
}
