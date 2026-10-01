package example;

import org.example.Cliente;
import org.example.FabricaAbstrata;
import org.example.FactoryMethod;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTeste {

    @Test
    void deveEmitirContratoPF(){
        FabricaAbstrata fabrica = FactoryMethod.obterFabrica("PF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato PF emitido", cliente.emitirContrato());
    }

    @Test
    void deveEmitirContratoPJ(){
        FabricaAbstrata fabrica = FactoryMethod.obterFabrica("PJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato PJ emitido", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPF(){
        FabricaAbstrata fabrica = FactoryMethod.obterFabrica("PF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuracao PF emitida", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirProcuracaoPJ(){
        FabricaAbstrata fabrica = FactoryMethod.obterFabrica("PJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuracao PJ emitida", cliente.emitirProcuracao());
    }
}
