package com.abid.keycloak;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping
    @PreAuthorize("hasAuthority('client_user')")
    public String hello(){
        return "Hello from spring book & keycloak";
    }

    @GetMapping("/hello-2")
    @PreAuthorize("hasAuthority('client_admin')")
    public String hello2(){
        return "Hello2 from spring book & keycloak";
    }
}
