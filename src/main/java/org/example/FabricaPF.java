package org.example;

public class FabricaPF implements FabricaAbstrata{
    @Override
    public Contrato criarContrato() {
        return new ContratoPF();
    }

    @Override
    public Procuracao criarProcuracao() {
        return new ProcuracaoPF();
    }
}
