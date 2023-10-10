package com.exemplo.notificacao;

import com.exemplo.modelo.Cliente;

public class NotificadorEmail {
	
	
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);

	}
}

//pacote utilizado para fazer uma falsa notificação ao usuario sobre o estado de seu status.
