package com.exemplo;

import com.exemplo.modelo.Cliente;
import com.exemplo.notificacao.Notificador;
import com.exemplo.notificacao.NotificadorSMS;
import com.exemplo.service.AtivacaoClienteService;

public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente("João", "joao@xyz.com", "3499998888");
		Cliente maria = new Cliente("Maria", "maria@xyz.com", "1177772222");
		
		Notificador notificador = new NotificadorSMS();
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(maria);
	}
	
}

//Aqui foi feita a injeção de dependencia (notificador) dentro de AtivacaoClienteService().
//Apenas trocando entre NotificadorEmail e NotificadorSMS.