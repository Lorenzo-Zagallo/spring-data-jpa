package lorenzozagallo.aula_spring_data_jpa;

import lorenzozagallo.aula_spring_data_jpa.model.User;
import lorenzozagallo.aula_spring_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("LORENZO");
        user.setUsername("iuloki");
        user.setPassword("senha123");

        userRepository.save(user);

        for (User u : userRepository.findAll()) {
            System.out.println(u);
        }
    }
}

/*
*  Quando eu digo que minha classe vai implementar o CommandLineRunner, ela recebe
*  a obrigação de implementar o método run, parecido com o método main.
*  Logo então, vamos dizer que a classe é um @Component, ou seja, um objeto gerenciado
*  pelo Spring Framework.
*  E desfrutando do recurso de inversão de controle e injeção de dependência, vamos injetar
*  o repository UserRepository.
*  E depois daremos o @Autowired para haver a injeção de dependências.
* */
