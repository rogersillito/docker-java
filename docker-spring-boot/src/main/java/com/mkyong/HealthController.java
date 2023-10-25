package com.mkyong;

import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HealthController {

    @GetMapping("/health")
    ResponseEntity<String> get() {
        return ResponseEntity.status(HttpStatus.OK)
             .cacheControl(CacheControl.noCache())
             .body("Healthy");
    }
}

