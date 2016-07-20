package com.lynas.repo;

import com.lynas.model.Organization;
import org.springframework.data.neo4j.repository.GraphRepository;

import java.util.List;

/**
 * Created by LynAs on 7/20/2016
 */
public interface OrgRepo extends GraphRepository<Organization> {

    List<Organization> findByName(String name);

}
