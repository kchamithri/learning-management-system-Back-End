package com.iad.lmsBackend.repository;

import com.iad.lmsBackend.entity.StudentsMarks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMarksRepository extends JpaRepository<StudentsMarks, String> {
}
