package listas;

//public class exemploProva {
	
		public class Numeros{
			int qtdItens; //Numero de itens da lista
			int tamanho; //Tamanho da lista / quantos itens ocupam a lista
			int[] itens; //metodo construtor
			
			Numeros(int n){
				this.qtdItens = n;
				this.tamanho = 0;
				itens = new int[n];
			}
			
			public void adicionar(int n) {
				itens[tamanho] = n;
				tamanho++;
			}
			
			public int getNrItens() {
				return qtdItens;
			}
			
			public int getTamanho() {
				return tamanho;
			}
			
			public void imprimir() {
				System.out.print("[");
				for(int i = 0; i <getTamanho(); i++) {
					System.out.print(itens[i]);
					if(i < getTamanho()-1)
						System.out.print(",");
				}
				System.out.print("]\n");
			}
		}

//}

