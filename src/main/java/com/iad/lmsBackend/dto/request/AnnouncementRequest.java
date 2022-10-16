package com.iad.lmsBackend.dto.request;

import com.iad.lmsBackend.entity.Announcement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AnnouncementRequest {
    private String courseId;
    private int announcementId;
    private String description;
    List<Announcement> announcementList;
    private String announcementName;

}
