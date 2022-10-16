package com.iad.lmsBackend.repository;

import com.iad.lmsBackend.dto.request.AnnouncementRequest;
import com.iad.lmsBackend.entity.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnnouncementRepository extends JpaRepository<Announcement, String> {
    List<Announcement> findByCourseId(String courseId);
}
