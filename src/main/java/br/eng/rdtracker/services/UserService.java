package br.eng.rdtracker.services;

import br.eng.rdtracker.domain.User;

import java.util.List;

/**
 * Created by rafael-danieli on 08/03/2017.
 */
public interface UserService {
    List<User> findAll();
    void save(User book);
    User findOne(long id);
    void delete(long id);
}
