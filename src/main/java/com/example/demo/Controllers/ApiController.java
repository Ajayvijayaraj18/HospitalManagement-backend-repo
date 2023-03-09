package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Hospital;
import com.example.demo.Service.ApiService;
@RestController
@CrossOrigin
public class ApiController {
	@Autowired
	 ApiService stuService;
	 @PostMapping("/add")
	 public Hospital addinfo(@RequestBody Hospital st) {
		 return stuService.saveDetails(st);
	 }
	 @GetMapping("/read")
	 public List<Hospital> fetchDetails(){
		 return stuService.getDetails();
	 }
	 @PutMapping("/update")
	 public Hospital updateInfo (@RequestBody Hospital st1 ) {
		 return stuService.updateDetails(st1);
	 }
	 @DeleteMapping("/delete/{id}")
	 public String deleteInfo(@PathVariable("id") int id) {
		 stuService.deleteDetails(id);
		 return "Details deleted success";
	 }
	 @GetMapping("/product/{field}")
		public List<Hospital> getWithSort(@PathVariable String field) {
			return stuService.getSorted(field);
		}

		// pagination
		@GetMapping("/product/{offset}/{pageSize}")
		
		public List<Hospital> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
			return stuService.getWithPagination(offset, pageSize);
		}
}
