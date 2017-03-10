package br.eng.rdtracker.services.impl;

import br.eng.rdtracker.domain.User;
import br.eng.rdtracker.repositories.UserRepository;
import br.eng.rdtracker.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by rafael-danieli on 08/03/2017.
 */
@Service
@Repository
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void save(User book) {
        userRepository.save(book);
    }

    @Override
    public User findOne(long id) {
        return userRepository.findOne(id);
    }

    @Override
    public void delete(long id) {
        userRepository.delete(id);
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
