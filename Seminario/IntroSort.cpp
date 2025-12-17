Como funciona
*Início com Quicksort: Começa usando o Quicksort para particionar a lista rapidamente, escolhendo um bom pivô (como a mediana de três).
*Alterna para Heapsort: Se a profundidade de recursão exceder um limite (log(n)), ele muda para Heapsort para garantir a complexidade O(n log n) no pior caso.
*Usa Insertion Sort: Para subconjuntos de dados muito pequenos (abaixo de um certo limite), ele troca para Insertion Sort, que é mais eficiente para listas curtas. 

