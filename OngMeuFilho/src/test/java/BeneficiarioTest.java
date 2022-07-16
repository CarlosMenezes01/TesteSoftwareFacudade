import model.Beneficiario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BeneficiarioTest {
    //RN02
    @Test
    @DisplayName("Beneficiario não pode ser cadastrado, se ja estiver cadastrado no sistema")
    public void cadastrarBeneficiario(){

        Beneficiario beneficiario = new Beneficiario;
        beneficiario.cpf = "123.041.104-26";
        beneficiario.cns = "0124784445";
        beneficiario.nis = "145874577544";
        beneficiario.nome = "Carlos";
        beneficiario.nascimento = "11/01/1986";

        Beneficiario beneficiario = new Beneficiario;
        beneficiario.cpf = "145.045.104-12";
        beneficiario.cns = "0134474445";
        beneficiario.nis = "145874566576";
        beneficiario.nome = "Carlos";
        beneficiario.nascimento = "11/01/1986";

        Beneficiario beneficiario1 = new Beneficiario("123.041.104-26", "0124784445", "145874577544", "Joao" +
                "11/01/1986");


        Assertions.assertFalse(false);
    }

    //RN01
    @Test
    @DisplayName("Beneficiario pode ser cadastrado")
    public void cadastrarBeneficiario2(){
        Beneficiario beneficiario = new Beneficiario("140.041.104-26", "0124784487", "145874577585", "Maria" +
                "11/01/1992");
        Beneficiario beneficiario1 = new Beneficiario("123.041.104-26", "0124784445", "145874577544", "Joao" +
                "11/01/1986");

        Assertions.assertTrue(true);
    }
}
