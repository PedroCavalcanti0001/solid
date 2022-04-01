package me.pedroeugenio.solid.service.reajuste;

import me.pedroeugenio.solid.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {

    void validar(Funcionario funcionario, BigDecimal aumento);
}
