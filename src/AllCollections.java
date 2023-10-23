import java.util.*;

public class AllCollections {
    public static void main(String[] args) {

//       lista ordenada de elementos, permite duplicatas.
//       ########################## ARRAY LIST #############
//       ########################## ARRAY LIST #############
//       ########################## ARRAY LIST #############
//       ########################## ARRAY LIST #############
//       ########################## ARRAY LIST #############
        // Criando um objeto ArrayList para armazenar n�meros inteiros
        ArrayList<Integer> numeros = new ArrayList<>();

        // Adicionando elementos ao ArrayList
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Acessando elementos do ArrayList
        System.out.println("Elemento na posi��o 0: " + numeros.get(0)); // Sa�da: 10
        System.out.println("Elemento na posi��o 1: " + numeros.get(1)); // Sa�da: 20

        // Verificando o tamanho do ArrayList
        System.out.println("Tamanho do ArrayList: " + numeros.size()); // Sa�da: 3

        // Percorrendo e exibindo todos os elementos do ArrayList
        System.out.println("Elementos do ArrayList:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        // Removendo um elemento do ArrayList
        numeros.remove(1);
        System.out.println("Elementos do ArrayList ap�s remover o elemento na posi��o 1:");

        // Verificando se um elemento est� presente na lista
        boolean contemElemento = numeros.contains(40);
        if (contemElemento) {
            System.out.println("elemento existe");
        }

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

//       lista ordenada de elementos, permite duplicatas.
//       cole��o ordenada de elementos FIFO - First-In-First-Out
//       ########################## LINKED LIST #############
//       ########################## LINKED LIST #############
//       ########################## LINKED LIST #############
//       ########################## LINKED LIST #############
//       ########################## LINKED LIST #############
        LinkedList<String> frutas = new LinkedList<>();

        // Adicionando elementos � LinkedList
        frutas.add("Ma��");
        frutas.add("Banana");
        frutas.add("Laranja");

        // Acessando elementos da LinkedList
        System.out.println("Primeiro elemento: " + frutas.getFirst()); // Sa�da: Ma��
        System.out.println("�ltimo elemento: " + frutas.getLast()); // Sa�da: Laranja

        // Verificando o tamanho da LinkedList
        System.out.println("Tamanho da LinkedList: " + frutas.size()); // Sa�da: 3

        // Percorrendo e exibindo todos os elementos da LinkedList
        System.out.println("Elementos da LinkedList:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // Removendo um elemento da LinkedList
        frutas.remove("Banana");
        System.out.println("Elementos da LinkedList ap�s remover 'Banana':");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
//       lista ordenada de elementos, permite duplicatas.
//       sincronizada, thread-safe
//       ########################## VECTOR #############
//       ########################## VECTOR #############
//       ########################## VECTOR #############
//       ########################## VECTOR #############
//       ########################## VECTOR #############
        Vector<Integer> numerosVector = new Vector<>();

        // Adicionando elementos ao Vector
        numerosVector.add(10);
        numerosVector.add(20);
        numerosVector.add(30);

        // Acessando elementos do Vector
        System.out.println("Elemento na posi��o 0: " + numerosVector.get(0)); // Sa�da: 10
        System.out.println("Elemento na posi��o 1: " + numerosVector.get(1)); // Sa�da: 20

        // Verificando o tamanho do Vector
        System.out.println("Tamanho do Vector: " + numerosVector.size()); // Sa�da: 3

        // Percorrendo e exibindo todos os elementos do Vector
        System.out.println("Elementos do Vector:");
        for (int i = 0; i < numerosVector.size(); i++) {
            System.out.println(numerosVector.get(i));
        }

        // Removendo um elemento do Vector
        numerosVector.remove(1);
        System.out.println("Elementos do Vector ap�s remover o elemento na posi��o 1:");
        for (int i = 0; i < numerosVector.size(); i++) {
            System.out.println(numerosVector.get(i));
        }


//       ----- elementos �nicos, sem repeti��es -----
//        n�o garante uma ordem espec�fica dos elementos
//       ########################## HASH SET #############
//       ########################## HASH SET #############
//       ########################## HASH SET #############
//       ########################## HASH SET #############
//       ########################## HASH SET #############
        HashSet<String> cidades = new HashSet<>();

        // Adicionando elementos ao HashSet
        cidades.add("S�o Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Belo Horizonte");

        // Verificando o tamanho do HashSet
        System.out.println("Tamanho do HashSet: " + cidades.size()); // Sa�da: 3

        // Verificando se um elemento est� presente no HashSet
        System.out.println("Cont�m 'S�o Paulo'? " + cidades.contains("S�o Paulo")); // Sa�da: true
        System.out.println("Cont�m 'Porto Alegre'? " + cidades.contains("Porto Alegre")); // Sa�da: false

        // Percorrendo e exibindo todos os elementos do HashSet
        System.out.println("Elementos do HashSet:");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }

        // Removendo um elemento do HashSet
        cidades.remove("Rio de Janeiro");
        System.out.println("Elementos do HashSet ap�s remover 'Rio de Janeiro':");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }

//       ----- elementos �nicos, sem repeti��es -----
//        mant�m os elementos em ordem crescente automaticamente
//        mant�m os elementos em ordem natural
//        oferece uma r�pida opera��o de busca
//       ########################## TREE SET #############
//       ########################## TREE SET #############
//       ########################## TREE SET #############
//       ########################## TREE SET #############
//       ########################## TREE SET #############
        TreeSet<Integer> numerosTreeSet = new TreeSet<>();

        // Adicionando elementos ao TreeSet
        numerosTreeSet.add(10);
        numerosTreeSet.add(30);
        numerosTreeSet.add(20);

        // Verificando o tamanho do TreeSet
        System.out.println("Tamanho do TreeSet: " + numerosTreeSet.size()); // Sa�da: 3

        // Percorrendo e exibindo todos os elementos do TreeSet
        System.out.println("Elementos do TreeSet:");
        for (int numero : numerosTreeSet) {
            System.out.println(numero);
        }

        // Verificando o primeiro e o �ltimo elemento do TreeSet
        System.out.println("Primeiro elemento: " + numerosTreeSet.first()); // Sa�da: 10
        System.out.println("�ltimo elemento: " + numerosTreeSet.last()); // Sa�da: 30

        // Removendo um elemento do TreeSet
        numerosTreeSet.remove(20);
        System.out.println("Elementos do TreeSet ap�s remover 20:");
        for (int numero : numerosTreeSet) {
            System.out.println(numero);
        }

//       ----- elementos �nicos, sem repeti��es -----
//        mant�m a ordem de inser��o dos elementos
//        Usa uma tabela hash para obter uma busca eficiente
//          e uma lista duplamente ligada para manter a ordem de inser��o.
//       ########################## LINKED HASH SET #############
//       ########################## LINKED HASH SET #############
        LinkedHashSet<String> cidadesLinkedHashSet = new LinkedHashSet<>();

        // Adicionando elementos ao LinkedHashSet
        cidadesLinkedHashSet.add("S�o Paulo");
        cidadesLinkedHashSet.add("Rio de Janeiro");
        cidadesLinkedHashSet.add("Belo Horizonte");

        // Verificando o tamanho do LinkedHashSet
        System.out.println("Tamanho do LinkedHashSet: " + cidadesLinkedHashSet.size()); // Sa�da: 3

        // Percorrendo e exibindo todos os elementos do LinkedHashSet
        System.out.println("Elementos do LinkedHashSet:");
        for (String cidade : cidadesLinkedHashSet) {
            System.out.println(cidade);
        }

        // Removendo um elemento do LinkedHashSet
        cidadesLinkedHashSet.remove("Rio de Janeiro");
        System.out.println("Elementos do LinkedHashSet ap�s remover 'Rio de Janeiro':");
        for (String cidade : cidadesLinkedHashSet) {
            System.out.println(cidade);
        }


//       ----- estrutura de mapeamento chave-valor -----
//        n�o permite chaves duplicadas.
//       ########################## HASH MAP #############
//       ########################## HASH MAP #############
//       ########################## HASH MAP #############
//       ########################## HASH MAP #############
//       ########################## HASH MAP #############
        HashMap<Integer, String> estudantes = new HashMap<>();

        // Adicionando elementos ao HashMap
        estudantes.put(1, "Jo�o");
        estudantes.put(2, "Maria");
        estudantes.put(3, "Pedro");

        // Verificando o tamanho do HashMap
        System.out.println("Tamanho do HashMap: " + estudantes.size()); // Sa�da: 3

        // Acessando elementos do HashMap por meio da chave
        System.out.println("Estudante com chave 2: " + estudantes.get(2)); // Sa�da: Maria

        // Percorrendo e exibindo todos os elementos do HashMap
        System.out.println("Elementos do HashMap:");
        for (Integer chave : estudantes.keySet()) {
            String valor = estudantes.get(chave);
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }

        // Removendo um elemento do HashMap
        estudantes.remove(3);
        System.out.println("Elementos do HashMap ap�s remover chave 3:");
        for (Integer chave : estudantes.keySet()) {
            String valor = estudantes.get(chave);
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }

//       ----- estrutura de mapeamento chave-valor -----
//        mant�m as chaves em ordem natural ou usando um Comparator personalizado
//       ########################## TREE MAP #############
//       ########################## TREE MAP #############
//       ########################## TREE MAP #############
//       ########################## TREE MAP #############
//       ########################## TREE MAP #############
        TreeMap<Integer, String> estudantesTreeMap = new TreeMap<>();

        // Adicionando elementos ao TreeMap
        estudantesTreeMap.put(3, "Pedro");
        estudantesTreeMap.put(1, "Jo�o");
        estudantesTreeMap.put(2, "Maria");

        // Verificando o tamanho do TreeMap
        System.out.println("Tamanho do TreeMap: " + estudantesTreeMap.size()); // Sa�da: 3

        // Acessando elementos do TreeMap por meio da chave
        System.out.println("Estudante com chave 2: " + estudantesTreeMap.get(2)); // Sa�da: Maria

        // Percorrendo e exibindo todos os elementos do TreeMap
        System.out.println("Elementos do TreeMap:");
        for (Integer chave : estudantesTreeMap.keySet()) {
            String valor = estudantesTreeMap.get(chave);
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }

        // Removendo um elemento do TreeMap
        estudantesTreeMap.remove(3);
        System.out.println("Elementos do TreeMap ap�s remover chave 3:");
        for (Integer chave : estudantesTreeMap.keySet()) {
            String valor = estudantesTreeMap.get(chave);
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }

//       ----- estrutura de mapeamento chave-valor -----
//        mant�m a ordem de inser��o dos elementos
//        Ele combina as caracter�sticas do HashMap e da LinkedList,
//          usando uma tabela hash para obter uma busca eficiente e
//          uma lista duplamente ligada para manter a ordem de inser��o.
//       ########################## LINKED HASH MAP #############
//       ########################## LINKED HASH MAP #############
//       ########################## LINKED HASH MAP #############
//       ########################## LINKED HASH MAP #############
//       ########################## LINKED HASH MAP #############
        LinkedHashMap<Integer, String> estudantesLinkedHashMap = new LinkedHashMap<>();

        // Adicionando elementos ao LinkedHashMap
        estudantesLinkedHashMap.put(3, "Pedro");
        estudantesLinkedHashMap.put(1, "Jo�o");
        estudantesLinkedHashMap.put(2, "Maria");

        // Verificando o tamanho do LinkedHashMap
        System.out.println("Tamanho do LinkedHashMap: " + estudantesLinkedHashMap.size()); // Sa�da: 3

        // Acessando elementos do LinkedHashMap por meio da chave
        System.out.println("Estudante com chave 2: " + estudantesLinkedHashMap.get(2)); // Sa�da: Maria

        // Percorrendo e exibindo todos os elementos do LinkedHashMap
        System.out.println("Elementos do LinkedHashMap:");
        for (Integer chave : estudantesLinkedHashMap.keySet()) {
            String valor = estudantesLinkedHashMap.get(chave);
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }

        // Removendo um elemento do LinkedHashMap
        estudantesLinkedHashMap.remove(3);
        System.out.println("Elementos do LinkedHashMap ap�s remover chave 3:");
        for (Integer chave : estudantesLinkedHashMap.keySet()) {
            String valor = estudantesLinkedHashMap.get(chave);
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }

//        fila duplamente terminada
//        inser��o e remo��o de elementos no in�cio e final da fila
//        O ArrayDeque � uma implementa��o da interface Deque que representa
//          uma fila duplamente terminada (deque). Ele permite a inser��o e remo��o
//              eficientes tanto no in�cio quanto no final da fila.
//       ########################## ARRAY DEQUE #############
        ArrayDeque<String> cores = new ArrayDeque<>();

        // Adicionando elementos ao ArrayDeque
        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Azul");

        // Verificando o tamanho do ArrayDeque
        System.out.println("Tamanho do ArrayDeque: " + cores.size()); // Sa�da: 3

        // Acessando elementos do ArrayDeque
        System.out.println("Primeiro elemento: " + cores.getFirst()); // Sa�da: Vermelho
        System.out.println("�ltimo elemento: " + cores.getLast()); // Sa�da: Azul

        // Percorrendo e exibindo todos os elementos do ArrayDeque
        System.out.println("Elementos do ArrayDeque:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        // Removendo um elemento do ArrayDeque
        cores.removeLast();
        System.out.println("Elementos do ArrayDeque ap�s remover o �ltimo elemento:");
        for (String cor : cores) {
            System.out.println(cor);
        }

//       lista ordenada de elementos, permite duplicatas.
//       pilha estrutura de dados LIFO (Last-In-First-Out)
//        �ltimo elemento adicionado � pilha � o primeiro a ser removido
//       ########################## STACK #############
//       ########################## STACK #############
//       ########################## STACK #############
//       ########################## STACK #############
//       ########################## STACK #############
        Stack<String> frutasStack = new Stack<>();

        // Adicionando elementos � pilha (Stack)
        frutasStack.push("Ma��");
        frutasStack.push("Banana");
        frutasStack.push("Laranja");

        // Verificando o tamanho da pilha (Stack)
        System.out.println("Tamanho da pilha (Stack): " + frutasStack.size()); // Sa�da: 3

        // Acessando o elemento no topo da pilha (Stack)
        System.out.println("Elemento no topo: " + frutasStack.peek()); // Sa�da: Laranja

        // Percorrendo e exibindo todos os elementos da pilha (Stack)
        System.out.println("Elementos da pilha (Stack):");
        for (String fruta : frutasStack) {
            System.out.println(fruta);
        }

        // Removendo o elemento no topo da pilha (Stack)
        String elementoRemovido = frutasStack.pop();
        System.out.println("Elemento removido: " + elementoRemovido);

        // Exibindo novamente os elementos da pilha (Stack) ap�s remo��o
        System.out.println("Elementos da pilha (Stack) ap�s remo��o:");
        for (String fruta : frutasStack) {
            System.out.println(fruta);
        }

//       ########################## Arrays #############
//       ########################## Arrays #############
//       ########################## Arrays #############
//       ########################## Arrays #############
//       ########################## Arrays #############
        int[] numerosArray = {5, 2, 9, 1, 7};

        // Ordenando o array em ordem crescente
        Arrays.sort(numerosArray);

        // Exibindo o array ordenado
        System.out.println("Array ordenado em ordem crescente:");
        for (int numero : numerosArray) {
            System.out.println(numero);
        }

        // Pesquisando um elemento no array usando o m�todo binarySearch()
        int chave = 9;
        int indice = Arrays.binarySearch(numerosArray, chave);
        if (indice >= 0) {
            System.out.println("O elemento " + chave + " est� presente no �ndice " + indice);
        } else {
            System.out.println("O elemento " + chave + " n�o est� presente no array");
        }

        // Preenchendo o array com um valor espec�fico usando o m�todo fill()
        int[] numerosPreenchidos = new int[5];
        int valor = 10;
        Arrays.fill(numerosPreenchidos, valor);

        // Exibindo o array preenchido
        System.out.println("Array preenchido com o valor " + valor + ":");
        for (int numero : numerosPreenchidos) {
            System.out.println(numero);
        }

//       ########################## COLLECTIONS #############
//       ########################## COLLECTIONS #############
//       ########################## COLLECTIONS #############
//       ########################## COLLECTIONS #############
//       ########################## COLLECTIONS #############
//        A classe Collections fornece diversos m�todos utilit�rios
//          para manipular cole��es, como embaralhar, ordenar, pesquisar, entre outros.
        ArrayList<String> frutasCollections = new ArrayList<>();
        frutasCollections.add("Ma��");
        frutasCollections.add("Banana");
        frutasCollections.add("Laranja");

        // Exibindo a lista original
        System.out.println("Lista original:");
        for (String fruta : frutasCollections) {
            System.out.println(fruta);
        }

        // Embaralhando a lista usando o m�todo shuffle()
        Collections.shuffle(frutasCollections);

        // Exibindo a lista embaralhada
        System.out.println("\nLista embaralhada:");
        for (String fruta : frutasCollections) {
            System.out.println(fruta);
        }

        // Ordenando a lista em ordem alfab�tica usando o m�todo sort()
        Collections.sort(frutasCollections);

        // Exibindo a lista ordenada
        System.out.println("\nLista ordenada:");
        for (String fruta : frutasCollections) {
            System.out.println(fruta);
        }

        // Procurando um elemento espec�fico na lista usando o m�todo binarySearch()
        String chaveCollection = "Banana";
        int indiceCollection = Collections.binarySearch(frutasCollections, chaveCollection);
        if (indiceCollection >= 0) {
            System.out.println("\nA fruta '" + chaveCollection + "' est� presente no �ndice " + indiceCollection);
        } else {
            System.out.println("\nA fruta '" + chaveCollection + "' n�o est� presente na lista");
        }


//       ########################## ITERATOR #############
//       ########################## ITERATOR #############
//       ########################## ITERATOR #############
//       ########################## ITERATOR #############
//       ########################## ITERATOR #############
//        O Iterator � uma interface que permite percorrer
//          e iterar sobre os elementos de uma
//              cole��o, como uma lista, conjunto ou mapa.
        List<Integer> numerosIterator = new ArrayList<>();
        numerosIterator.add(10);
        numerosIterator.add(13);
        numerosIterator.add(20);
        numerosIterator.add(23);
        numerosIterator.add(30);
        numerosIterator.add(40);

        // Obtendo um Iterator para percorrer a lista
        Iterator<Integer> iterator = numerosIterator.iterator();

        // Iterando sobre os elementos usando o Iterator
        System.out.println("Elementos da lista:");
        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            System.out.println(numero);
        }

        // Removendo elementos espec�ficos durante a itera��o
        iterator = numerosIterator.iterator();
        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            if (numero % 2 == 0) {
                iterator.remove();
            }
        }

