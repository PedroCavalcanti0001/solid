package me.pedroeugenio.solid.service.reajuste;

import me.pedroeugenio.solid.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    private final List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {
        this.validacoes.forEach(validacaoReajuste -> validacaoReajuste.validar(funcionario, aumento));
        BigDecimal salarioReajustado = funcionario.getDadosPessoais().getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
