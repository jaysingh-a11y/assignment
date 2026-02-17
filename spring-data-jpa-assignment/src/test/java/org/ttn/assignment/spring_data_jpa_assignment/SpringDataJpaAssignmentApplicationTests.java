package org.ttn.assignment.spring_data_jpa_assignment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.ttn.assignment.spring_data_jpa_assignment.entity.Employee;
import org.ttn.assignment.spring_data_jpa_assignment.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringDataJpaAssignmentApplicationTests {
	@Test
	void testContext(){

	}


	@Autowired
	EmployeeRepository employeeRepository;
	@Test
	public void createTest(){

		Employee e0 = new Employee();
		e0.setId(0);
		e0.setName("jay");
		e0.setAge(28);
		e0.setLocation("Sector 144");


		List<Employee> empList= new ArrayList<>();
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("jay");
		e1.setAge(28);
		e1.setLocation("Sector 144");
		empList.add(e1);

		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("amit");
		e2.setAge(30);
		e2.setLocation("Sector 62");
		empList.add(e2);


		Employee e3 = new Employee();
		e3.setId(3);
		e3.setName("anil");
		e3.setAge(29);
		e3.setLocation("Sector 18");
		empList.add(e3);


		Employee e4 = new Employee();
		e4.setId(4);
		e4.setName("rohit");
		e4.setAge(32);
		e4.setLocation("Sector 15");
		empList.add(e4);


		Employee e5 = new Employee();
		e5.setId(5);
		e5.setName("sumit");
		e5.setAge(27);
		e5.setLocation("Sector 137");
		empList.add(e5);

		Employee e6 = new Employee();
		e6.setId(6);
		e6.setName("arjun");
		e6.setAge(28);
		e6.setLocation("Sector 50");
		empList.add(e6);

		Employee e7 = new Employee();
		e7.setId(7);
		e7.setName("akash");
		e7.setAge(31);
		e7.setLocation("Sector 45");
		empList.add(e7);

		Employee e8 = new Employee();
		e8.setId(8);
		e8.setName("vikas");
		e8.setAge(34);
		e8.setLocation("Sector 22");
		empList.add(e8);

		Employee e9 = new Employee();
		e9.setId(9);
		e9.setName("deepak");
		e9.setAge(26);
		e9.setLocation("Sector 10");
		empList.add(e9);

		Employee e10 = new Employee();
		e10.setId(10);
		e10.setName("ankit");
		e10.setAge(29);
		e10.setLocation("Sector 121");
		empList.add(e10);

		Employee e11 = new Employee();
		e11.setId(11);
		e11.setName("ajay");
		e11.setAge(28);
		e11.setLocation("Sector 70");
		empList.add(e11);

		Employee e12 = new Employee();
		e12.setId(12);
		e12.setName("neeraj");
		e12.setAge(33);
		e12.setLocation("Sector 52");
		empList.add(e12);

		Employee e13 = new Employee();
		e13.setId(13);
		e13.setName("abhishek");
		e13.setAge(30);
		e13.setLocation("Sector 63");
		empList.add(e13);

		Employee e14 = new Employee();
		e14.setId(14);
		e14.setName("sachin");
		e14.setAge(35);
		e14.setLocation("Sector 41");
		empList.add(e14);

		Employee e15 = new Employee();
		e15.setId(15);
		e15.setName("aman");
		e15.setAge(28);
		e15.setLocation("Sector 93");
		empList.add(e15);

		Employee e16 = new Employee();
		e16.setId(16);
		e16.setName("alok");
		e16.setAge(27);
		e16.setLocation("Sector 76");
		empList.add(e16);

		Employee e17 = new Employee();
		e17.setId(17);
		e17.setName("atul");
		e17.setAge(31);
		e17.setLocation("Sector 11");
		empList.add(e17);

		Employee e18 = new Employee();
		e18.setId(18);
		e18.setName("nitesh");
		e18.setAge(29);
		e18.setLocation("Sector 99");
		empList.add(e18);

		Employee e19 = new Employee();
		e19.setId(19);
		e19.setName("alok");
		e19.setAge(28);
		e19.setLocation("Sector 150");
		empList.add(e19);

		Employee e20 = new Employee();
		e20.setId(20);
		e20.setName("ashish");
		e20.setAge(32);
		e20.setLocation("Sector 34");
		empList.add(e20);

		employeeRepository.save(e0);
		employeeRepository.saveAll(empList);
	}

	@Test
	public void updateTest(){
		Employee oldEmp = employeeRepository.findById(5).get();
		oldEmp.setName("alok");
		oldEmp.setLocation("Sector 78");
		employeeRepository.save(oldEmp);

	}

	@Test
	public void deleteTest(){
		if(employeeRepository.existsById(15)) {
			employeeRepository.deleteById(15);
		}
		assertFalse(employeeRepository.existsById(15));

	}

	@Test
	public void readTest(){
		Employee Emp = employeeRepository.findById(10).get();
		System.out.println(Emp);
		assertEquals("ankit",Emp.getName());
	}

	@Test
	public void countTest(){
		long count = employeeRepository.count();
		System.out.println(count);
		assertEquals(20,count);
	}
//Doubt
	@Test
	public void paginationAndSortingTest(){
		long count = employeeRepository.count();
		assertEquals(20,count);
	}


	@Test
	public void findByNameTest(){
		List<Employee> empList=employeeRepository.findByName("alok");
		System.out.println(empList);
		assertEquals(3,empList.size());

	}

	@Test
	public void findByNameStartingWithTest(){
		List<Employee> empList=employeeRepository.findByNameStartingWith("A");
		System.out.println(empList.size());
		assertEquals(12,empList.size());

	}

	@Test
	public void findByAgeTest(){
		List<Employee> empList=employeeRepository.findByAgeBetween(28,32);
		System.out.println(empList.size());
		assertNotEquals(12,empList.size());

	}


}
