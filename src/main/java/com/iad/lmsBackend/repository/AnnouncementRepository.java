package com.iad.lmsBackend.repository;

import com.iad.lmsBackend.entity.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Integer> {
}
