package br.com.yuuorkillua.testeJavaBackend.Componentes;

import io.micrometer.common.lang.NonNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Veiculo {
    @NonNull
    private String nome;
    @NonNull
    private String marca;
    private int ano;
}
