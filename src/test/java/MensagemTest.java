

import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MensagemTest {

    @Test
    void deveRetornarConteudoDaMensagem() {
        Mensagem mensagem = new MensagemBase("Hello");

        assertEquals("Hello", mensagem.getConteudo());
    }

    @Test
    void deveRetornarConteudoDecoradoNotificacaoEmail() {
        Mensagem mensagemBase = new MensagemBase("Email: Hello");
        Mensagem mensagemDecorada = new NotificacaoEmail(mensagemBase);

        assertEquals("Email: Hello", mensagemDecorada.getConteudo());
    }

    @Test
    void deveRetornarConteudoDecoradoNotificacaoSMS() {
        Mensagem mensagemBase = new MensagemBase("SMS: Hello");
        Mensagem mensagemDecorada = new NotificacaoSMS(mensagemBase);

        assertEquals("SMS: Hello", mensagemDecorada.getConteudo());
    }

    @Test
    void deveRetornarConteudoDecoradoNotificacaoPush() {
        Mensagem mensagemBase = new MensagemBase("Push: Hello");
        Mensagem mensagemDecorada = new NotificacaoPush(mensagemBase);

        assertEquals("Push: Hello", mensagemDecorada.getConteudo());
    }

    @Test
    void deveRetornarConteudoDecoradoNotificacaoEmailComSMS() {
        Mensagem mensagemBase = new MensagemBase("Email: SMS: Hello");
        Mensagem mensagemDecorada = new NotificacaoEmail(new NotificacaoSMS(mensagemBase));

        assertEquals("Email: SMS: Hello", mensagemDecorada.getConteudo());
    }

    @Test
    void deveRetornarConteudoDecoradoNotificacaoEmailComPush() {
        Mensagem mensagemBase = new MensagemBase("Email: Push: Hello");
        Mensagem mensagemDecorada = new NotificacaoEmail(new NotificacaoPush(mensagemBase));

        assertEquals("Email: Push: Hello", mensagemDecorada.getConteudo());
    }

    @Test
    void deveRetornarConteudoDecoradoNotificacaoSMSComPush() {
        Mensagem mensagemBase = new MensagemBase("SMS: Push: Hello");
        Mensagem mensagemDecorada = new NotificacaoSMS(new NotificacaoPush(mensagemBase));

        assertEquals("SMS: Push: Hello", mensagemDecorada.getConteudo());
    }

    @Test
    void deveRetornarConteudoDecoradoNotificacaoEmailComSMSComPush() {
        Mensagem mensagemBase = new MensagemBase("Email: SMS: Push: Hello");
        Mensagem mensagemDecorada = new NotificacaoEmail(new NotificacaoSMS(new NotificacaoPush(mensagemBase)));

        assertEquals("Email: SMS: Push: Hello", mensagemDecorada.getConteudo());
    }
}