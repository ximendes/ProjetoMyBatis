package ber.com.demo.demo.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ViagemDto {

    private Long id;
    private String nomeViagem;
    private String nomeOnibus;
}
