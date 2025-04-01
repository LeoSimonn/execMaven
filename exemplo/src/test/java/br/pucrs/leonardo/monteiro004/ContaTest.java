package br.pucrs.leonardo.monteiro004;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {

    @Test
    public void testDepositar() {
        Conta conta = new Conta();
        conta.depositar(100);
        assertEquals(110, conta.getSaldo(), "O saldo deve ser 110 após o depósito de 100.");
    }

    @Test
    public void testSacar() {
        Conta conta = new Conta();
        conta.depositar(100);
        conta.sacar(50);
        assertEquals(60, conta.getSaldo(), "O saldo deve ser 60 após sacar 50.");
    }

    @Test
    public void testSacarValorMaiorQueSaldo() {
        Conta conta = new Conta();
        conta.depositar(100);
        conta.sacar(150);
        assertEquals(110, conta.getSaldo(), "O saldo não deve mudar ao tentar sacar mais do que o disponível.");
    }
}