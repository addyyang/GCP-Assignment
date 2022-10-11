package com.example.GCP.Controllers;
import java.time.LocalTime;
import org.springframework.web.bind.annotation.*;


@RestController
public class EndpointController {

    @GetMapping("/username")
    public String homePage() {
        return "ayang336";
    }

    @GetMapping("/time")
    public String getTime() {
        LocalTime time = LocalTime.now();
        return time.toString().substring(0, 8);
    }
}