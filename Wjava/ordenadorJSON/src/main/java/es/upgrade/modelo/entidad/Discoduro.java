package es.upgrade.modelo.entidad;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Discoduro {
	private String marca;
	private String tipo;
	private String capacidad;
}
