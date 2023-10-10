package com.exemplo.service;

import com.exemplo.modelo.Cliente;
import com.exemplo.modelo.Produto;
import com.exemplo.notificacao.Notificador;
import com.exemplo.notificacao.NotificadorSMS;

public class EmissaoNotaFiscalService{
	
	private Notificador notificador;
	
	public EmissaoNotaFiscalService(Notificador notificador) {
		this.notificador = notificador;
	}

	public void emitir(Cliente cliente, Produto produto) {
		// TODO emite a nota fiscal aqui...
		
		this.notificador.notificar(cliente, "Nota fiscal do protudo "
				+ produto.getNome() + " foi emitida!");
	}
}

//as implementações feitas aqui são as mesmas na classe de AtivacaoCliente
