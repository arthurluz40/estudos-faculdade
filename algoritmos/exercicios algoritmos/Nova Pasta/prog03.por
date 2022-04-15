programa
{
	
	funcao inicio()
	{
		real s,j2,j1
		escreva("Digite o seu salario")
		leia(s)
		se(s<=2000){
			escreva("isento")
			
		}
		senao se(s<=3000){
			
			escreva((s - 2000)* 0.08 )
			}
			senao se(s<=4500){
				j1= 1000 * 0.08 + (s - 3000) * 0.18
				escreva(j1)
				}
				senao{
					j2= 1000 * 0.08 + 1500 * 0.18 + (s - 4500) * 0.28
					escreva(j2)
					
				
					 
				}
			
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 373; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */