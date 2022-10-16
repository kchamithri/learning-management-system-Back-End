package com.iad.lmsBackend.service;

import com.iad.lmsBackend.dto.request.AnnouncementRequest;
import com.iad.lmsBackend.dto.response.AnnouncementResponse;
import com.iad.lmsBackend.entity.Announcement;
import com.iad.lmsBackend.repository.AnnouncementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnnouncementService {

    @Autowired
    AnnouncementRepository announcementRepository;

    public AnnouncementResponse viewAnnouncements(AnnouncementRequest request){
        AnnouncementResponse response = new AnnouncementResponse();
        try{
            List<Announcement> announcementList = announcementRepository.findByCourseId(request.getCourseId());
            response.setMessage("successfully retrieved");
            response.setStatus("00");
            response.setAnnouncementList(announcementList);
        }catch (Exception e){
            System.out.println(e);
        }

        return response;
    }

    public AnnouncementResponse saveAnnouncements (AnnouncementRequest request){
        AnnouncementResponse announcementresponce = new AnnouncementResponse();
        try {
            Announcement announcement = new Announcement(request.getAnnouncementId(), request.getAnnouncementName(), request.getDescription(), request.getCourseId());
            announcementRepository.save(announcement);
            announcementresponce.setStatus("00");
            announcementresponce.setMessage("Successfully Saved");
        }catch (Exception e){
            System.out.println(e);
        }

        return announcementresponce;
    }

    public AnnouncementResponse updateAnnouncements(AnnouncementRequest request){
        AnnouncementResponse response = new AnnouncementResponse();
        try{
            Announcement announcement = new Announcement(request.getAnnouncementId(), request.getAnnouncementName(),request.getDescription(), request.getCourseId());
            announcementRepository.save(announcement);
            response.setStatus("00");
            response.setMessage("successfully updated");
        }catch(Exception e){
            System.out.println("Exception in announcement update");
        }
        return response;
    }

    public AnnouncementResponse deleteAnnouncements(AnnouncementRequest request){
        AnnouncementResponse response = new AnnouncementResponse();
        try{
            announcementRepository.deleteById(String.valueOf(request.getAnnouncementId()));
            response.setStatus("00");
            response.setMessage("successfully deleted");
        }catch(Exception e){
            System.out.println(e);
        }
        return response;
    }
}
