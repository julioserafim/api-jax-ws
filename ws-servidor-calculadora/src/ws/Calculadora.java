package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Calculadora {
	
	@WebMethod
	public int somar(int num1, int num2);

}
