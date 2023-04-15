package ma.enset.patient_mvc;

import ma.enset.patient_mvc.entites.Patient;
import ma.enset.patient_mvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class PatientMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientMvcApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository)
    {
        return  args -> {
            patientRepository.save(
                    new Patient(null,"hassan",new Date(),false,12)
            );
            patientRepository.save(
                    new Patient(null,"Mohamed",new Date(),false,312)
            );
            patientRepository.save(
                    new Patient(null,"Yasmine",new Date(),false,65)
            );
            patientRepository.save(
                    new Patient(null,"ali",new Date(),false,132)
            );

            patientRepository.findAll().forEach(p->{System.out.println(p.getNom());});
        };
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
