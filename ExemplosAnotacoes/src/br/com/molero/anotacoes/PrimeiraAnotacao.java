package br.com.molero.anotacoes;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface PrimeiraAnotacao {

    String nome();

    int idade();

    String[] livros();

    String genero() default "Masculino";

}
