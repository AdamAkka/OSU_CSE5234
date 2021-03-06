package edu.osu.cse5234.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.osu.cse5234.model.Order;

@Controller
@RequestMapping("/")

public class HomePageController {

	@RequestMapping(method = RequestMethod.GET)
	public String viewHomePage(HttpServletRequest request, HttpServletResponse response) throws Exception {

		Order order = new Order();
		request.setAttribute("order", order);

		return "home";
	}

	@RequestMapping(path = "/AboutUs", method = RequestMethod.GET)
	public String ContactUs() throws Exception {

		return "AboutUs";
	}

	@RequestMapping(path = "/ContactUs", method = RequestMethod.GET)
	public String AboutUs() throws Exception {

		return "ContactUs";
	}

}
