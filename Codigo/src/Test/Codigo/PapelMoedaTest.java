import Codigo.src.br.calebe.ticketmachine.core.TicketMachine;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class PapelMoedaTest {
  
 
  @Test  
    public void getValor(){  
		try {
			System.out.println("Começando teste de getValor");
int gabarito=0; 
   
 int valorc=0; 
int quantidadec=0; 
 
 PapelMoeda papelmoeda  =new PapelMoeda( valorc ,quantidadec); 
int resultado=papelmoeda.getValor();
	  System.out.println("Espera-se="+ gabarito +" . Recebeu="+resultado);
assertEquals(gabarito, resultado);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
    }  
 
  @Test  
    public void getQuantidade(){  
		try {
			System.out.println("Começando teste de getQuantidade");
int gabarito=0; 
   
 int valorc=0; 
int quantidadec=0; 
 
 PapelMoeda papelmoeda  =new PapelMoeda( valorc ,quantidadec); 
int resultado=papelmoeda.getQuantidade();
	  System.out.println("Espera-se="+ gabarito +" . Recebeu="+resultado);
assertEquals(gabarito, resultado);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
    }  
}
