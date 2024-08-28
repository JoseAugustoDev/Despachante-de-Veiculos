package dados;

public class Transferencia {
    private int id;
    private int id_processo;
    private String nota_fiscal;
    private String doc_novo_dono;
    private String doc_antigo_dono;
    private String recibo_preenchido;
    private String comprovante_residencia;
    private boolean vistoria_feita;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_processo() {
        return id_processo;
    }

    public void setId_processo(int id_processo) {
        this.id_processo = id_processo;
    }

    public String getNota_fiscal() {
        return nota_fiscal;
    }

    public void setNota_fiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

    public String getDoc_novo_dono() {
        return doc_novo_dono;
    }

    public void setDoc_novo_dono(String doc_novo_dono) {
        this.doc_novo_dono = doc_novo_dono;
    }

    public String getDoc_antigo_dono() {
        return doc_antigo_dono;
    }

    public void setDoc_antigo_dono(String doc_antigo_dono) {
        this.doc_antigo_dono = doc_antigo_dono;
    }

    public String getRecibo_preenchido() {
        return recibo_preenchido;
    }

    public void setRecibo_preenchido(String recibo_preenchido) {
        this.recibo_preenchido = recibo_preenchido;
    }

    public String getComprovante_residencia() {
        return comprovante_residencia;
    }

    public void setComprovante_residencia(String comprovante_residencia) {
        this.comprovante_residencia = comprovante_residencia;
    }

    public boolean isVistoria_feita() {
        return vistoria_feita;
    }

    public void setVistoria_feita(boolean vistoria_feita) {
        this.vistoria_feita = vistoria_feita;
    }
}
