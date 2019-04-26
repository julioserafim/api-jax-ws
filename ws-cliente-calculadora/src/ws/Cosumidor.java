package ws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Cosumidor {
	
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:8085/ws/calculadora?wsdl");
		
		//Nome a ser consumido tal qual está no 'targetNamespace=' do documento wsdl
		QName qname = new QName("http://ws/", "CalculadoraImplService");
		Service service = Service.create(url, qname);
		
		Calculadora calc = service.getPort(Calculadora.class);
		
		
		
		System.out.println("Soma: " + calc.somar(1, 2));
		
	}
}
