package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Service
public class SearchFacade {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public List<Company> processCompanySearch(final String companyNameFragment)
            throws SearchException {
        List<Company> companies = new ArrayList<>();
        boolean wasError = false;
        LOGGER.info("Looking for: " + companyNameFragment + " in companies records");
        if (companyNameFragment.equals(null)) {
            LOGGER.error(SearchException.ERR_EMPTY_RECORD);
            wasError = true;
            throw new SearchException(SearchException.ERR_EMPTY_RECORD);
        }
        try{
            companies = companyDao.retrieveSimilarNames(companyNameFragment);
        } finally {
            if(wasError){
                LOGGER.info("Cancelling search.");
            } else {
                LOGGER.info("Search finished");
            }
            return companies;
        }
    }

    public List<Employee> processEmployeeSearch(final String employeeNameFragment)
            throws SearchException {
        List<Employee> employees = new ArrayList<>();
        boolean wasError = false;
        LOGGER.info("Looking for: " + employeeNameFragment + " in employees records");
        if (employeeNameFragment.equals(null)) {
            LOGGER.error(SearchException.ERR_EMPTY_RECORD);
            wasError = true;
            throw new SearchException(SearchException.ERR_EMPTY_RECORD);
        }
        try{
            employees = employeeDao.retrieveSimilarNames(employeeNameFragment);
        } finally {
            if(wasError){
                LOGGER.info("Cancelling search.");
            } else {
                LOGGER.info("Search finished");
            }
            return employees;
        }
    }
}
