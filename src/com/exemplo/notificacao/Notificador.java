package com.exemplo.notificacao;

import com.exemplo.modelo.Cliente;

public interface Notificador {
	void notificar(Cliente cliente, String mensagem);
}
