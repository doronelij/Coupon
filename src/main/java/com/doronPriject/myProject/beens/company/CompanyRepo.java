package com.doronPriject.myProject.beens.company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepo extends JpaRepository <Company,Integer> {
    boolean existsByName(String name);

    boolean existsByEmail(String email);

    boolean existsByNameAndIdNot(String name, int Id);

    boolean existsByEmailAndIdNot(String email, int Id);

    Company findByEmail(String email);









}
