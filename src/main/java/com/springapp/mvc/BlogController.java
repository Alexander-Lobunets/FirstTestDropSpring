package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;

@Controller

public class BlogController {

	private Blog blog;

	@PostConstruct
	public void init() {
		blog = new Blog();
		blog.setRecords();
	}

	@RequestMapping(value ="/addpost", method = RequestMethod.GET)
	public ModelAndView post() {
			return new ModelAndView("addpost", "command", new Post());
		}

	@RequestMapping(value ="/result", method = RequestMethod.POST)
	public String addPost(@ModelAttribute("SpringWeb")Post post,
				  ModelMap model) {
		model.addAttribute("title", post.getTitle());
		model.addAttribute("body", post.getBody());
		model.addAttribute("username", post.getUsername());
		model.addAttribute("postdate", post.getRecordDate());
		blog.addRecord(post);
		return "result";
	}

}