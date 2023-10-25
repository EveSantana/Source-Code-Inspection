package test.easycodeforall.changeit; 
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.apache.log4j.Logger;
public class TicketMachineTest {
  
	private Logger log = Logger.getLogger(this.getClass());
 
  @Test  
    public void inserir(){  
		try {
			log.info("Começando teste de inserir");
 int nota=0; 
 
 int valor=0; 
 
 TicketMachine ticketmachine  =new TicketMachine( valor); 
ticketmachine.inserir( nota);
assertTrue(true);
		} catch (Exception exception) {
			log.error("Erro inserir-"+exception,exception);
			exception.printStackTrace();
			assertFalse(false);
		}
    }  
 
  @Test  
    public void getSaldo(){  
		try {
			log.info("Começando teste de getSaldo");
int gabarito=0; 
   
 int valor=0; 
 
 TicketMachine ticketmachine  =new TicketMachine( valor); 
int saida=ticketmachine.getSaldo();
	  log.info("Espera-se="+ gabarito +" . Recebeu="+saida);
	  System.out.println("Espera-se="+ gabarito +" . Recebeu="+saida);
assertEquals(gabarito, saida);
		} catch (Exception exception) {
			log.error(exception,exception);
			exception.printStackTrace();
			assertFalse(false);
		}
    }  
 
  @Test  
    public void getTroco(){  
		try {
			log.info("Começando teste de getTroco");
int gabarito=0; 
   
 int valor=0; 
 
 TicketMachine ticketmachine  =new TicketMachine( valor); 
int saida=ticketmachine.getTroco();
	  log.info("Esperado="+ gabarito +" . Recebeu="+saida);
	  System.out.println("Esperado="+ gabarito +" . Recebeu="+saida);
assertEquals(gabarito, saida);
		} catch (Exception exception) {
			log.error(exception,exception);
			exception.printStackTrace();
			assertFalse(false);
		}
    }  
 
  @Test  
    public void imprimir(){  
		try {
			log.info("Começando teste de imprimir");
String gabarito=""; 
  SaldoInsuficienteException { = null; 
 
 int valor=0; 
 
 TicketMachine ticketmachine  =new TicketMachine( valor); 
String saida=ticketmachine.imprimir( {);
	  log.info("Esperadoe="+ gabarito +" . Recebeu="+saida);
	  System.out.println("Esperado="+ gabarito +" . Recebeu="+saida);
assertEquals(gabarito, saida);
		} catch (Exception exception) {
			log.error(exception,exception);
			exception.printStackTrace();
			assertFalse(false);
		}
    }  
}
