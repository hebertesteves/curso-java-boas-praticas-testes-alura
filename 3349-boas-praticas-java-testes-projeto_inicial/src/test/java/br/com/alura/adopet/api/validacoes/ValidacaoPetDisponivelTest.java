package br.com.alura.adopet.api.validacoes;

import br.com.alura.adopet.api.dto.SolicitacaoAdocaoDto;
import br.com.alura.adopet.api.repository.PetRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ValidacaoPetDisponivelTest {

    @InjectMocks
    private ValidacaoPetDisponivel validcao;

    @Mock
    private PetRepository petRepository;

    @Test
    void deveriaPermitirSolicitacaoDeAdocaoPet() {
        // Arrange
        SolicitacaoAdocaoDto dto = new SolicitacaoAdocaoDto(
                7L,
                2L,
                "Motivo qualquer"
        );

        // Assert + Act
        Assertions.assertDoesNotThrow(() -> this.validcao.validar(dto));
    }
}
