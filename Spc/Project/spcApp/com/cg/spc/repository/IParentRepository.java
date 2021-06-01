package com.cg.spc.repository;

import java.util.List;

import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Parent;
import com.cg.spc.entities.Student;

public interface IParentRepository {
	public Parent addParent(Parent parent);
	public Parent updateParent(Parent parent);
	public List<Parent> retrieveParentListByClass(ClassId classId);
	public Parent retrieveParentByStudent(Student student);
	public Parent retrieveParentById(int id);
	
}
