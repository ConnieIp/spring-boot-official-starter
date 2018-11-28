package com.oocl.web.sampleWebApp.controller;

import com.oocl.web.sampleWebApp.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping(produces = {"application/json"})
    public ResponseEntity<String> add(@RequestBody User user) {
        return ResponseEntity.created(URI.create("/users/"+user.getId())).body("hi");
    }

    @GetMapping(path="{userId}", produces = {"application/json"})
    public ResponseEntity<String> get(@PathVariable int userId) {
        return ResponseEntity.ok("hi");
    }
}
