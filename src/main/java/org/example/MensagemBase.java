package org.example;

public class MensagemBase implements Mensagem {

    private String conteudo;

    public MensagemBase(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }
}
