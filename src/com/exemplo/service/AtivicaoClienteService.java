package com.exemplo.service;

import com.exemplo.modelo.Cliente;
import com.exemplo.notificacao.NotificadorEmail;

public class AtivicaoClienteService {
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		NotificadorEmail notificador = new NotificadorEmail();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}

//Classe de serviço utilizada para trocar o status do cliente de inativo para ativo
