package com.Aditya.JobApp.services;

import com.Aditya.JobApp.model.JobPost;
import com.Aditya.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServices {

    @Autowired
    private JobRepo repo;



//    public void jobPost(jobPost jobPost) {
//        service.jobPost(jobPost);
//    }

    public List<JobPost> getAllJobPosts() {
        return repo.getAllJobPosts();
    }

    public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);
    }
}