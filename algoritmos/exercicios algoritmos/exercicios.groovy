lista de exercicios 

quetao 01
real x,y;
imprima"Digite o valor de x";
leia x;
y<-2*(x**2)-3;
imprima"F(x)=",y);
fimprog 

questao 2
real f,g,h,m,x,fg,fh,fog,fom;
imprima"digite o valor de x: ";
leia x ;
f<-(2*x**2)+(3*x);
g<-raiz((3*x**2)+4);
h<-1.0/x;
m=seno(x);

fg<-f+g;
fh<-f*h;
fog<-(2*g**2)+(3*g);
fom<-(2*m**2)+(3*m);

imprima"f(x)+g(x)=",fg;
imprima"f(x)+g(x)=",fh;
imprima"f(g(x))=",fog
imprima"f(m(x))=",fom

fimprog


questao 03
int frango; 
real custo;
imprima"Digite a quantidade de frangos na granja:"
leia frango;
custo<-frango*4+frango*(3.50*2);
imprima"cutos total de aneis de frango:",custo;
fimprog

questao 4
int lata,g600,g2l;
real litro;
imprima"informe a quantidade de lata 350ml: ";
leia lata;
imprima"informe a quantidade de garrafa 600ml:";
leia g21;
litro<-(lata *0.350)+(g600*0.6)+(g21*2);
imprima"quantidade de litros adquirida:",litro;

fim prog

questao 5  

real sal,sal15,salaldesc ;
imprima "salario bruto anual:";
leia sal;
sal15<-sal+(sal*(15.0/100.0));
saldesc=sal15-(sal15*(8.0/100.0));
imprima"salario:",sal;
imprima"salario com acrescimo:",sal15;
imprima"salario descontado:",salaldesc;
fim prog


questao 8
real valor,ca,f
imprima"Digite o valor da conta";
leia valor
ca<-trunca(valor/3);
f<-valor-2*ca;
imprima"Carlos e andre pagaran R$"ca;
imprima"felipe pagara R$",f;
fimprog


questao 10
real plg,vp,ql
imprima"Digite o preco do litro da gasolina";
leia plg
imprima"Digite o valor do pagamento";
leia vp
ql<-vp/plg
imprima"a quantidade de litros e:",ql;
fimprog 

questao 11
int num,cent,dez,uni
real valor
imprima"Digite o numero";
leia num;
cent<-num div 100;
dez<-(num%100)div10;
uni<-(num%100)%10;
imprima"centena:",cent;
imprima"dezena:",dez:
imprima"unidade:"uni;
fimprog


questao 12
int q1,q50,q25,q10,q5,ivalor,icent
real valor 
imprima"Digite a quantidade de moedas de 1 real";
leia q1;
imprima"Digite a quantidade de moedas de 0.50 centavos";
leia q50;
imprima"Digite a quantidade de moedas de 0.25 centavos";
leia q25;
imprima"Digite a quantidade de moedas de 0.10 centavos";
leia q10;
imprima"Digite a quantidade de moedas de 0.05 centavos";
leia q5;
valor<-q1+q50*0.5+q25*0.25+q10*0.10+q5*0.05;
ivalor<-trunca(valor);
icent<-trunca((valor-ivalor)*100)
imprima"Pedrinho economizou",ivalor"reais e "icent,"centavos";
fimprog


































