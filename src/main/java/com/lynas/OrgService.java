package com.lynas;

import com.lynas.model.Organization;
import com.lynas.repo.OrgRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by LynAs on 7/20/2016
 */

@Service
public class OrgService {

    @Autowired
    OrgRepo orgRepo;

    @Transactional
    public void saveOrg(Organization organization) {
        orgRepo.save(organization);
    }

    @Transactional
    public Organization readByID(Long id) {
        return orgRepo.findOne(id);
    }

    @Transactional
    public List<Organization> readByName(String name) {
        return orgRepo.findByName(name);
    }

    @Transactional
    public void update(Organization organization) {

        orgRepo.save(organization);
    }

    @Transactional
    public void delete(Organization organization) {
        orgRepo.delete(organization);
    }
}














