package br.com.cobradev.jsontransformclass;

import lombok.Data;

import java.io.Serializable;

@Data
public class Billing implements Serializable {

    public boolean free;
    public boolean database;
}
