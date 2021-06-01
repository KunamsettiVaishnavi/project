package com.cg.spc.repository;

import java.time.LocalDate;
import java.util.List;

import com.cg.spc.entities.DiaryNotes;
import com.cg.spc.entities.Subject;

public interface IDiaryNotesRepository {
	public DiaryNotes addDiaryNotes(DiaryNotes diaryNotes);
	public DiaryNotes updateDiaryNotes(DiaryNotes diaryNotes);
	public DiaryNotes deleteDiaryNotes(DiaryNotes diaryNotes);
	public List<DiaryNotes> retrieveAllDiaryNotes(LocalDate date);
	public List<DiaryNotes> retrieveAllDiaryNotes(Subject subject);
	
	
}
