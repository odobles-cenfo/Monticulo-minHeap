El algoritmo Dijkstra se utiliza para encontrar el camino más corto desde un nodo de origen hacia los demás nodos de un grafo.

En cada paso, el algoritmo necesita elegir el nodo con la distancia mínima para procesar. Para ello utiliza un montículo (Min-Heap) que guarda el nodo con la menor distancia en la "cima" por lo que se reduce drásticamente el tiempo que toma extraer este nodo, permitiendo tiempos de ejecución muy rápidos en aplicaciones.
