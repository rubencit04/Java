package _02ColaCorreos;
import java.util.LinkedList;
import java.util.Queue;
public class Cola {
	public final static int MAX_EMAIL = 5;
	
	private Queue<Email> cola = new LinkedList<>();
	
	public synchronized void addMensaje(Email email){
		if(email.getDestinatario().equals("pikachu@gmail.com")) {
			System.out.println("El email con la id "+email.getId()+" ha sido descartado");
			return;
			
		}
		while(cola.size() == MAX_EMAIL){
			try {
				
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		cola.offer(email);
		notify();
	}
	
	public synchronized Email getMensaje(){
		Email em = null;
		while(cola.size() == 0){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		em = cola.poll();
		notify();
		return em;
	}
	
}
