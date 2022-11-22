package demo.firstsb.controller;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import demo.firstsb.entity.Employee;

@RestController
public class EmployeeController {
  private ArrayList<Employee> employeeList = new ArrayList<>();
  public EmployeeController(){
    employeeList.add(new Employee("Arpit", "IT"));
    employeeList.add(new Employee("Sanjeev", "IT"));
    employeeList.add(new Employee("Ben", "IT"));
  }
 @GetMapping("/employee")
    public ArrayList<Employee> get() {
        return employeeList;
    }
 @GetMapping("/employee/{id}")
 public Employee retrieveOneEmployee(@PathVariable("id") int id){
	 if(id<employeeList.size() && id>=0)
		 return employeeList.get(id);
	 else
		 return employeeList.get(0);
 }
 @PostMapping(value = "/employee", produces=MediaType.TEXT_HTML_VALUE)
 public String addOneEmployee(@RequestBody Employee employee) {
   employeeList.add(employee);
   return "employee add to List";
 }

}

