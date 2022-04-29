programa
{
	
	funcao inicio()
	{
		inteiro q1,q50,q25,q10,q5,R,C,total
		escreva("DIgite a quantidade de moedas de R$1:")
		leia (q1)
		escreva("Digite a quantidade de moedas de R$0.50")
		leia (q50)
		escreva("Digite a quantidade de moedas de R$0.25")
	     leia (q25)
	     escreva("Digite a quantidade de moedas de R$0.10")
	     leia (q10)
	     escreva("Digite a quantidade de moedas de R$0.05")
	     leia(q5)
	     total= q1*100+q50*50+q25*25+q10*10+q5*5
	     R=total / 100
	     C=total % 100
	     escreva("voce economizou" + R +"reais e" + C + "centavos")
	     
	     
	     
	     
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 606; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */