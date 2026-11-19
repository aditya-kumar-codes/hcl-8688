package com.example.RestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.RestAPI.model.JobPost;
import com.example.RestAPI.service.JobService;

import jakarta.annotation.PostConstruct;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class JobRestController {

    @Autowired
    private JobService service;

    @PostConstruct
    public void loadJobs() {
        service.load();
    }

    @GetMapping("jobPost")
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();

    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable int postId) {
        return service.getJob(postId);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost) {
        service.addJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @PutMapping("jobPost/{postId}")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId)
    {
        service.deleteJob(postId);
        return "Deleted";
    }


}