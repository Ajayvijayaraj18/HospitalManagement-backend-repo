package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Model.Hospital;
import com.example.demo.Repositories.HospitalRepo;
@Service
public class ApiService {
	@Autowired
	HospitalRepo stRepo;
	
	public Hospital saveDetails(Hospital e)
	{
		return stRepo.save(e);
	}
	public List<Hospital> getDetails(){
		return stRepo.findAll();
	}
	public Hospital updateDetails (Hospital e1) {
		return stRepo.saveAndFlush(e1);
	}
	public void deleteDetails(int id) {
		stRepo.deleteById(id);
	}
	public List<Hospital> getSorted(String field) {
		return stRepo.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	
	public List<Hospital> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		Page<Hospital> page =stRepo.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
	}
}
