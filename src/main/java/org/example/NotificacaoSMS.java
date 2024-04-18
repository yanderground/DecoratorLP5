package org.example;

public class NotificacaoSMS  extends MensagemDecorator{
    public NotificacaoSMS(Mensagem mensagem) {
        super(mensagem);
    }

    public String getConteudoDecorado() {
        return "SMS: " + mensagem.getConteudo();
    }
}
