package application.controllers;

import application.model.User;
import application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/users")
public class UserController{

    @Autowired
    @Qualifier(value = "firstService")
    private UserService service;




//
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userFromServer", new User());
        modelAndView.setViewName("login_page");
        return modelAndView;
    }

//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public @ResponseBody List<User> getAllUsers() {
//
//        return service.getAll();
//    }


//
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("users", service.getAll());
        modelAndView.setViewName("users_list_page");
        return modelAndView;
    }

//    @ResponseBody @RequestMapping(value = "/admin", method = RequestMethod.GET)
//    public ModelAndView checkUser(@ModelAttribute("userFromServer") User user){
//
//        openTransactionSession();
//        String sql = "SELECT * FROM user WHERE email = '" + user.getEmail() +
//                "' AND password = '" + user.getPassword() + "'";
//
//        Session session = getSession();
//        Query query = session.createNativeQuery(sql).addEntity(User.class);
//
//        User user1 = (User) query.getSingleResult();
//
//        closeTransactionSession();
//
//        ModelAndView modelAndView = new ModelAndView();
//        if (user1 != null){
//            modelAndView.addObject("pracownik", user1);
//            modelAndView.setViewName("admin_page");
//            return modelAndView;
//        }
//
//        modelAndView.addObject("pracownik", "Błąd podanych danych");
//        modelAndView.setViewName("admin_page");
//        return modelAndView;
//    }




//    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//    @ResponseBody @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public  ModelAndView getAllUsers() {
//        List<User> users = jpaUserService.getAll();
//
//
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("users", users);
//        modelAndView.setViewName("users_list_page");
//
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
//    public ModelAndView  addUser(){
//
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("userRegistracja", new User());
//        modelAndView.setViewName("add_user_page");
//        return modelAndView;
//    }
//
//    @ResponseBody @RequestMapping(value = "/saveUser", method = RequestMethod.GET)
//    public ModelAndView saveUser(@ModelAttribute("userRegistracja") User user){
//
//        jpaUserService.add(user);
//
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("users_list_page");
//        return modelAndView;
//    }

}
