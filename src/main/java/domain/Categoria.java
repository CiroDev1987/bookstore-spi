package domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
public class Categoria {

    private Integer id;
    private String nome;
    private String descrição;
    private List<Livro> livros = new ArrayList<>();

    public Categoria() {
        super();
        //contructor
    }

    public Categoria(Integer id, String nome, String descrição) {
        super();
        this.id = id;
        this.nome = nome;
        this.descrição = descrição;
    }
}
