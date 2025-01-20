package es.upgrade.modelo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Scope("prototype")
public class RAM {
	private int id;
	private String marca;
	private String tipo;
	private String capacidad;
	private String hz;
	private int cl;
}
