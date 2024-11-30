package org.example;
public class Main {
    public static void main(String[] args) {
        //Экземпляр контейнера
        Container<Integer> container = new Container<>();

        //Добавление элементы
        container.add(1);
        container.add(2);
        container.add(3);

        //Получение элемента по индексу
        int element = container.get(1);
        System.out.println("Элемент с индексом 1: " + element);

        //Удаление элемента по индексу
        container.remove(0);

        //Получение элемента по тому же индексу после удаления
        int element2 = container.get(1);
        System.out.println("Элемент с индексом 1 после удаления: " + element2);

        //Получение размера контейнера
        int size = container.size();
        System.out.println("Размер контейнера: " + size);

        //Вывод контейнера с новым элементом
        container.add(4);
        int newsize = container.size();
        System.out.print("Элементы контейнера с учетом нового элемента (размер контейнера снова " + newsize + "): ");
        for (int i=0; i< container.size(); i++){
            int elem = container.get(i);
            System.out.print(elem + " ");
        }
    }
}
