package com.cg.spc.repository;

import java.util.List;

import com.cg.spc.entities.Fee;
import com.cg.spc.entities.FeeInstallment;
import com.cg.spc.entities.Student;

public interface IFeeInstallmentRepository {
	public FeeInstallment makePayment(FeeInstallment feeInstallment);
	public List<FeeInstallment> pendingInstallments(Student student);
	public FeeInstallment retrieveFeeInstallmentById(int id);
	public List<FeeInstallment> retrieveAllFeeInstallmentsByFee(Fee fee);
	
}
