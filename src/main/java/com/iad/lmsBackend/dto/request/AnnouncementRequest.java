package com.iad.lmsBackend.dto.request;

import com.iad.lmsBackend.entity.Announcement;

import java.util.List;

public class AnnouncementRequest {
    private String courseId;
    private String description;
    List<Announcement> announcementList;
}
