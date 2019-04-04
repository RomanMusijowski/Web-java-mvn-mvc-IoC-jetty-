package application.service;

import application.dao.UserDAO;
import application.dao.impl.JdbcTemplateUserDAO;
import application.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("UserService")
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

//    @Autowired
//    @Qualifier(value = "userRepositoryImp")
//    private UserRepositoryImp userRepositoryImp;

//    @Autowired
//    @Qualifier(value = "jdbcTemplateUserDAO")
    private UserDAO userDAO;

    public UserServiceImpl(JdbcTemplateUserDAO dao){
        this.userDAO = dao;
    }


//    public User szukamEmail(String email) {
//        return userRepositoryImp.findByEmail(email);
//    }

    @Override
    public List<User> getAll() {
//        return userRepositoryImp.findAll();
        return userDAO.getAll();
    }

    @Override
    public User getOne(String email) {
        return userDAO.getOne(email);
    }

    @Override
    @Transactional
    public void add(User user) {
        userDAO.add(user);
    }
}
