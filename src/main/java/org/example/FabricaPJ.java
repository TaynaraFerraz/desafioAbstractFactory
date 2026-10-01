package org.example;

public class FabricaPJ implements FabricaAbstrata{
    @Override
    public Contrato criarContrato() {
        return new ContratoPJ();
    }

    @Override
    public Procuracao criarProcuracao() {
        return new ProcuracaoPJ();
    }
}
