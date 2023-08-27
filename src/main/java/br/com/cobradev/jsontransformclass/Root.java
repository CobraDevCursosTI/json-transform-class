package br.com.cobradev.jsontransformclass;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Root implements Serializable {

    public String abertura;
    public String situacao;
    public String tipo;
    public String nome;
    public String fantasia;
    public String porte;
    public String natureza_juridica;
    public List<Qsa> qsa;
    public String logradouro;
    public String numero;
    public String municipio;
    public String bairro;
    public String uf;
    public String cep;
    public String email;
    public String telefone;
    public String data_situacao;
    public String motivo_situacao;
    public String cnpj;
    public Date ultima_atualizacao;
    public String status;
    public String complemento;
    public String efr;
    public String situacao_especial;
    public String data_situacao_especial;
    public List<AtividadePrincipal> atividade_principal;
    public List<AtividadesSecundaria> atividades_secundarias;
    public String capital_social;
    public Extra extra;
    public Billing billing;
}
