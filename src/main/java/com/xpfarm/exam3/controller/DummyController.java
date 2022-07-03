package com.xpfarm.exam3.controller;


import com.xpfarm.exam3.service.DummyService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
class DummyController {
    DummyService dummyService;

    @GetMapping
    public String hello() {
        return dummyService.hello();
    }
}
