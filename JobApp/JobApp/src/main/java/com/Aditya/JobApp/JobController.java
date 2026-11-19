package com.Aditya.JobApp;


import com.Aditya.JobApp.model.JobPost;
import com.Aditya.JobApp.services.JobServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobServices service;

    @GetMapping({"/", "home"})
    public String home() {
        return "home";
    }
    @GetMapping("addjob")
    public String addJob() {
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        service.addJob(jobPost);
        return "success";
    }
    @GetMapping("viewalljobs")
    public String viewJobs(Model m) {
        List<JobPost> jobPosts = service.getAllJobPosts();
        m.addAttribute("jobPosts", jobPosts);
        return "viewalljobs";
    }

}