package dados;

public class Emplacamento {
    private int id;
    private int id_processo;
    private String nota_fiscal;
    private String nome_dono_veiculo;
    private String modelo_veiculo;
    private String marca_veiculo;
    private String data_de_venda;

    public int getId() {
        return id;
    }

    public int getId_processo() {
        return id_processo;
    }

    public String getNota_fiscal() {
        return nota_fiscal;
    }

    public String getNome_dono_veiculo() {
        return nome_dono_veiculo;
    }

    public String getModelo_veiculo() {
        return modelo_veiculo;
    }

    public String getMarca_veiculo() {
        return marca_veiculo;
    }

    public String getData_de_venda() {
        return data_de_venda;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_processo(int id_processo) {
        this.id_processo = id_processo;
    }

    public void setNota_fiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

    public void setNome_dono_veiculo(String nome_dono_veiculo) {
        this.nome_dono_veiculo = nome_dono_veiculo;
    }

    public void setModelo_veiculo(String modelo_veiculo) {
        this.modelo_veiculo = modelo_veiculo;
    }

    public void setMarca_veiculo(String marca_veiculo) {
        this.marca_veiculo = marca_veiculo;
    }

    public void setData_de_venda(String data_de_venda) {
        this.data_de_venda = data_de_venda;
    }
}
