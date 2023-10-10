package com.exemplo.notificacao;

import com.exemplo.modelo.Cliente;

public class NotificadorEmail implements Notificador{
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);

	}
}

//pacote utilizado para fazer uma falsa notificação ao usuario sobre o estado de seu status.

//A anotação @Override é usada aqui para sobrescrever o método notificar com o Notificador
