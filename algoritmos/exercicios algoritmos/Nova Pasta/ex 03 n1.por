programa
{
	
	funcao inicio()
	{
		cadeia moeda
		real valor, vf
		escreva("Digite o valor em reais")
		leia (valor)
		escreva("Digite uma moeda")
		leia (moeda)
	     se(moeda =="d"){
	     	vf=valor/5.15
	     	escreva("O valor correspondente na moeda selecionada é" + vf)
	     }senao se(moeda =="e"){
	     	vf=valor/6.08
	     	escreva("O valor correspondente na moeda selecionada é" + vf)
	     }senao se (moeda =="l"){
	     	vf=valor/6.13
	     	escreva("O valor correspondente na moeda selecionada é" + vf)
	     }senao{
	     	escreva("voce informou uma opção invalida")
	     }
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 603; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */