package com.example.demo.projectmanager.repository;

import com.example.demo.projectmanager.model.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {
}