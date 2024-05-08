public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public void setNumero(int reqNumero){
        numero = reqNumero;
    }

    public void setAgencia(String reqAgencia){
        agencia = reqAgencia;
    }

    public void setNomeCliente(String reqNomeCliente){
        nomeCliente = reqNomeCliente;
    }

    public void setSaldo(double reqSaldo){
        saldo = reqSaldo;
    }

    public String imprimirDadosConta(){
        String message = "Olá "+nomeCliente
                +", obrigado por criar uma conta em nosso banco, sua agência é "
                +agencia+", conta "
                +numero+" e seu saldo "
                +saldo+" já está disponível para saque.";
        return message;
    }
}
