import java.util.Scanner;
/**
 * <h1>Desafio Trilha-Java-Básico</h1>
 * <p>Este programa tem como objetivo implementar o desafio da trilha java básico da DIO
 * criando um sistema para cadastrar um cliente em um banco a partir do seu nome, agencia,
 * conta e saldo inicial.</p>
 * <b>Note:</b>A escolha de criar um método para cada cadastro foi realizada com o objetivo de praticar 
 * o conhecimento adquirido e testar a capacidade de enviar os comandos de entrada direto
 * para o método criado.
 * 
 * @author Edgar Alves de Jesus
 * @since 09/10/2024
 */

public class ContaTerminal {
    int numeroConta;
    int numeroAgencia;
    String nomeCliente;
    double saldoConta;

    /**
     * Este método cadastra o nome do cliente 
     * @param nome recebe o nome a ser cadastrado
     */
    public void cadastrarNomeCliente(String nome){
        nomeCliente = nome;
    }

    /**
     * Este método cadastra o número da agência do cliente
     * @param agencia recebe o número da agência a ser cadastrado
     */
    public void cadastrarAgenciaCliente(int agencia){
        numeroAgencia = agencia;
    }

    /**
     * Este método cadastra o número da conta do cliente
     * @param conta recebe o número da conta a ser cadastrado
     */
    public void cadastrarContaCliente(int conta){
        numeroConta = conta;
    }

    /**
     * Este método cadastra o saldo inicial da conta do cliente
     * @param saldo recebe o saldo inicial a ser cadastrado
     */
    public void cadastrarSaldoCliente(double saldo){
        saldoConta = saldo;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal contaCliente = new ContaTerminal();
    
        System.out.println("Bem vindo ao nosso banco, para realizar o seu cadastro solicitamos as seguintes informações:");
        System.out.println("Por favor, digite o seu nome completo: ");
        contaCliente.cadastrarNomeCliente(scanner.nextLine());
        System.out.println("Por favor, digite o número da Agência: ");
        contaCliente.cadastrarAgenciaCliente(scanner.nextInt());
        System.out.println("Por favor, digite o número da sua conta: ");
        contaCliente.cadastrarContaCliente(scanner.nextInt());
        System.out.println("Por favor, digite o valor a ser depositado para início da conta: ");
        contaCliente.cadastrarSaldoCliente(scanner.nextDouble());

        System.out.printf("Olá %s obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo de R$%.2f já está disponível para saque.%n", contaCliente.nomeCliente, contaCliente.numeroAgencia, contaCliente.numeroConta, contaCliente.saldoConta);

        scanner.close();
    }
}

