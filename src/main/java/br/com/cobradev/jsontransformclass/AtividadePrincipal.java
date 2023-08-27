package br.com.cobradev.jsontransformclass;

import lombok.Data;

import java.io.Serializable;

@Data
public class AtividadePrincipal implements Serializable {

    public String code;
    public String text;
}
