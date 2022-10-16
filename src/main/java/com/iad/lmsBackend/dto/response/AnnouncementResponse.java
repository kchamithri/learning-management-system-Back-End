package com.iad.lmsBackend.dto.response;

import com.iad.lmsBackend.entity.Announcement;
import com.iad.lmsBackend.entity.Course;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AnnouncementResponse {
    private String status;
    private String message;
    List<Announcement> announcementList;
}
