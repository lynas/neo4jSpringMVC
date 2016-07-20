package com.lynas.controller;

import com.lynas.OrgService;
import com.lynas.model.Employee;
import com.lynas.model.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LynAs on 7/19/2016
 */
@Controller
public class HomeController {

    @Autowired
    OrgService orgService;

    @RequestMapping(value = "/")
    public String home(){

        return "home";
    }


    @RequestMapping(value = "/save")
    public String save(){
        Employee employee = new Employee();
        employee.setName("em1");

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(employee);
        Organization organization = new Organization();
        organization.setName("org1");
        organization.setEmployees(employees);
        orgService.saveOrg(organization);

        return "home";
    }


    @RequestMapping(value = "/read")
    public String read(){

        Organization organization = orgService.readByID(0L);
        System.out.println(organization.getName());

        List<Organization> orgList = orgService.readByName("org1");
        System.out.println(orgList.size());
        return "home";
    }

    @RequestMapping(value = "/update")
    public String update(){
        Organization organization = orgService.readByID(0L);
        organization.setName("newName");

        orgService.update(organization);

        return "home";
    }

    @RequestMapping(value = "/delete")
    public String delete(){
        Organization organization = orgService.readByID(0L);
        organization.setName("newName");

        orgService.delete(organization);

        return "home";
    }

}















