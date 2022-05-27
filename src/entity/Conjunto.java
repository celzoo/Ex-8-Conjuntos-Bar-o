package entity;

import java.util.HashSet;

public class Conjunto {
	private HashSet<String> conjunto = new HashSet<String>();
	
	
	
	
	public void setConjunto(HashSet<String> conjunto) {
		this.conjunto = conjunto;
	}
	
	public void adicona(String str) {
		conjunto.add(str);
		
	}
	public void verifica(String str) {
		
		if(conjunto.contains(str)==true) {
			System.out.println("A palavra digitada esta no conjunto");
		}
		else {
			System.out.println("A palavra digitada não esta no conjunto");
		}
		
	
	}
	
	public HashSet<String> uniao(Conjunto segundoConjunto) {
		HashSet<String> conjuntoUnificado = new HashSet<String>();
		for(String str : this.conjunto){
			conjuntoUnificado.add(str);
		}
		for(String str : segundoConjunto.conjunto){
			conjuntoUnificado.add(str);
		}
		return conjuntoUnificado;
	}
	public HashSet<String> inter(Conjunto segundoConjunto) {
		HashSet<String> conjuntoInterseicao = new HashSet<String>();
		for(String str : this.conjunto){
			if (segundoConjunto.conjunto.contains(str)) {
				conjuntoInterseicao.add(str);
			}
		}
		return conjuntoInterseicao;
	}
	public HashSet<String> menos(Conjunto segundoConjunto) {
		HashSet<String> cojuntoMenos = new HashSet<String>();
		for(String str : this.conjunto){
			if (!segundoConjunto.conjunto.contains(str)) {
				cojuntoMenos.add(str);
			}
		}
		return cojuntoMenos;
	}
	
}