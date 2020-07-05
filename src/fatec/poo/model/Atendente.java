package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author fernandoHS
 */
public class Atendente extends Pessoa{
    private String regFunc;
    private String turno;
    private ArrayList<QuartoHotel> quartoHotel = new ArrayList<QuartoHotel>();

    public Atendente(String nome, String regFunc) {
        super(nome);
        this.regFunc = regFunc;
    }

    public String getRegFunc() {
        return regFunc;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public void addQuartoHotel(QuartoHotel q){
        quartoHotel.add(q);
        q.setAtendente(this);
    }
    
    public ArrayList<QuartoHotel> getQuartoHotel() {
        return quartoHotel;
    }
    
}
