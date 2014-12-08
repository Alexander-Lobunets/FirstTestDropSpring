package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

	 public class BlogController {
		@RequestMapping(value ="/post", method = RequestMethod.GET)
		public ModelAndView post() {
			return new ModelAndView("addpost", "command", new Post());
		}

		@RequestMapping(value ="/addPost", method = RequestMethod.POST)
		public String addPost(@ModelAttribute("SpringWeb")Post post,
							  ModelMap model) {
			model.addAttribute("title", post.getTitle());
			model.addAttribute("body", post.getBody());
			model.addAttribute("username", post.getUsername());
			model.addAttribute("postdate", post.getPostDate());
			return "result";
		}

}