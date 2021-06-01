package com.cg.spc.repository;

import java.util.List;

import com.cg.spc.entities.Concern;
import com.cg.spc.entities.Parent;

public interface IConcernRepository {
	public Concern addConcern(Concern concern);
	public Concern updateConcern(Concern concern);
	public List<Concern> retrieveAllConcerns();
	public List<Concern> retrieveAllConcernsByParent(Parent parent);
	public List<Concern> retrieveAllUnResolvedConcerns();
	public List<Concern> retrieveAllUnResolvedConcernsByParent(Parent parent);
	
	
	
}
