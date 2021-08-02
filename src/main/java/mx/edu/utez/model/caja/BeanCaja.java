package mx.edu.utez.model.caja;

public class BeanCaja {
    private int id_caja;
    private int Saldo_inicial;
    private int Saldo_Final;


    public BeanCaja(int id_caja, int saldo_inicial, int saldo_Final) {
        this.id_caja = id_caja;
        Saldo_inicial = saldo_inicial;
        Saldo_Final = saldo_Final;
    }

    public BeanCaja() {

    }

    public int getId_caja() {
        return id_caja;
    }

    public void setId_caja(int id_caja) {
        this.id_caja = id_caja;
    }

    public int getSaldo_inicial() {
        return Saldo_inicial;
    }

    public void setSaldo_inicial(int saldo_inicial) {
        Saldo_inicial = saldo_inicial;
    }

    public int getSaldo_Final() {
        return Saldo_Final;
    }

    public void setSaldo_Final(int saldo_Final) {
        Saldo_Final = saldo_Final;
    }
}
