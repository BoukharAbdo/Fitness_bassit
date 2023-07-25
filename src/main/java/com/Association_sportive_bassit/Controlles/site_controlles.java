package com.Association_sportive_bassit.Controlles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Fitness_Bassit")
public class site_controlles {
	
	
	@GetMapping("/Home")
	public String ShowSite() {
		return "views/index";
	}
	
	
	@GetMapping("/About")
	public String Showabout() {
		return "views/about";
	}
	
	@GetMapping("/Courses")
	public String Showcourses() {
		return "views/courses";
	}
	@GetMapping("/Pricing")
	public String Showpricing() {
		return "views/pricing";
	}
	@GetMapping("/Blog")
	public String Showblog() {
		return "views/blog";
	}
	@GetMapping("/Blog_Details")
	public String ShowBlog_Details() {
		return "views/blog_details";
	}
	@GetMapping("/Elements")
	public String ShowElements() {
		return "views/elements";
	}
	@GetMapping("/Gallery")
	public String ShowGallery() {
		return "views/gallery";
	}
	@GetMapping("/Contact")
	public String ShowContact() {
		return "views/contact";
	}
	@GetMapping("/test")
	public String Showtest() {
		return "views/test";
	}

}
