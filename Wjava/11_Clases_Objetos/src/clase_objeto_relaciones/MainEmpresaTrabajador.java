package clase_objeto_relaciones;


public class MainEmpresaTrabajador {
	public static void main(String[] args) {
        trabajador trabajador1 = new trabajador("Juan", "111111111", 2500);
        trabajador trabajador2 = new trabajador("Ana", "222222222", 3200);
        trabajador trabajador3 = new trabajador("Pedro", "333333333", 1800);

    
        String[] listaTrabajadores1 = {"Juan,111111111,2500", "Ana,222222222,3200"};
        empresa empresa1 = new empresa("Empresa1", "NIF123", listaTrabajadores1);

        String[] listaTrabajadores2 = {"Pedro,333333333,1800"};
        empresa empresa2 = new empresa("Empresa2", "NIF456", listaTrabajadores2);


        empresa[] arrayEmpresas = {empresa1, empresa2};

   
        for (empresa empresa : arrayEmpresas) {
            System.out.println("\nDatos de la Empresa: " + empresa);


            empresa.empresaigual(empresa);
            
            System.out.println("Salario total: " + empresa.obtenerSalarioTotal());

          
            int cantidadParametro = 3000;
            System.out.println("Número de trabajadores que ganan más de " + cantidadParametro + ": " + empresa.masparametro(cantidadParametro));

            if (empresa.todosTrabajadoresConDniValido()) {
                System.out.println("Todos los trabajadores tienen DNI válido.");
            } else {
                System.out.println("No todos los trabajadores tienen DNI válido.");
            }
        }
    }
}
