package com.cg.spc.repository;

import java.time.LocalDate;
import java.util.List;

import com.cg.spc.entities.Attendance;
import com.cg.spc.entities.Student;

public interface IAttendanceRepository {
	public Attendance addAttendance(Attendance attendance);
	public Attendance updateAttendance(Attendance attendance);
	public List<Attendance> listAttendanceByMonth(LocalDate month);
	public List<Attendance> listAttendanceByStudent(Student student);
	
	
}
