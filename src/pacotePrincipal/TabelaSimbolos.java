/*
 * Implementação da tabela de símbolos utilizando
 * floresta de árvores binárias
 * 
 */

package pacotePrincipal;

class Tabela {
	String nome[] = new String[100];
	
	String atributo[] = new String[100];
 
	int nivel[] = new int[100];
 
	int esq[] = new int[100];
 
	int dir[] = new int[100];
}

public class TabelaSimbolos {
	//Numero maximo de niveis possiveis
	final static int NIVELMAX = 100000;
	
	int escopo[] = new int[10];
	
	//Numero do nivel atual
	int nivel;
	
	//Indice do ultimo elemento da Tabela de Simbolos
	int ultimoElemento;
	
	// Indice do primeiro elemento da Tabela de Simbolos
	int raiz;
	
	Tabela tb;
	
	public TabelaSimbolos() {
		tb = new Tabela();
		
		/* Considera-se que a primeira posicao da tabela 
		 * eh a de indice 1. L eh o final da arvore binaria */
		ultimoElemento = 1;    
		
		raiz = 0;
		
		/* O primeiro nivel eh o 1 */
		nivel = 1;           
		
		/* Escopo[0] contem o indice do primeiro elemento */
		escopo[nivel] = 0;
	}
	
	void exibirErro(int num) {
		switch (num) {
			case 1: System.out.print("Tabela de Simbolos cheia.\n");  break;
			case 2: System.out.print("Este item nao foi encontrado.\n");  break;
			case 3: System.out.print("Este item ja foi inserido.\n"); break; 
			default: ;
		}
	}

	public void abrirBloco()  {
		nivel++;
		if (nivel > NIVELMAX)
			exibirErro(1);
		else
			escopo[nivel] = 0; 
	}
 
	public void sairBloco() {
		if (escopo[nivel] != 0)
			ultimoElemento = escopo[nivel];
		nivel--;
	}
 
	/* Pesquisa o simbolo "x" e retorna o indice  da Tabela de simbolos 
	 *onde ele se encontra */
	public void obter(String x) { 
		int n, aux, achou, k, n1, n2;
		
		k = -1;
		achou = 0;
		n = nivel;
		while ((n > 0) && (achou == 0)) {
			k = escopo[n];
			while ((k != 0) && (achou == 0)) {
				int compara = x.compareTo(tb.nome[k]);
				if (compara == 0)
					achou = 1;
				else if (compara < 0)
					k = tb.esq[k];
				else
					k = tb.dir[k];
			}
			n--;
		}
		if (achou == 1)
			System.out.println(String.format("Item %s está no nível %d, índice %d.", x, tb.nivel[k], k));
		if (achou != 1)
			exibirErro(2);
	}

	/* Instala o simbolo "X" com  o atributo 
	 * atribut na Tabela de Simbolos */
	public void adicionar(String X, String atributo) { 
		int S, i, aux;
 
      	aux = 1;
       	S = escopo[nivel];
       	i = S;
       	while (S != 0) {
       		i = S;
               int compara = X.compareTo(tb.nome[S]);
               if (compara == 0) {
            	   S = 0;
            	   aux = 0;
               } 
               else if (compara < 0)
                	S = tb.esq[S];
               else 
                	S = tb.dir[S];
        }
        if ((ultimoElemento < NIVELMAX + 1) && (aux != 0)) {
        	tb.nivel[ultimoElemento] = nivel;
        	tb.atributo[ultimoElemento] = atributo;
        	tb.nome[ultimoElemento] = X;
        	tb.esq[ultimoElemento] = 0;
        	tb.dir[ultimoElemento] = 0;
        	if (escopo[nivel] == 0)
        		escopo[nivel] = ultimoElemento;
        	else {
        		int comp = X.compareTo(tb.nome[i]);
        		if (comp < 0)
        			tb.esq[i] = ultimoElemento;
                else
                  	tb.dir[i] = ultimoElemento;
        	}
        	ultimoElemento++; 
        }
    }
}