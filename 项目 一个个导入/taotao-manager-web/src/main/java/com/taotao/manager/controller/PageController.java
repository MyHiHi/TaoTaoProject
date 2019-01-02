package com.taotao.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taotao.manager.service.ItemCatService;

@Controller

public class PageController {

	@RequestMapping("{pageName}")
	public String toPage(@PathVariable("pageName") String pageName) {
		return pageName;
	}
	
	@RequestMapping("home")
	public String toHome() {
		return "home";
	}
}
