package Caixa;

public class Caixa {
    private int numero;
    private Boolean preferencia;
    private Boolean pequenasCompras;

    public Caixa(int numero, Boolean preferencia, Boolean pequenasCompras) {
        this.numero = numero;
        this.preferencia = preferencia;
        this.pequenasCompras = pequenasCompras;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Boolean isPreferencia() {
        return this.preferencia;
    }

    public Boolean getPreferencia() {
        return this.preferencia;
    }

    public void setPreferencia(Boolean preferencia) {
        this.preferencia = preferencia;
    }

    public Boolean isPequenasCompras() {
        return this.pequenasCompras;
    }

    public Boolean getPequenasCompras() {
        return this.pequenasCompras;
    }

    public void setPequenasCompras(Boolean pequenasCompras) {
        this.pequenasCompras = pequenasCompras;
    }
}