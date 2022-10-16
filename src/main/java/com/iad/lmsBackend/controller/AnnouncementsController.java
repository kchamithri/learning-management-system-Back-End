package com.iad.lmsBackend.controller;

import com.iad.lmsBackend.dto.request.AnnouncementRequest;
import com.iad.lmsBackend.dto.request.CourseRequest;
import com.iad.lmsBackend.dto.response.AnnouncementResponse;
import com.iad.lmsBackend.dto.response.CourseResponse;
import com.iad.lmsBackend.repository.AnnouncementRepository;
import com.iad.lmsBackend.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*" ,  allowedHeaders = "*")
@RequestMapping("auth/announcement")
public class AnnouncementsController {

    @Autowired
    AnnouncementRepository announcementRepository;

    @Autowired
    AnnouncementService announcementService;

    @PostMapping("/view")
    public AnnouncementResponse viewAnnouncement(@RequestBody AnnouncementRequest request){
        return announcementService.viewAnnouncements(request);
    }

    @PostMapping("/save")
    public AnnouncementResponse saveAnnouncement(@RequestBody AnnouncementRequest request){
        return announcementService.saveAnnouncements(request);
    }

    @PostMapping("/update")
    public AnnouncementResponse updateAnnouncement(@RequestBody AnnouncementRequest request){
        return announcementService.updateAnnouncements(request);
    }

    @PostMapping("/delete")
    public AnnouncementResponse deleteAnnouncement(@RequestBody AnnouncementRequest request){
        return announcementService.deleteAnnouncements(request);
    }
}
