package com.softtek.jpa.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.softtek.jpa.domain.User;
import com.softtek.jpa.domain.UserRole;
import com.softtek.jpa.services.UserRolService;
import com.softtek.jpa.services.UserService;

/**
 * Handles requests for the application home page.
 */
@RequestMapping(value = "/User")
@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@Autowired
	UserRolService userRoleService;

	/*
	 * @Autowired UserRolService userRoleImpl;
	 */

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String root() {
		return "home";
	}
	
	
	@RequestMapping(value = "/List")
	public String List(Model model) {
		return "users";
	}

	@RequestMapping(value = "/ListData", method= RequestMethod.GET)
    public ResponseEntity<List<User>> getAllEmployeesJSON() 
    {
		List<User> users=userService.userList();
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/ListData/{name}", method= RequestMethod.GET)
    public ResponseEntity<List<User>> getUserByName(@RequestParam String name) 
    {
		System.out.println(name);
		List<User> users=userService.getUserByName(name);
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/edit")
	public String editUser(@RequestParam String username, @RequestParam String status, Model model) {
		User user = userService.user(username);
		List<UserRole> userRoleList = userRoleService.userRoleList();
		List<String> listStatus = userRoleService.statusList();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("users", user);
		map.put("userRole", userRoleList);
		map.put("listStatus", listStatus);
		map.put("status", status);
		model.addAttribute("map", map);
		return "editUser";

	}

	@RequestMapping(value = "/create")
	public ModelAndView create(@RequestParam String status) {

		/*
		 * List<UserRole> userRoleList = userRoleService.list(); List<String>
		 * listStatus = userService.statusList(); Map<String,Object>map=new
		 * HashMap<String, Object>(); map.put("userRole", userRoleList);
		 * map.put("listStatus", listStatus); map.put("status", status); return
		 * new ModelAndView("jsp/"+"User"+"/create","map",map);
		 */
		return null;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateUser(@ModelAttribute User user, HttpServletRequest request) {

		final String user_role_id = new String(request.getParameter("userRole"));
		if (userService.update(user, user_role_id)) {
			return "redirect:/User/List";
		}
		return "redirect:/User/edit?username=" + user.getUsername() + "&status=Not valid";

	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addUser(@ModelAttribute User user, @RequestParam String userRoleId,
			@RequestParam String description) {
		/*
		 * System.out.println(user.getRole());
		 * 
		 * UserRole userRole =new UserRole();
		 * userRole.setUserRoleId(userRoleId);
		 * userRole.setDescription(description); user.setRole(userRole); if(
		 * userService.update(user)){ return "redirect:/User/List"; } return
		 * "redirect:/User/create?status=Not Valid";
		 */return null;
	}
}
