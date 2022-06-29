package controller;

import java.util.List;

import javax.swing.JOptionPane;

import model.Funcionario;
import repositorio.FuncionarioRepositorio;

public class FuncionarioController implements IController<Funcionario>{

	FuncionarioRepositorio repositorio = new FuncionarioRepositorio();
	
	public boolean salvar(Funcionario modelo) {
		if (modelo.getNome().isEmpty()==false) {
			System.out.println(modelo.getNome());
			System.out.println("Pode salvar!!!");
			return repositorio.salvar(modelo);
		}else {
			JOptionPane.showMessageDialog(null,
					"Existem dados obrigatórios que não foram preenchidos",
			        "Impossível continuar",
			        JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}

	public boolean alterar(Funcionario modelo) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean excluir(Funcionario modelo) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean buscar(Funcionario modelo) {
		// TODO Auto-generated method stub
		return false;
	}

	public Funcionario buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Funcionario> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
}
