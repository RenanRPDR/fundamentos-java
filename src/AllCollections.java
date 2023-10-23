import java.util.*;

public class AllCollections {
    public static void main(String[] args) {

//       lista ordenada de elementos, permite duplicatas.
//       ########################## ARRAY LIST #############
//       ########################## ARRAY LIST #############
//       ########################## ARRAY LIST #############
//       ########################## ARRAY LIST #############
//       ########################## ARRAY LIST #############
        // Criando um objeto ArrayList para armazenar números inteiros
        ArrayList<Integer> numeros = new ArrayList<>();

        // Adicionando elementos ao ArrayList
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Acessando elementos do ArrayList
        System.out.println("Elemento na posição 0: " + numeros.get(0)); // Saída: 10
        System.out.println("Elemento na posição 1: " + numeros.get(1)); // Saída: 20

        // Verificando o tamanho do ArrayList
        System.out.println("Tamanho do ArrayList: " + numeros.size()); // Saída: 3

        // Percorrendo e exibindo todos os elementos do ArrayList
        System.out.println("Elementos do ArrayList:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        // Removendo um elemento do ArrayList
        numeros.remove(1);
        System.out.println("Elementos do ArrayList após remover o elemento na posição 1:");

        // Verificando se um elemento está presente na lista
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
//       coleção ordenada de elementos FIFO - First-In-First-Out
//       ########################## LINKED LIST #############
//       ########################## LINKED LIST #############
//       ########################## LINKED LIST #############
//       ########################## LINKED LIST #############
//       ########################## LINKED LIST #############
        LinkedList<String> frutas = new LinkedList<>();

        // Adicionando elementos à LinkedList
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        // Acessando elementos da LinkedList
        System.out.println("Primeiro elemento: " + frutas.getFirst()); // Saída: Maçã
        System.out.println("Último elemento: " + frutas.getLast()); // Saída: Laranja

        // Verificando o tamanho da LinkedList
        System.out.println("Tamanho da LinkedList: " + frutas.size()); // Saída: 3

        // Percorrendo e exibindo todos os elementos da LinkedList
        System.out.println("Elementos da LinkedList:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // Removendo um elemento da LinkedList
        frutas.remove("Banana");
        System.out.println("Elementos da LinkedList após remover 'Banana':");
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
        System.out.println("Elemento na posição 0: " + numerosVector.get(0)); // Saída: 10
        System.out.println("Elemento na posição 1: " + numerosVector.get(1)); // Saída: 20

        // Verificando o tamanho do Vector
        System.out.println("Tamanho do Vector: " + numerosVector.size()); // Saída: 3

        // Percorrendo e exibindo todos os elementos do Vector
        System.out.println("Elementos do Vector:");
        for (int i = 0; i < numerosVector.size(); i++) {
            System.out.println(numerosVector.get(i));
        }

        // Removendo um elemento do Vector
        numerosVector.remove(1);
        System.out.println("Elementos do Vector após remover o elemento na posição 1:");
        for (int i = 0; i < numerosVector.size(); i++) {
            System.out.println(numerosVector.get(i));
        }


//       ----- elementos únicos, sem repetições -----
//        não garante uma ordem específica dos elementos
//       ########################## HASH SET #############
//       ########################## HASH SET #############
//       ########################## HASH SET #############
//       ########################## HASH SET #############
//       ########################## HASH SET #############
        HashSet<String> cidades = new HashSet<>();

        // Adicionando elementos ao HashSet
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Belo Horizonte");

        // Verificando o tamanho do HashSet
        System.out.println("Tamanho do HashSet: " + cidades.size()); // Saída: 3

        // Verificando se um elemento está presente no HashSet
        System.out.println("Contém 'São Paulo'? " + cidades.contains("São Paulo")); // Saída: true
        System.out.println("Contém 'Porto Alegre'? " + cidades.contains("Porto Alegre")); // Saída: false

        // Percorrendo e exibindo todos os elementos do HashSet
        System.out.println("Elementos do HashSet:");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }

        // Removendo um elemento do HashSet
        cidades.remove("Rio de Janeiro");
        System.out.println("Elementos do HashSet após remover 'Rio de Janeiro':");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }

//       ----- elementos únicos, sem repetições -----
//        mantém os elementos em ordem crescente automaticamente
//        mantém os elementos em ordem natural
//        oferece uma rápida operação de busca
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
        System.out.println("Tamanho do TreeSet: " + numerosTreeSet.size()); // Saída: 3

        // Percorrendo e exibindo todos os elementos do TreeSet
        System.out.println("Elementos do TreeSet:");
        for (int numero : numerosTreeSet) {
            System.out.println(numero);
        }

        // Verificando o primeiro e o último elemento do TreeSet
        System.out.println("Primeiro elemento: " + numerosTreeSet.first()); // Saída: 10
        System.out.println("Último elemento: " + numerosTreeSet.last()); // Saída: 30

        // Removendo um elemento do TreeSet
        numerosTreeSet.remove(20);
        System.out.println("Elementos do TreeSet após remover 20:");
        for (int numero : numerosTreeSet) {
            System.out.println(numero);
        }

//       ----- elementos únicos, sem repetições -----
//        mantém a ordem de inserção dos elementos
//        Usa uma tabela hash para obter uma busca eficiente
//          e uma lista duplamente ligada para manter a ordem de inserção.
//       ########################## LINKED HASH SET #############
//       ########################## LINKED HASH SET #############
        LinkedHashSet<String> cidadesLinkedHashSet = new LinkedHashSet<>();

        // Adicionando elementos ao LinkedHashSet
        cidadesLinkedHashSet.add("São Paulo");
        cidadesLinkedHashSet.add("Rio de Janeiro");
        cidadesLinkedHashSet.add("Belo Horizonte");

        // Verificando o tamanho do LinkedHashSet
        System.out.println("Tamanho do LinkedHashSet: " + cidadesLinkedHashSet.size()); // Saída: 3

        // Percorrendo e exibindo todos os elementos do LinkedHashSet
        System.out.println("Elementos do LinkedHashSet:");
        for (String cidade : cidadesLinkedHashSet) {
            System.out.println(cidade);
        }

        // Removendo um elemento do LinkedHashSet
        cidadesLinkedHashSet.remove("Rio de Janeiro");
        System.out.println("Elementos do LinkedHashSet após remover 'Rio de Janeiro':");
        for (String cidade : cidadesLinkedHashSet) {
            System.out.println(cidade);
        }


//       ----- estrutura de mapeamento chave-valor -----
//        não permite chaves duplicadas.
//       ########################## HASH MAP #############
//       ########################## HASH MAP #############
//       ########################## HASH MAP #############
//       ########################## HASH MAP #############
//       ########################## HASH MAP #############
        HashMap<Integer, String> estudantes = new HashMap<>();

        // Adicionando elementos ao HashMap
        estudantes.put(1, "João");
        estudantes.put(2, "Maria");
        estudantes.put(3, "Pedro");

        // Verificando o tamanho do HashMap
        System.out.println("Tamanho do HashMap: " + estudantes.size()); // Saída: 3

        // Acessando elementos do HashMap por meio da chave
        System.out.println("Estudante com chave 2: " + estudantes.get(2)); // Saída: Maria

        // Percorrendo e exibindo todos os elementos do HashMap
        System.out.println("Elementos do HashMap:");
        for (Integer chave : estudantes.keySet()) {
            String valor = estudantes.get(chave);
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }

        // Removendo um elemento do HashMap
        estudantes.remove(3);
        System.out.println("Elementos do HashMap após remover chave 3:");
        for (Integer chave : estudantes.keySet()) {
            String valor = estudantes.get(chave);
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }

//       ----- estrutura de mapeamento chave-valor -----
//        mantém as chaves em ordem natural ou usando um Comparator personalizado
//       ########################## TREE MAP #############
//       ########################## TREE MAP #############
//       ########################## TREE MAP #############
//       ########################## TREE MAP #############
//       ########################## TREE MAP #############
        TreeMap<Integer, String> estudantesTreeMap = new TreeMap<>();

        // Adicionando elementos ao TreeMap
        estudantesTreeMap.put(3, "Pedro");
        estudantesTreeMap.put(1, "João");
        estudantesTreeMap.put(2, "Maria");

        // Verificando o tamanho do TreeMap
        System.out.println("Tamanho do TreeMap: " + estudantesTreeMap.size()); // Saída: 3

        // Acessando elementos do TreeMap por meio da chave
        System.out.println("Estudante com chave 2: " + estudantesTreeMap.get(2)); // Saída: Maria

        // Percorrendo e exibindo todos os elementos do TreeMap
        System.out.println("Elementos do TreeMap:");
        for (Integer chave : estudantesTreeMap.keySet()) {
            String valor = estudantesTreeMap.get(chave);
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }

        // Removendo um elemento do TreeMap
        estudantesTreeMap.remove(3);
        System.out.println("Elementos do TreeMap após remover chave 3:");
        for (Integer chave : estudantesTreeMap.keySet()) {
            String valor = estudantesTreeMap.get(chave);
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }

//       ----- estrutura de mapeamento chave-valor -----
//        mantém a ordem de inserção dos elementos
//        Ele combina as características do HashMap e da LinkedList,
//          usando uma tabela hash para obter uma busca eficiente e
//          uma lista duplamente ligada para manter a ordem de inserção.
//       ########################## LINKED HASH MAP #############
//       ########################## LINKED HASH MAP #############
//       ########################## LINKED HASH MAP #############
//       ########################## LINKED HASH MAP #############
//       ########################## LINKED HASH MAP #############
        LinkedHashMap<Integer, String> estudantesLinkedHashMap = new LinkedHashMap<>();

        // Adicionando elementos ao LinkedHashMap
        estudantesLinkedHashMap.put(3, "Pedro");
        estudantesLinkedHashMap.put(1, "João");
        estudantesLinkedHashMap.put(2, "Maria");

        // Verificando o tamanho do LinkedHashMap
        System.out.println("Tamanho do LinkedHashMap: " + estudantesLinkedHashMap.size()); // Saída: 3

        // Acessando elementos do LinkedHashMap por meio da chave
        System.out.println("Estudante com chave 2: " + estudantesLinkedHashMap.get(2)); // Saída: Maria

        // Percorrendo e exibindo todos os elementos do LinkedHashMap
        System.out.println("Elementos do LinkedHashMap:");
        for (Integer chave : estudantesLinkedHashMap.keySet()) {
            String valor = estudantesLinkedHashMap.get(chave);
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }

        // Removendo um elemento do LinkedHashMap
        estudantesLinkedHashMap.remove(3);
        System.out.println("Elementos do LinkedHashMap após remover chave 3:");
        for (Integer chave : estudantesLinkedHashMap.keySet()) {
            String valor = estudantesLinkedHashMap.get(chave);
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }

//        fila duplamente terminada
//        inserção e remoção de elementos no início e final da fila
//        O ArrayDeque é uma implementação da interface Deque que representa
//          uma fila duplamente terminada (deque). Ele permite a inserção e remoção
//              eficientes tanto no início quanto no final da fila.
//       ########################## ARRAY DEQUE #############
        ArrayDeque<String> cores = new ArrayDeque<>();

        // Adicionando elementos ao ArrayDeque
        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Azul");

        // Verificando o tamanho do ArrayDeque
        System.out.println("Tamanho do ArrayDeque: " + cores.size()); // Saída: 3

        // Acessando elementos do ArrayDeque
        System.out.println("Primeiro elemento: " + cores.getFirst()); // Saída: Vermelho
        System.out.println("Último elemento: " + cores.getLast()); // Saída: Azul

        // Percorrendo e exibindo todos os elementos do ArrayDeque
        System.out.println("Elementos do ArrayDeque:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        // Removendo um elemento do ArrayDeque
        cores.removeLast();
        System.out.println("Elementos do ArrayDeque após remover o último elemento:");
        for (String cor : cores) {
            System.out.println(cor);
        }

//       lista ordenada de elementos, permite duplicatas.
//       pilha estrutura de dados LIFO (Last-In-First-Out)
//        último elemento adicionado à pilha é o primeiro a ser removido
//       ########################## STACK #############
//       ########################## STACK #############
//       ########################## STACK #############
//       ########################## STACK #############
//       ########################## STACK #############
        Stack<String> frutasStack = new Stack<>();

        // Adicionando elementos à pilha (Stack)
        frutasStack.push("Maçã");
        frutasStack.push("Banana");
        frutasStack.push("Laranja");

        // Verificando o tamanho da pilha (Stack)
        System.out.println("Tamanho da pilha (Stack): " + frutasStack.size()); // Saída: 3

        // Acessando o elemento no topo da pilha (Stack)
        System.out.println("Elemento no topo: " + frutasStack.peek()); // Saída: Laranja

        // Percorrendo e exibindo todos os elementos da pilha (Stack)
        System.out.println("Elementos da pilha (Stack):");
        for (String fruta : frutasStack) {
            System.out.println(fruta);
        }

        // Removendo o elemento no topo da pilha (Stack)
        String elementoRemovido = frutasStack.pop();
        System.out.println("Elemento removido: " + elementoRemovido);

        // Exibindo novamente os elementos da pilha (Stack) após remoção
        System.out.println("Elementos da pilha (Stack) após remoção:");
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

        // Pesquisando um elemento no array usando o método binarySearch()
        int chave = 9;
        int indice = Arrays.binarySearch(numerosArray, chave);
        if (indice >= 0) {
            System.out.println("O elemento " + chave + " está presente no índice " + indice);
        } else {
            System.out.println("O elemento " + chave + " não está presente no array");
        }

        // Preenchendo o array com um valor específico usando o método fill()
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
//        A classe Collections fornece diversos métodos utilitários
//          para manipular coleções, como embaralhar, ordenar, pesquisar, entre outros.
        ArrayList<String> frutasCollections = new ArrayList<>();
        frutasCollections.add("Maçã");
        frutasCollections.add("Banana");
        frutasCollections.add("Laranja");

        // Exibindo a lista original
        System.out.println("Lista original:");
        for (String fruta : frutasCollections) {
            System.out.println(fruta);
        }

        // Embaralhando a lista usando o método shuffle()
        Collections.shuffle(frutasCollections);

        // Exibindo a lista embaralhada
        System.out.println("\nLista embaralhada:");
        for (String fruta : frutasCollections) {
            System.out.println(fruta);
        }

        // Ordenando a lista em ordem alfabética usando o método sort()
        Collections.sort(frutasCollections);

        // Exibindo a lista ordenada
        System.out.println("\nLista ordenada:");
        for (String fruta : frutasCollections) {
            System.out.println(fruta);
        }

        // Procurando um elemento específico na lista usando o método binarySearch()
        String chaveCollection = "Banana";
        int indiceCollection = Collections.binarySearch(frutasCollections, chaveCollection);
        if (indiceCollection >= 0) {
            System.out.println("\nA fruta '" + chaveCollection + "' está presente no índice " + indiceCollection);
        } else {
            System.out.println("\nA fruta '" + chaveCollection + "' não está presente na lista");
        }


//       ########################## ITERATOR #############
//       ########################## ITERATOR #############
//       ########################## ITERATOR #############
//       ########################## ITERATOR #############
//       ########################## ITERATOR #############
//        O Iterator é uma interface que permite percorrer
//          e iterar sobre os elementos de uma
//              coleção, como uma lista, conjunto ou mapa.
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

        // Removendo elementos específicos durante a iteração
        iterator = numerosIterator.iterator();
        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            if (numero % 2 == 0) {
                iterator.remove();
            }
        }

        // Exibindo a lista após a remoção dos elementos pares
        System.out.println("\nLista após remover elementos pares:");
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

        // Adicionando elementos à Hashtable
        estudantesHashtable.put(1, "João");
        estudantesHashtable.put(2, "Maria");
        estudantesHashtable.put(3, "Pedro");

        // Verificando o tamanho da Hashtable
        System.out.println("Tamanho da Hashtable: " + estudantesHashtable.size());
        // Saída: 3

        // Acessando elementos da Hashtable por meio da chave
        System.out.println("Estudante com chave 2: " + estudantesHashtable.get(2));
        // Saída: Maria


        // Percorrendo e exibindo todos os elementos da Hashtable
        System.out.println("Elementos da Hashtable:");
        for (Integer chaveHashtable : estudantesHashtable.keySet()) {
            String valorHashtable = estudantesHashtable.get(chaveHashtable);
            System.out.println("Chave: " + chaveHashtable + ", Valor: " + valorHashtable);
        }

        // Removendo um elemento da Hashtable
        estudantesHashtable.remove(3);
        System.out.println("Elementos da Hashtable após remover chave 3:");
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
            System.out.println("O valor de i é: " + i);
        }
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("O valor de i é: " + i);
        }
        for (int numero : numeros) {
            System.out.println("O número é: " + numero);
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("Valor de i: " + i + ", Valor de j: " + j);
            }
        }

        int contador = 0;
        while (contador < 5) {
            System.out.println("O contador é: " + contador);
            contador++;
        }
        int i = 0;
        do {
            System.out.println("O valor de i é: " + i);
            i++;
        } while (i < 5);
    }
}




















