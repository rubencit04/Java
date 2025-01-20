package es.upgrade.modelo.entidad;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class Ordenador {
	private String nombre;
	private String precio;
	@Autowired
	private Procesador procesador;
	@Autowired
	private Placabase placabase;
	private List<RAM> listaram = new ArrayList<RAM>();
	@Autowired
	private Discoduro discoduro;
	@Autowired
	private Fuentealimentacion fuente;
	@Autowired
	private Tarjetagrafica tarjetagrafica;
	private List<Perifericos> listaperifericos = new ArrayList<Perifericos>();
}