        // Exibindo a lista ap�s a remo��o dos elementos pares
        System.out.println("\nLista ap�s remover elementos pares:");
        for (Integer numero : numerosIterator) {
            System.out.println(numero);
        }

//       ########################## HASH TABLE #############
//       ########################## HASH TABLE #############
//       ########################## HASH TABLE #############
//       ########################## HASH TABLE #############
//       ########################## HASH TABLE #############
//       ########################## HASH TABLE #############
        Hashtable<Integer, String> estudantesHashtable = new Hashtable<>();

        // Adicionando elementos � Hashtable
        estudantesHashtable.put(1, "Jo�o");
        estudantesHashtable.put(2, "Maria");
        estudantesHashtable.put(3, "Pedro");

        // Verificando o tamanho da Hashtable
        System.out.println("Tamanho da Hashtable: " + estudantesHashtable.size());
        // Sa�da: 3

        // Acessando elementos da Hashtable por meio da chave
        System.out.println("Estudante com chave 2: " + estudantesHashtable.get(2));
        // Sa�da: Maria


        // Percorrendo e exibindo todos os elementos da Hashtable
        System.out.println("Elementos da Hashtable:");
        for (Integer chaveHashtable : estudantesHashtable.keySet()) {
            String valorHashtable = estudantesHashtable.get(chaveHashtable);
            System.out.println("Chave: " + chaveHashtable + ", Valor: " + valorHashtable);
        }

        // Removendo um elemento da Hashtable
        estudantesHashtable.remove(3);
        System.out.println("Elementos da Hashtable ap�s remover chave 3:");
        for (Integer chaveHashtable : estudantesHashtable.keySet()) {
            String valorHashtable = estudantesHashtable.get(chaveHashtable);
            System.out.println("Chave: " + chaveHashtable + ", Valor: " + valorHashtable);
        }

//        #################### LOOP EXAMPLES ####################
//        #################### LOOP EXAMPLES ####################
//        #################### LOOP EXAMPLES ####################

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("O valor de i �: " + i);
        }
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("O valor de i �: " + i);
        }
        for (int numero : numeros) {
            System.out.println("O n�mero �: " + numero);
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("Valor de i: " + i + ", Valor de j: " + j);
            }
        }

        int contador = 0;
        while (contador < 5) {
            System.out.println("O contador �: " + contador);
            contador++;
        }
        int i = 0;
        do {
            System.out.println("O valor de i �: " + i);
            i++;
        } while (i < 5);
    }
}




















