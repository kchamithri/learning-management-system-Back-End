package com.iad.lmsBackend.service;

import com.iad.lmsBackend.dto.request.AnnouncementRequest;
import com.iad.lmsBackend.dto.response.AnnouncementResponse;
import com.iad.lmsBackend.entity.Announcement;
import com.iad.lmsBackend.repository.AnnouncementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnouncementService {

    @Autowired
    AnnouncementRepository announcementRepository;

    public AnnouncementResponse viewAnnouncements(AnnouncementRequest request){
        AnnouncementResponse response = new AnnouncementResponse();
        List<Announcement> announcementList = announcementRepository.viewAll(request);

        response.setMessage("successfully retrieved");
        response.setStatus("00");
        return response;
    }
}
