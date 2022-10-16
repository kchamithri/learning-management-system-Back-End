package com.iad.lmsBackend.repository;

import com.iad.lmsBackend.dto.request.CourseRequest;
import com.iad.lmsBackend.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, String> {
//    @Query("select c.courseId, c.courseName from Course c join user_course t where c.courseId=t.courseId AND t.userId=1")
    List<Course> findCoursesByUserList(CourseRequest request);
}
