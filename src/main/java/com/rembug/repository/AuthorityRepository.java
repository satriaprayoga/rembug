package com.rembug.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rembug.domain.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Long>{

}
