package com.java.dao;

import com.java.model.Employ;

import java.util.ArrayList;
import java.util.List;

public class EmployDaoImpl implements EmployDao {
    static List<Employ> employList;

    static {
        employList = new ArrayList<Employ>();
    }
    @Override
    public List<Employ> showEmployDao() {
        return  employList;
    }

    @Override
    public String addEmployDao(Employ employ) {
        employList.add(employ);
        return "employ details inserted";
    }

    @Override
    public Employ searchEmployDao(int empno) {
        Employ employFound = employList.stream().filter(employ -> employ.getEmpno() == empno).findFirst().orElse(null);
        return employFound;

    }

    @Override
    public String deleteEmployDao(int empno) {
        Employ employFound = searchEmployDao(empno);
        if (employFound != null) {
            employList.remove(employFound);
            return "Employ Record Deleted...";
        }
        return "Employ Record Not Found...";

    }

    @Override
    public String updateEmployDao(Employ employUpdate) {
        Employ employFound = searchEmployDao(employUpdate.getEmpno());
        if (employFound != null) {
            employFound.setEname(employUpdate.getEname());
            employFound.setGender(employUpdate.getGender());
            employFound.setDept(employUpdate.getDept());
            employFound.setDesignation(employUpdate.getDesignation());
            employFound.setSalary(employUpdate.getSalary());
            return "Employ Record Updated...";
        }
        return "Employ Record Not Found...";
    }
}
