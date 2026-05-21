# Identificação

* Nome: 
* Email (@ccc): 
* Matrícula: 


## O template

> O código java estará (ou você terá que colocar) no diretório **/src/main/java/**

> Os testes estão nas classes AssertsRadix.java e AssertsMediana.java

    javac PivotMediana.java Radix2Digitos.java AssertsRadix.java AssertsMediana.java; java -ea AssertsRadix AssertsMediana


# Mediana de Três

Uma tentativa de achar um pivot bom no particionamento é usar a mediana de 3, método no qual o pivo é escolhido como a mediana entre o primeiro, o elemento central e o último elemento do array. Implemente o método lomutoPartition(int v[]), que particiona um array seguindo a estratégia de lomuto e escolhendo o pivot usando a estratégia da mediana de 3. Sua função deve retornar a posição final do pivot. Lembre-se que na nossa implementação do Lomuto escolhemos o primeiro elemento como sendo o pivot para executar o particionamento.

Obs.: Não é permitido usar o método sort da biblioteca padrão. Você deve se virar sem isso para descobrir a mediana dos 3 elementos.

# Radix Dois Dígitos
    
Escreva o método radix que ordena uma sequência de números seguindo
a estratégia do Radix Sort. Você deve usar o counting sort
como rotina de ordenação primária. Contudo, ao invés de ordenar
dígito a dígito, você vai ordenar a cada par de dígitos.

    - Todos os números tem o mesmo número de dígitos.
    - Todos os números tem uma quantidade par de dígitos.
    - Não há valores negativos no array.
    
   
Veja o exemplo da ordenação para o seguinte array [7843, 5374, 2344, 8543].

Na primeira execução do counting sort, ele deve levar em consideração
43, 74, 44 e 43, que são os números formados pela concatenação do dois primeiros dígitos (mais à direita)
de cada número.

Depois, deve levar em consideração os números 78, 53, 23 e 85, que são os números formados pela concatenação 
dos dígitos 3 e 4 (mais à direita) de cada número.

Note que o algoritmo não é in-place, mas o resultado ordenado deve 
ficar no array original, que será verificado pelos asserts.
    
## Restrições
    
Não é permitido usar Arrays.sort ou qualquer método
pronto de bibliotecas de ordenação. Caso precise, implemente.

Seu programa deve apenas manipular o array de inteiros. Não pode usar funções como:
    
    - insert
    - remove
    - pop
    - qualquer função de ordenação que não tenha sido feita por você
        

# Entregando a prova

> ⚠️ **Importante:** Todos os comandos abaixo devem ser executados no **diretório pai** do projeto, ou seja, no diretório que **contém** o diretório `pp1-20261/`. 

---

## Passo 1: Gerar o arquivo compactado da sua solução

Execute o comando abaixo **no diretório pai** do projeto (o diretório que contém `pp1-20261/`):

```bash
tar zcvf nome-sobrenome-matricula.tar.gz pp1-20261/
```
---

## Passo 2: Submeter sua solução

Execute o comando abaixo **no mesmo diretório do Passo 1**:

```bash
bash pp1-20261/submit-answer.sh prova1 nome-sobrenome-matricula.tar.gz
```

Importante: a senha é `leda`

## Importante

* A correção da prova não é automática. Os testes que são executados quando você roda localmente são apenas testes de sanidade.

* Vou considerar sempre a última submissão antes do deadline final. 

* A nota será dada pelos testes no servidor e depois da correção que eu efetuar. Sempre tento corrigir o mais rápido possível. Portanto, tenha paciência.

* A nota será calculada a partir dos testes e análise manual do código. Essa análise manual vai considerar se a solução é eficiente, se não tem loops desnecessários etc.

* Só serão corrigidas as provas dos alunos que assinaram a lista de presença física no laboratório.
