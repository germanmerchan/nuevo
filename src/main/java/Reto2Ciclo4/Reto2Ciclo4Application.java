package Reto2Ciclo4;

import Reto2Ciclo4.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import Reto2Ciclo4.interfaces.InterfaceCosmetic;

@Component
@SpringBootApplication
public class Reto2Ciclo4Application implements CommandLineRunner{
    @Autowired
    private InterfaceCosmetic interfaceCosmetic;
    @Autowired
    private InterfaceUser interfaceUser;
	public static void main(String[] args) {
		SpringApplication.run(Reto2Ciclo4Application.class, args);
	}
          @Override
    public void run(String... args) throws Exception {
        interfaceCosmetic.deleteAll();
        interfaceUser.deleteAll();
    }

}
