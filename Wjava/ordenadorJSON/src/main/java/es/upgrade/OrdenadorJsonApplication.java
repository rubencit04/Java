package es.upgrade;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.google.gson.Gson;

import es.upgrade.modelo.entidad.Ordenador;

@SpringBootApplication
public class OrdenadorJsonApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrdenadorJsonApplication.class, args);

        try (FileReader fr = new FileReader("ordenador.json");
             BufferedReader br = new BufferedReader(fr)) {

            Gson gson = new Gson();
            Ordenador o = gson.fromJson(br, Ordenador.class);
            System.out.println(o);
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
}
