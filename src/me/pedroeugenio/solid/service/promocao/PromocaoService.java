package me.pedroeugenio.solid.service.promocao;

import me.pedroeugenio.solid.ValidacaoException;
import me.pedroeugenio.solid.model.Cargo;
import me.pedroeugenio.solid.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida) {
        final Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();
        if (cargoAtual == Cargo.GERENTE) {
            throw new ValidacaoException("Gerentes Não podem ser promovidos!");
        }

        if (metaBatida) {
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throw new ValidacaoException("Funcionario não bateu a meta.");
        }
    }
}
