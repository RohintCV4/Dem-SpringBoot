package com.example.educ.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.educ.entity.ExternalApi;

@Repository
public interface ExternalApiRepository extends JpaRepository<ExternalApi, Long> {


}
