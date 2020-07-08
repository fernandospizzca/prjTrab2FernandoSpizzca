package fatec.poo.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author fernandoHS
 */
public class QuartoHotel {
    private int numQuarto;
    private double valorDiaria;
    private boolean situacao;
    private String dataEntrada;
    private double totalFaturado;
    private Hospede hospede;
    private Atendente atendente;

    public QuartoHotel(int numQuarto, double valorDiaria) {
        this.numQuarto = numQuarto;
        this.valorDiaria = valorDiaria;
        this.situacao = false;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }
    

    public double getTotalFaturado() {
        return totalFaturado;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }
    
    public void reservar(Hospede h, Atendente a){
        this.hospede = h;
        this.atendente = a;
        this.situacao = true;
        this.hospede.setQuartoHotel(this);
    }
    
    public double liberar(int qtdDias, double txDesconto){
        double totalHospedagem;
        
        totalHospedagem = (qtdDias * valorDiaria) * (1 - hospede.getTxDesconto()/100);
        this.totalFaturado += totalHospedagem;
        
        this.hospede.setQuartoHotel(null);
        this.atendente.getQuartoHotel().remove(this);
        this.dataEntrada = null;
        this.hospede = null;
        this.atendente = null;
        this.situacao = false;
     
        return totalHospedagem;
    }
    
}
