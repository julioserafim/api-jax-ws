package test;

import javax.xml.ws.Endpoint;

import ws.CalculadoraImpl;

public class Main {

	public static void main(String[] args) {
	
		try {
			//Publicando o serviço  
			//Digite:'http://localhost:8085/ws/calculadora?wsdl' na url que será visto o descritor do serviço
			Endpoint.publish("http://localhost:8085/ws/calculadora", new CalculadoraImpl());
			System.out.println("Sucesso");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
