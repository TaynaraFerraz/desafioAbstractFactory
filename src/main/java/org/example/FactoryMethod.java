package org.example;

public class FactoryMethod {

    private FactoryMethod() {};
    private static FactoryMethod instance = new FactoryMethod();
    public static FactoryMethod getInstance() {
        return instance;
    }

    public static FabricaAbstrata obterFabrica(String fabrica) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Fabrica" + fabrica); //manda PF ou PJ
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Fabríca inexistente");
        }
        if (!(objeto instanceof FabricaAbstrata)) {
            throw new IllegalArgumentException("Fabríca inválida");
        }
        return (FabricaAbstrata) objeto;
    }


}
