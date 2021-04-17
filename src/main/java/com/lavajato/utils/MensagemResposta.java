package com.lavajato.utils;

public class MensagemResposta {

    private String mensagem;
    private boolean StatusRequisicao;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public boolean isStatusRequisicao() {
        return StatusRequisicao;
    }

    public void setStatusRequisicao(boolean statusRequisicao) {
        StatusRequisicao = statusRequisicao;
    }
}
