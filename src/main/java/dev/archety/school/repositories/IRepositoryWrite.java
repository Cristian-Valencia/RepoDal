package dev.archety.school.repositories;

public interface IRepositoryWrite <T> {

//	Scrittura - corrispondenti a Data Manipulation Language
	boolean Insert (T obj);
	boolean Update (T obj);
	boolean Delete (int id);
	
	
}
