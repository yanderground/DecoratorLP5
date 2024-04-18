package org.example;

public class NotificacaoEmail extends MensagemDecorator{
    public NotificacaoEmail(Mensagem mensagem) {
        super(mensagem);
    }

    public String getConteudoDecorado() {
        return "Email: " + mensagem.getConteudo();
    }
}
