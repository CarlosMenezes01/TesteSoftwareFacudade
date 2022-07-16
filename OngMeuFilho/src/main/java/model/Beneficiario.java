package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class Beneficiario {

    public String cpf;
    public String cns;
    public String nis;
    public String nome;
    public String nascimento;

    Mae mae;
    List<Acompanhamento> acompanhamento;
    List<Kit> kit;

    public Beneficiario(String s, String s1, String s2, String s3) {
    }

    public void VarificarIdade() {
        // TODO code application logic here

        Calendar cal = GregorianCalendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);

        int mesAtual = cal.get(Calendar.MONTH);
        int diaAtual = cal.get(Calendar.DAY_OF_MONTH);

        Scanner in = new Scanner(System.in);
        System.out.println("Dia, mes e ano de nascimento");
        int diaNasc = in.nextInt();
        int mesNasc = in.nextInt();
        int anoNasc = in.nextInt();
        int idade = (anoAtual - anoNasc);
        System.out.println("voce tem  : " + idade + " anos.");

        if (idade >= 1 && idade <= 5) {
            System.out.printf("Tem direito ao Kit");
        } else {
            System.out.printf("Não tem direito ao Kit");
        }
    }
    public ArrayList<Beneficiario> beneficiario = new ArrayList<Beneficiario>();

    public boolean cadastrarBeneficiario(Beneficiario ben) {
        if (beneficiario.size() <= 3) {
            System.out.println("Só tem direito a cadastrar 3 filhos");
            return false;
        } else {
            beneficiario.add(ben);
        }
        return true;
    }

    public int limiteBeneficiario(int bene) {
        int total = 0;
        for (Beneficiario b : this.beneficiario) {
            if (total < bene) {
                total++;
            }
        }
        return total;
    }

}
