/**
 * Created by gerard on 17/02/2016.
 */

package Controllers;
import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import DAO.User;
import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

 @Controller
public class LoginController {
     @Autowired
     UserService userService;

     @RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
        public String welcomePage(Model model) {
            return "homePage";
        }

        @RequestMapping(value = "/admin", method = RequestMethod.GET)
        public String adminPage(Model model) {
            model.addAttribute("title", "Admin");
            model.addAttribute("message", "Admin Page - This is protected page!");
            return "adminPage";
        }

    @RequestMapping("/register")
    public String registerUser(@ModelAttribute User user) {

        return ("registerPage");
    }

     @RequestMapping("/insertAdmin")
     public String insertAdmin(@ModelAttribute User user) {

         return ("addAdmin");
     }

    @RequestMapping("/insert")
    public String insertData(@ModelAttribute User user) {
        if (user != null)
            userService.insertData(user);
        return "redirect:/getList";
    }

     @RequestMapping("/insertAdminDB")
     public String insertAdminDB(@ModelAttribute User user) {
         if (user != null)
             userService.insertData(user);
         return "redirect:/getList";
     }

    @RequestMapping("/getList")
    public ModelAndView getUserList() {
        List<User> userList = userService.getUserList();
        return new ModelAndView("userList", "userList", userList);
    }

     @RequestMapping("/edit")
     public ModelAndView editUser(@RequestParam String id,
                                  @ModelAttribute User user) {

         user = userService.getUser(id);

         Map<String, Object> map = new HashMap<String, Object>();
         map.put("user", user);

         return new ModelAndView("editUsersPage", "map", map);

     }

     @RequestMapping("/update")
     public String updateUser(@ModelAttribute User user) {
         userService.updateData(user);
         return "redirect:/getList";

     }

     @RequestMapping("/delete")
     public String deleteUser(@RequestParam String id) {
         System.out.println("id = " + id);
         userService.deleteData(id);
         return "redirect:/getList";
     }

     @RequestMapping(value = "/login", method = RequestMethod.GET)
        public String loginPage(Model model) {
            model.addAttribute("title", "Login");
            model.addAttribute("message", "Enter your username/password:");
            return "loginPage";
        }

        @RequestMapping(value = "/logoutSuccessful", method = RequestMethod.GET)
        public String logoutSuccessfulPage(Model model) {
            model.addAttribute("title", "Logout");
            return "logoutSuccessfulPage";
        }

        @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
        public String loginPage(Model model, Principal principal) {
            model.addAttribute("title", "User Info");

            // Sau khi user login thanh cong se co principal
            String userName = principal.getName();

            model.addAttribute("message",
                    "User Info - This is protected page!. Hello " + userName);

            return "userInfoPage";
        }

        @RequestMapping(value = "/403", method = RequestMethod.GET)
        public String accessDenied(Model model, Principal principal) {
            model.addAttribute("title", "Access Denied!");

            if (principal != null) {
                model.addAttribute("message", "Hi " + principal.getName()
                        + "<br> You do not have permission to access this page!");
            } else {
                model.addAttribute("msg",
                        "You do not have permission to access this page!");
            }
            return "403Page";
        }
    }

