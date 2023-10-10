package com.exemplo.notificacao;

import com.exemplo.modelo.Cliente;

public class NotificadorSMS implements Notificador{

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS através do telefone %s: %s\n",
				cliente.getNome(), cliente.getTelefone(), mensagem);

	}
}

//A anotação @Override é usada aqui para sobrescrever o método notificar com o Notificador