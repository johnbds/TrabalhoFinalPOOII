package view;

import controller.FuncionarioController;
import model.Funcionario;

public class cadastroFuncionario {

	public static void main(String[] args) {
		
		FuncionarioController funcionarioController = new FuncionarioController();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setId(1);
		funcionario.setNome("Flávio");
		funcionario.setSalario(2000);
		
		funcionarioController.salvar(funcionario);
	}

}
