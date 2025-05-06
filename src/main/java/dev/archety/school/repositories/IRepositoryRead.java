package dev.archety.school.repositories;

import java.util.List;

public interface IRepositoryRead <T> {
	
//	Lettura - corrispondenti a query Language
	T getById(int id);
	List<T> getAll();

}
