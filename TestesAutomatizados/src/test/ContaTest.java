package test;

import Main.Conta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class ContaTest {
    @Test
    @DisplayName("Deve depositar Na Conta Ativada Com SaldoZero.")
    public void DevedepositarNaContaAtivadaComSaldoZero() {
        Conta conta;
        boolean resultado;
        double deposito;

        conta=new Conta();
        conta.ativar();


        //Deposito Inicial
        deposito=100.00;
        resultado=conta.depositar(deposito);

        Assertions.assertEquals(100.00,conta.getSaldo(), 0.001);
        Assertions.assertTrue(resultado);
        if((conta.getSaldo()==100.00) && (resultado==true)){
            System.out.println("PASSOU no teste!!");
        }else{
            System.out.println("Não passou no teste!!!");
        }
    }
}
