package es.upgrade.modelo.entidad;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Tarjetagrafica {
	private String marca;
	private String modelo;
	private int cuda;
}
