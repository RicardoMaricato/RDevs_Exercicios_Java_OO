# RDevs_Exercicios_Java_OO
Exercício propostos da matéria de POO com Java, do programa RDevs.

Exercícios – Collections

1. Crie um código que insira 30 mil números numa ArrayList e pesquise-os. Vamos usar um método de System para cronometrar o tempo gasto:

public class TestaPerformance {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		Collection<Integer> teste = new ArrayList<>();
		long inicio = System.currentTimeMillis();
		int total = 30000;
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
	}	
}

Troque a ArrayList por um HashSet e verifique o tempo que vai demorar:
Collection<Integer> teste = new HashSet<>();
O que é lento? A inserção de 30 mil elementos ou as 30 mil buscas? Descubra computando o tempo gasto em cada for separadamente.
A diferença é mais que gritante. Se você passar de 30 mil para um número maior, como 50 ou 100 mil, verá que isso inviabiliza por completo o uso de uma List , no caso em que queremos utilizá-la essencialmente em pesquisas.

2. (conceitual, importante) Repare que, se você declarar a coleção e der new assim:
Collection<Integer> teste = new ArrayList<>();

em vez de:

ArrayList<Integer> teste = new ArrayList<>();

É garantido que vai ter de alterar só essa linha para substituir a implementação por HashSet.
Estamos aqui usando o polimorfismo para nos proteger que mudanças de implementação venham nos obrigar a alterar muito código. Mais uma vez: programe voltado a interface, e não à implementação!
Esse é um excelente exemplo de bom uso de interfaces, afinal, de que importa como a coleção funciona? O que queremos é uma coleção qualquer, isso é suficiente para os nossos propósitos!
Nosso código está com baixo acoplamento em relação a estrutura de dados utilizada: podemos trocá-la facilmente..
Esse é um código extremamente elegante e flexível. Com o tempo você vai reparar que as pessoas tentam programar sempre se referindo a essas interfaces menos específicas, na medida do possível:
métodos costumam receber e devolver Collection s, List s e Set s em vez de referenciar
diretamente uma implementação. É o mesmo que ocorre com o uso de InputStream e
OutputStream: eles são o suficiente, não há porque forçar o uso de algo mais específico.
Obviamente, algumas vezes não conseguimos trabalhar dessa forma e precisamos usar uma interface mais específica ou mesmo nos referir ao objeto pela sua implementação para poder chamar alguns métodos. Por exemplo, TreeSet tem mais métodos que os definidos em Set , assim como LinkedList em relação à List.
Dê um exemplo de um caso em que não poderíamos nos referir a uma coleção de elementos como Collection , mas necessariamente por interfaces mais específicas como List ou Set.

3. Faça testes com o Map , como visto nesse capítulo:

public class TestaMapa {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
			c1.deposita(10000);
		Conta c2 = new ContaCorrente();
			c2.deposita(3000);
		// cria o mapa
		Map mapaDeContas = new HashMap();
		// adiciona duas chaves e seus valores
			mapaDeContas.put("diretor", c1);
			mapaDeContas.put("gerente", c2);
		// qual a conta do diretor?
		Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
	}

}
Depois, altere o código para usar o generics e não haver a necessidade do casting, além da garantia de que nosso mapa estará seguro em relação a tipagem usada.
Você pode utilizar o quickfix do Eclipse para que ele conserte isso para você: na linha em que você está chamando o put , use o ctrl + 1 . Depois de mais um quickfix (descubra!) seu código deve ficar como segue:

// cria o mapa
Map<String, Conta> mapaDeContas = new HashMap<>();
Que opção do ctrl + 1 você escolheu para que ele adicionasse o generics para você?

4. Assim como no exercício 1, crie uma comparação entre ArrayList e LinkedList ,
para ver qual é a mais rápida para se adicionar elementos na primeira posição ( list.add(0,elemento)), como por exemplo:

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {
	public static void main(String[] args) {
		System.out.println("Iniciando...");
		long inicio = System.currentTimeMillis();
		// trocar depois por ArrayList
		List<Integer> teste = new LinkedList<>();
		for (int i = 0; i < 30000; i++) {
			teste.add(0, i);
		}
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo gasto: " + tempo);
	}
}
Seguindo o mesmo raciocínio, você pode ver qual é a mais rápida para se percorrer usando o (sabemos que o correto seria utilizar o enhanced for ou o Iterator ). Para isso,
insira 30 mil elementos e depois percorra-os usando cada implementação de List.
get(indice).
Perceba que aqui o nosso intuito não é que você aprenda qual é o mais rápido, o importante é perceber que podemos tirar proveito do polimorfismo para nos comprometer apenas com a interface. Depois, quando necessário, podemos trocar e escolher uma implementação mais adequada as nossas necessidades.
Qual das duas listas foi mais rápida para adicionar elementos à primeira posição?

5. Crie a classe Banco (caso não tenha sido criada anteriormente) no pacote
br.com.rd.rdevs.contas.modelo que possui uma List de Conta chamada contas  Repare que
numa lista de Conta, você pode colocar tanto ContaCorrente quanto ContaPoupanca por causa do polimorfismo.
Crie um método void adiciona(Conta c) , um método Conta pega(int x) e outro int
pegaQuantidadeDeContas() . Basta usar a sua lista e delegar essas chamadas para os métodos e coleções que estudamos.
Como ficou a classe Banco ?

6. No Banco, crie um método Conta buscaPorTitular(String nome) que procura por
uma Conta cujo titular seja equals ao nomeDoTitular dado.
Você pode implementar esse método com um for na sua lista de Conta, porém não tem uma performance eficiente.
Adicionando um atributo privado do tipo Map<String, Conta> terá um impacto significativo.
Toda vez que o método adiciona(Conta c) for invocado, você deve invocar put(c.getTitular(), c) no seu mapa. Dessa maneira, quando alguém invocar o método Conta
buscaPorTitular(String nomeDoTitular) , basta você fazer o get no seu mapa, passando nomeDoTitular como argumento!
Note, apenas, que isso é só um exercício! Dessa forma você não poderá ter dois clientes com o mesmo nome nesse banco, o que sabemos que não é legal.
Como ficaria sua classe Banco com esse Map ?

Exercícios – java.lang – String
1. Como fazer para saber se uma String se encontra dentro de outra? E para tirar os espaços em branco das pontas de uma String ? E para saber se uma String está vazia? E para saber quantos caracteres tem uma String ?
•	Tome como hábito sempre pesquisar o JavaDoc! Conhecer a API, aos poucos, é fundamental para que você não precise reescrever a roda!

2. (opcional) Escreva um método que usa os métodos charAt e length de uma String para
imprimir a mesma caractere a caractere, com cada caractere em uma linha diferente.

3. (opcional) Reescreva o método do exercício anterior, mas modificando ele para que imprima a String de trás para a frente e em uma linha só. Teste-a para "Socorram-me, subi no ônibus em Marrocos" e "anotaram a data da maratona".

4. Converta uma String para um número sem usar as bibliotecas do java que já fazem isso. Isso é, uma String x = "762" deve gerar um int i = 762.
•	Para ajudar, saiba que um char pode ser "transformado" em int com o mesmo valor numérico.

