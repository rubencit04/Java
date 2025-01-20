package es.upgrade.modelo.entidad;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Placabase {
	private String modelo;
	private String marca;
	private int slots;
}
