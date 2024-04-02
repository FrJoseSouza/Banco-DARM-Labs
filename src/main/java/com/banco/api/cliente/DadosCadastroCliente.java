package com.banco.api.cliente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
//import com.banco.api.endereco.DadosEndereco;

public record DadosCadastroCliente(
    @NotBlank
    String nome,

    @NotBlank
    @Email
    String email

    //@NotBlank
    //String telefone

    //@NotNull @Valid DadosEndereco endereco
    ) {
    
}
