package br.eng.rdtracker.repositories;

import br.eng.rdtracker.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rafael-danieli on 08/03/2017.
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
