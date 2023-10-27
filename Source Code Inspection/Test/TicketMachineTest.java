import /home/runner/work/Source-Code-Inspection/Source-Code-Inspection/src.br.calebe.ticketmachine.core.TicketMachine;
import org.junit.Test;
import static org.junit.Assert.*;



public class TicketMachineTest {
 
  @Test  
    public void inserir(){  
		try {
			System.out.println("Começando teste de inserir");
 int nota=0; 
 
 int valor=0; 
 
 TicketMachine ticketmachine  =new TicketMachine( valor); 
ticketmachine.inserir( nota);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
    }  
 
  @Test  
    public void getSaldo(){  
		try {
			System.out.println("Começando teste de getSaldo");
int gabarito=0; 
   
 int valor=0; 
 
 TicketMachine ticketmachine  =new TicketMachine( valor); 
int saida=ticketmachine.getSaldo();
	  System.out.println("Espera-se="+ gabarito +" . Recebeu="+saida);
assertEquals(gabarito, saida);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
    }  
 
  @Test  
    public void getTroco(){  
		try {
			System.out.println("Começando teste de getTroco");
int gabarito=0; 
   
int valor=0; 
 
 TicketMachine ticketmachine  =new TicketMachine( valor); 
int saida=ticketmachine.getTroco();
	  System.out.println("Esperado="+ gabarito +" . Recebeu="+saida);
assertEquals(gabarito, saida);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
    }  
 
  @Test  
    public void imprimir(){  
        int valor=0; 
		try {
			System.out.println("Começando teste de imprimir");
            String gabarito=""; 
            TicketMachine ticketmachine  =new TicketMachine( valor); 
            String saida=ticketmachine.imprimir();
            System.out.println("Esperado="+ gabarito +" . Recebeu="+saida);
            assertEquals(gabarito, saida);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
    }  
}
