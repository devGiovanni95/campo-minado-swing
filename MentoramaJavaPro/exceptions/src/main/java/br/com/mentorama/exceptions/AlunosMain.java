package br.com.mentorama.exceptions;


public class AlunosMain {

    public static void main(String[] args)  {
        AlunoService alunoService = new AlunoService();
        alunoService.findAll().stream().forEach(System.out::println);
    }
}