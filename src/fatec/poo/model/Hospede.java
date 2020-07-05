package fatec.poo.model;

/**
 *
 * @author fernandoHS
 * 
 */
public class Hospede extends Pessoa{
    private String cpf;
    private double txDesconto;
    private QuartoHotel quartoHotel;

    public Hospede(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getTxDesconto() {
        return txDesconto;
    }

    public void setTxDesconto(double txDesconto) {
        this.txDesconto = txDesconto;
    }

    public QuartoHotel getQuartoHotel() {
        return quartoHotel;
    }

    public void setQuartoHotel(QuartoHotel quartoHotel) {
        this.quartoHotel = quartoHotel;
    }
    
}
