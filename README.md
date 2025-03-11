# sort-search-app

Пример приложения, использующего библиотеку `sort-search-utils` и Lombok.

## Описание

Это приложение демонстрирует, как использовать библиотеку `sort-search-utils` для сортировки и поиска в массиве целых чисел.  В приложении также используется Lombok для автоматической генерации кода логирования.

## Функциональность

•   Демонстрирует использование `bubbleSort` и `linearSearch` из библиотеки `sort-search-utils`.
•   Использует Lombok для автоматического создания логгера с аннотацией `@Slf4j`.
•   Выводит информацию о сортировке и поиске в консоль с использованием SLF4J и Logback.

## Использование

1.  **Склонируйте репозиторий:**
```bash
git clone https://github.com/sultumov/string-utils.git
```
2.  **Соберите приложение с помощью Maven:**
```bash
mvn clean install
```    

3.  **Запустите приложение:**

```bash
java -jar target/sort-search-app-1.0-SNAPSHOT.jar
```

## Зависимости

•   sort-search-utils (локальная библиотека)
•   Lombok
•   SLF4J
•   Logback
•   JUnit (для тестирования, если есть)

## Конфигурация

Файл logback.xml в директории src/main/resources определяет конфигурацию логирования.

## Автор

Баир - sultumov

