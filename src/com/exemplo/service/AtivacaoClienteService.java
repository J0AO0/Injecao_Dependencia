package com.exemplo.service;

import com.exemplo.modelo.Cliente;
import com.exemplo.notificacao.Notificador;


public class AtivacaoClienteService {
	
	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
	 //Removemos a linha que refencia o método em si para referenciarmos apenas a interface
		
	 //NotificadorSMS notificador = new NotificadorSMS();
		
		this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}

//Classe de serviço utilizada para trocar o status do cliente de inativo para ativo

//no metodo AtivacaoClienteService estamos recebendo o objeto notificador 
//e ele pode ou nao ser do tipo SMS ou Email.
