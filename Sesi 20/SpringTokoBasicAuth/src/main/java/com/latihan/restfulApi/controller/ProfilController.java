package com.latihan.restfulApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/profile")
public class ProfilController {
	 @GetMapping("/test1")
	    public String test1(){
	        return "API Test 1";
	    }
}
