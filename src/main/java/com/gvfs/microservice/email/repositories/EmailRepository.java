package com.gvfs.microservice.email.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gvfs.microservice.email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, UUID>{

}
