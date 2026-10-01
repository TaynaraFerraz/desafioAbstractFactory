package org.example;

public class Cliente {

    private FabricaAbstrata fabricaAbstrata;

    public Cliente(FabricaAbstrata fabrica) {
        this.fabricaAbstrata = fabrica;
    }

    public String emitirContrato() {
        Contrato contrato = this.fabricaAbstrata.criarContrato();
        return contrato.emitir();
    }

    public String emitirProcuracao() {
        Procuracao procuracao = this.fabricaAbstrata.criarProcuracao();
        return procuracao.emitir();
    }
}
