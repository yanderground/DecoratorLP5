package org.example;

public class NotificacaoPush extends MensagemDecorator{
    public NotificacaoPush(Mensagem mensagem) {
        super(mensagem);
    }

    public String getConteudoDecorado() {
        return "Push: " + mensagem.getConteudo();
    }
}
