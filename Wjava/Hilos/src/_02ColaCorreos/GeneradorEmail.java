package _02ColaCorreos;

import java.util.concurrent.ThreadLocalRandom;

public class GeneradorEmail {
    Email email = new Email();
    private static int contadorId = 1; 
    public Email generarEmail() {
        String asunto = generarAsunto();
        
        
        email.setDestinatario(generarDestinatario());
        email.setAsunto(asunto); 
        email.setCuerpoMensaje(generarCuerpo(asunto));  
        email.setRemitente(generarRemitente());
        email.setId(contadorId++);  

        return email;
    }

    public String generarDestinatario() {
        String[] destinatarios = {
            "ash.ketchum@gmail.com", "professor.oak@lab.com", "misty.waterflower@gmail.com",
            "brock.pewtercity@citygym.com", "brock@gmail.com", "nurse.joy@pokehospital.com", "pikachu@gmail.com"
        };
        int numero = ThreadLocalRandom.current().nextInt(destinatarios.length);
        return destinatarios[numero];
    }

    public String generarCuerpo(String asunto) {
        String[] cuerpos = {
            "La Pokedex es una enciclopedia electrónica que contiene información detallada sobre todos los Pokémon.",
            "Los Pokémon son criaturas fascinantes que habitan en nuestro mundo.",
            "Los tipos de Pokémon, como Agua, Fuego, y Planta, juegan un papel crucial en las batallas.",
            "El mundo Pokémon está lleno de localizaciones interesantes como bosques, montañas, y cuevas.",
            "Los gimnasios Pokémon son lugares donde los entrenadores pueden poner a prueba sus habilidades.",
            "En el mundo Pokémon existen muchos objetos útiles, como Poké Balls, pociones y revivires.",
            "Los centros Pokémon cuentan con personal médico, como la Enfermera Joy, que pueden curar a tus Pokémon."
        };

        if ("Pokedex".equals(asunto)) {
            return cuerpos[0];
        } else if ("Pokemon".equals(asunto)) {
            return cuerpos[1];
        } else if ("Tipos".equals(asunto)) {
            return cuerpos[2];
        } else if ("Localizaciones".equals(asunto)) {
            return cuerpos[3];
        } else if ("Gimnasios".equals(asunto)) {
            return cuerpos[4];
        } else if ("Objetos".equals(asunto)) {
            return cuerpos[5];
        } else if ("Medico".equals(asunto)) {
            return cuerpos[6];
        }
        return null;
    }

    public String generarAsunto() {
        String[] asuntos = {"Pokedex", "Pokemon", "Tipos", "Localizaciones", "Gimnasios", "Objetos", "Medico"};
        int numero = ThreadLocalRandom.current().nextInt(asuntos.length);
        return asuntos[numero];
    }

    public String generarRemitente() {
        String[] remitentes = {
            "ash.ketchum@gmail.com", "professor.oak@lab.com", "misty.waterflower@gmail.com",
            "brock.pewtercity@citygym.com", "brock@gmail.com", "nurse.joy@pokehospital.com", "pikachu@gmail.com"
        };
        int numero = ThreadLocalRandom.current().nextInt(remitentes.length);
        return remitentes[numero];
    }
}

