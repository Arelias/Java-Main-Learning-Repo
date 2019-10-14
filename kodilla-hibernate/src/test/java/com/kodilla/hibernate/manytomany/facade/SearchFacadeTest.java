package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTest {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    SearchFacade searchFacade;

    @Test
    public void processCompanySearch() throws SearchException {
        //Given
        Company company1 = new Company("BB");
        int company1Id = company1.getId();
        Company company2 = new Company("New DEF Ltd.");
        int company2Id = company2.getId();

        //When
        companyDao.save(company1);
        companyDao.save(company2);
        List<Company> companies = searchFacade.processCompanySearch("t");

        //Then
        assertEquals(1, companies.size());
        try {
            companyDao.deleteById(company1Id);
            companyDao.deleteById(company2Id);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void processEmployeeSearch() throws SearchException {

        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Company softwareMachine = new Company("Software Machine");

        softwareMachine.getEmployees().add(johnSmith);
        softwareMachine.getEmployees().add(stephanieClarckson);
        softwareMachine.getEmployees().add(lindaKovalsky);
        johnSmith.getCompanies().add(softwareMachine);
        stephanieClarckson.getCompanies().add(softwareMachine);
        lindaKovalsky.getCompanies().add(softwareMachine);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        List<Employee> employees = searchFacade.processEmployeeSearch("n");

        //Then
        assertEquals(3, employees.size());
        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
        } catch (Exception e) {
            //do nothing
        }
    }
}