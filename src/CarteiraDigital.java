import java.util.ArrayList;
import java.util.List;

public class CarteiraDigital {
    private double saldo;
    private List<String> historicoTransacoes;

    public CarteiraDigital() {
        this.saldo = 0;
        this.historicoTransacoes = new ArrayList<>();
    }

    public void adicionarSaldo(double valor) {
        this.saldo += valor;
        historicoTransacoes.add("Adicionado: R$" + valor);
        System.out.printf("Saldo adicionado: R$%.2f. Saldo atual: R$%.2f.%n", valor, saldo);
    }

    public void realizarPagamento(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            this.saldo -= valor;
            historicoTransacoes.add("Pago: R$" + valor);
            System.out.printf("Pagamento realizado: R$%.2f. Saldo restante: R$%.2f.%n", valor, saldo);
        }
    }

    public void verificarSaldo() {
        System.out.printf("Saldo disponível: R$%.2f.%n", saldo);
    }

    public List<String> getHistoricoTransacoes() {
        return historicoTransacoes;
    }

    public static void main(String[] args) {
        CarteiraDigital minhaCarteira = new CarteiraDigital();
        minhaCarteira.adicionarSaldo(100);
        minhaCarteira.realizarPagamento(30);
        minhaCarteira.verificarSaldo();
        System.out.println("Histórico de Transações: " + minhaCarteira.getHistoricoTransacoes());
    }
}