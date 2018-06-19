package com.diebold.controller;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diebold.model.DieboldModel;
import com.diebold.services.DieboldService;

@Controller
public class DieboldController {

	@Autowired
	private DieboldService dieboldService;
	
	private static final Logger logger = LogManager.getLogger(DieboldModel.class);
	
	@GetMapping(name = "/")
	public String index(Model model) {
		System.out.println("DieboldController.index()");
		model.addAttribute("diebold", new DieboldModel());
		logger.debug("Hello world - debug log");
		logger.info("Hello world - info log");
		logger.warn("Hello world - warn log");
		logger.error("Hello world - error log");
		
		return "index";
	}

	@PostMapping(value = "/add")
	public String add(@ModelAttribute("diebold") DieboldModel dm, BindingResult result, Model model) {
		System.out.println("DieboldController.add()");
		if (result.hasErrors()) {
			System.out.println("--------Error--------");
			return "index";
		}
		dieboldService.add(dm);
		List<DieboldModel> dieboldList = dieboldService.getAllList();
		System.out.println("size====>"+dieboldList.size());
        model.addAttribute("diebolds", dieboldList);
		return "index";
	}
	
}
