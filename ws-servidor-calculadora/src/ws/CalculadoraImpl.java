package ws;

import javax.jws.WebService;


//Especifica qual interface de serviço a classe implementa
@WebService(endpointInterface = "ws.Calculadora")
public class CalculadoraImpl implements Calculadora{

	@Override
	public int somar(int num1, int num2) {
		return num1 + num2;
	}

}
