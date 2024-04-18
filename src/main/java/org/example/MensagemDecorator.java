package org.example;

public abstract class MensagemDecorator implements Mensagem {

    protected Mensagem mensagem;

    public MensagemDecorator(Mensagem mensagem) {
        this.mensagem = mensagem;
    }

    public String getConteudo() {
        return mensagem.getConteudo();
    }

    public abstract String getConteudoDecorado();
}