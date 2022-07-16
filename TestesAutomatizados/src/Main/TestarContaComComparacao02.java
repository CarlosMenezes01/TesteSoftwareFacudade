package Main;

public class TestarContaComComparacao02 {
    public static void main(String[] args){
        Conta conta;
        boolean resultado;
        double depositoInicial, deposito, saque;

        DevedepositarNaContaAtivadaComSaldoZero();
        DeveDepositarNaContaAtivadaComSaldoExistentePositivo();
        DeveSacarDaContaAtivadaComSaldoPositivo();
        NãoDeveSacarDaContaAtivadaSeOSaldoFicarNegativo();
        NaoDeveDepositarNaContaDesativada();


        NaoDeveSacarDaContaDesativada();

    }

    private static void NaoDeveSacarDaContaDesativada() {
        double depositoInicial;
        double saque;
        boolean resultado;
        Conta conta;
        //Não deve sacar da conta desativada.
        System.out.println("\nNão deve sacar da conta desativada.");

        conta=new Conta();

        //Deposito inicial
        conta.ativar();
        depositoInicial=100.00;
        conta.depositar(depositoInicial);
        conta.desativar();

        //Saque
        saque=50.00;
        resultado=conta.sacar(saque);

        System.out.println("Depósito Inicial"+depositoInicial);
        System.out.println("Conta Ativa?"+conta.isAtiva());
        System.out.println("saque:"+saque);
        System.out.println("Saldo:"+conta.getSaldo());
        System.out.println("Resultado:"+resultado);

        if((conta.getSaldo()==100.00) && (resultado==false)){
            System.out.println("PASSOU no teste!!");
        }else{
            System.out.println("Não passou no teste!!");
        }
    }

    private static void NaoDeveDepositarNaContaDesativada() {
        boolean resultado;
        Conta conta;
        double deposito;
        //Não deve depositar na conta desativada.
        System.out.println("\nNão deve depositar na conta desativada.");

        conta=new Conta();
        conta.desativar();

        System.out.println("saldo:"+conta.getSaldo());

        //Deposito inicial
        deposito=100.00;
        resultado=conta.depositar(deposito);

        System.out.println("Conta Ativa?"+conta.isAtiva());
        System.out.println("Depósito:"+deposito);
        System.out.println("Saldo:"+conta.getSaldo());
        System.out.println("Resultado:"+resultado);

        if((conta.getSaldo()==0.00) && (resultado==false)){
            System.out.println("PASSOU no teste!!");
        }else{
            System.out.println("Não passou no teste!!");
        }
    }

    private static void NãoDeveSacarDaContaAtivadaSeOSaldoFicarNegativo() {
        Conta conta;
        double depositoInicial;
        boolean resultado;
        double saque;//Não deve sacar da conta ativada se o saldo ficar negativo
        System.out.println("\nNão deve sacar  da conta ativada se o saldo ficar negativo.");

        conta=new Conta();
        conta.ativar();

        //Deposito inicial
        depositoInicial=100.00;
        resultado=conta.depositar(depositoInicial);

        //Saque
        saque=150.00;
        resultado=conta.sacar(saque);

        System.out.println("Deposito Inicial:"+depositoInicial);
        System.out.println("Conta Ativa?"+conta.isAtiva());
        System.out.println("Saque:"+saque);
        System.out.println("Saldo:"+conta.getSaldo());
        System.out.println("Resultado:"+resultado);

        if((conta.getSaldo()==100.00) && (resultado==false)){
            System.out.println("PASSOU no teste!!");
        }else{
            System.out.println("Não passou no teste!!");
        }
    }

    private static void DeveSacarDaContaAtivadaComSaldoPositivo() {
        Conta conta;
        double depositoInicial;
        boolean resultado;
        double saque;//Deve sacar da conta ativada com saldo positivo.
        System.out.println("\nDeve sacar da conta ativada com saldo positivo.");

        conta=new Conta();
        conta.ativar();

        //Deposito inicial
        depositoInicial=200.00;
        resultado=conta.depositar(depositoInicial);

        //Saque
        saque=50.00;
        resultado=conta.sacar(saque);

        System.out.println("Deposito Inicial:"+depositoInicial);
        System.out.println("Conta Ativa?"+conta.isAtiva());
        System.out.println("Saque:"+saque);
        System.out.println("Saldo:"+conta.getSaldo());
        System.out.println("Resultado:"+resultado);

        if((conta.getSaldo()==150.00) && (resultado==true)){
            System.out.println("PASSOU no teste!!");
        }else{
            System.out.println("Não passou no teste!!");
        }
    }

    private static void DeveDepositarNaContaAtivadaComSaldoExistentePositivo() {
        //Deve depositar na conta ativada com saldo existente positivo
        Conta conta;
        boolean resultado;
        double depositoInicial, deposito, saque;

        System.out.println("\nDeve depositar na conta ativada com saldo existente positivo.");

        conta=new Conta();
        conta.ativar();

        //Deposito inicial
        depositoInicial=1.00;
        resultado=conta.depositar(depositoInicial);

        //Proximo Depósito
        deposito=100.00;
        resultado=conta.depositar(deposito);

        System.out.println("Deposito Inicial:"+depositoInicial);
        System.out.println("Conta Ativa?"+conta.isAtiva());
        System.out.println("Deposito:"+deposito);
        System.out.println("Saldo:"+conta.getSaldo());
        System.out.println("Resultado:"+resultado);

        if((conta.getSaldo()==101.00) && (resultado==true)){
            System.out.println("PASSOU no teste!!");
        }else{
            System.out.println("Não passou no teste!!");
        }
        }

    private static void DevedepositarNaContaAtivadaComSaldoZero() {
        Conta conta;
        boolean resultado;
        double deposito;
        //Deve depositar na conta ativada com saldo zero
        System.out.println("\nDeve depositar na Conta atividade com saldo zero.");

        conta=new Conta();
        conta.ativar();

        System.out.println("Saldo:"+conta.getSaldo());

        //Deposito Inicial
        deposito=100.00;
        resultado=conta.depositar(deposito);

        System.out.println("Conta Ativa?"+conta.isAtiva());
        System.out.println("Deposito:"+deposito);
        System.out.println("Saldo:"+conta.getSaldo());
        System.out.println("Resultado:"+conta.isAtiva());

        if((conta.getSaldo()==100.00) && (resultado==true)){
            System.out.println("PASSOU no teste!!");
        }else{
            System.out.println("Não passou no teste!!!");
        }
    }
}
