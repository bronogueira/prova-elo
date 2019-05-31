package com.elo.prova.exame2.model;

import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class PessoaContatoModelTest {

    @Test
    public void pessoaContatoModelTest() {
        PessoaModel pessoaModel = new PessoaModel();
        pessoaModel.setId(1L);
        pessoaModel.setNome("Bruno");
        pessoaModel.setDataNascimento(Date.valueOf("1987-09-25"));

        PessoaContatoModel pessoaContatoModel = new PessoaContatoModel();
        pessoaContatoModel.setId(1L);
        pessoaContatoModel.setNome("Jaqueline");
        pessoaContatoModel.setPessoaModel(pessoaModel);

        assertEquals(pessoaContatoModel.getId().longValue(), 1L);
        assertEquals(pessoaContatoModel.getNome(), "Jaqueline");
        assertEquals(pessoaContatoModel.getPessoaModel().getNome(), "Bruno");
    }

}