package aula;

public class teste {

	public static void main(String[] args) {
		
		PFisica pf = new PFisica();
		PJuridica pj = new PJuridica();
		PFisicaController repPF = new PFisicaController();
		PJuridicaController repPJ = new PJuridicaController();
		
		pf.setNome("teste pf");
		pf.setCpf(123456789);
		pj.setNome("teste pj");
		pj.setCnpj(987654321);
		
		if(repPF.salvaPessoa(pf)) {
			System.out.println("Pessoa física salva");
		}
		if(repPJ.salvaPessoa(pj)) {
			System.out.println("Pessoa jurídica salva");
		}	
		
		System.out.println("PF:" + repPF.retornaListaPessoa().get(0).getNome() +" - Cpf:" + repPF.retornaListaPessoa().get(0).getCpf());
		System.out.println("PJ:" + repPJ.retornaListaPessoa().get(0).getNome() +" - Cnpj:" + repPJ.retornaListaPessoa().get(0).getCnpj());

		pf.setNome("teste edicao pf");
		pf.setCpf(75948611);
		pj.setNome("teste edicao pj");
		pj.setCnpj(15362411);
		
		if(repPF.atualizaPessoa(pf)) {
			System.out.println("Pessoa física atualizada");
		}
		if(repPJ.atualizaPessoa(pj)) {
			System.out.println("Pessoa jurídica atualizada");
		}
		
		System.out.println("PF:" + repPF.retornaListaPessoa().get(0).getNome() +" - Cpf:" + repPF.retornaListaPessoa().get(0).getCpf());
		System.out.println("PJ:" + repPJ.retornaListaPessoa().get(0).getNome() +" - Cnpj:" + repPJ.retornaListaPessoa().get(0).getCnpj());
		
		if(repPF.deletaPessoa(pf.getCpf())) {
			System.out.println("Pessoa física deletada");
		}
		
		if(repPJ.deletaPessoa(pj.getCnpj())) {
			System.out.println("Pessoa jurídica deletada");
		}
		
	}

}
