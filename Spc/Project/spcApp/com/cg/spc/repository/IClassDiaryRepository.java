package com.cg.spc.repository;

import java.time.LocalDate;

import com.cg.spc.entities.ClassDiary;

public interface IClassDiaryRepository {
	public ClassDiary addClassDiary(ClassDiary classDiary);
	public ClassDiary retrieveClassDiary(LocalDate date);
	
}
