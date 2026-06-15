package br.com.alura.adopet.api.validacoes;

import br.com.alura.adopet.api.dto.SolicitacaoAdocaoDto;
import br.com.alura.adopet.api.exception.ValidacaoException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidacaoPetDisponivelTest {
    @Test
    void deveriaPermitirSolicitacaoDeAdocaoPet() {
        // Arrange
        SolicitacaoAdocaoDto dto = new SolicitacaoAdocaoDto(
                7 L,
                2L,
                "Motivo qualquer"
        );

        ValidacaoPetDisponivel validacao = new ValidacaoPetDisponivel();

        // Assert + Act
        Assertions.assertDoesNotThrow(() -> validacao.validar(dto));
    }
}
