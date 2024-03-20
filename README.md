# Resposta das questões técnicas do processo seletivo Target

Repositório contendo as resoluções das questões do teste técnico do estágio da Target

### Questão 1

O resultado final irá imprimir <b>91</b>, já que é uma sequência aritmética em que é aumentado o valor fixo de 1 + termo anterior.

### Questão 2
Foi criado um códido em Java que recebe um número e imprime na tela caso esse número pertença ou não na sequência de Fibonacci.<br/>

[Fibonacci.java](src%2FFibonacci%2FFibonacci.java)

### Questão 3

a) O próximo elemento é **9**.  
**Explicação:** Esta sequência é composta por números ímpares consecutivos.

b) O próximo elemento é **128**.  
**Explicação:** Cada número é o dobro do anterior.

c) O próximo elemento é **49**.  
**Explicação:** Esta sequência consiste nos quadrados dos números naturais começando de 0.

d) O próximo elemento é **64**.  
**Explicação:** Cada número é o quadrado do próximo número par.

e) O próximo elemento é **13**.  
**Explicação:** Esta é a sequência de Fibonacci.

f) O próximo elemento é **200**.  
**Explicação:** Consiste em uma sequência de número que quando escrito por extenso começam com a letra 'd'.

### Questão 4

Existem 3 interruptores em uma sala, e 3 lâmpadas em 3 salas diferentes, estes interruptores são conectados a essas salas. Para descobrir à quem pertence cada interruptor com apenas duas idas às salas, faria dessa maneira:

Na primeira ida:

- Ligo o interruptor 1 por 5 minutos e o desligo. Em seguida, ligo o interruptor 2 e, em seguida, dirijo-me a uma das três salas.
- Se a lâmpada estiver acesa, ela pertence ao interruptor 2. Se estiver desligada e quente, pertence ao interruptor 1. Se estiver desligada e fria, pertence ao interruptor 3.

Na segunda ida:

- Tendo conhecimento de um dos interruptores, vou analisar os dois restantes, deixo um interruptor ligado e outro desligado.
- Vou até outra sala e caso a lâmpada esteja ligada, o interruptor ligado é o da sala. Se não estiver ligado, o interruptor desligado é o da sala.

### Questão 5

Foi criado um código em Java para reverter uma string a partir de uma string digitada pelo usuário.

[ReverseString.java](src%2FReverseString%2FReverseString.java)