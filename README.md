# zadanie_intern
Task:
You have two strings as an input , 3 > n > 5000, where n is a string length
Output is a boolean, which indicates if these two string are anagrams(case insensitive)
Write unit tests that covers at least 80% cases
Tech stack: Java 8+, JUnit 5

Description in ENG:
The code I provided is an implementation of a method in Java that takes in two strings and returns a boolean indicating whether they are anagrams (case-insensitive).
The method takes in two arguments of type String - s1 and s2. Then it converts both strings to lowercase using the toLowerCase() method. Then it creates arrays of characters s1Chars and s2Chars that contain the individual characters of the strings s1 and s2. The next step is to sort both arrays using the sort() method.
Then it compares both arrays of characters using the equals() method of the Arrays class and returns the result of that comparison.
If both arrays are identical, it means that the strings s1 and s2 are anagrams, and the method returns true. Otherwise it returns false.
In the test file AnagramCheckerTest, there are unit tests that test different scenarios. Each test calls the isAnagram() method with different parameters and checks if the returned result is consistent with the expectation.

Description in PL:
Kod, który przedstawiłem, jest implementacją metody w języku Java, która przyjmuje dwa ciągi znaków i zwraca wartość boolowską wskazującą, czy są one anagramami (niezależnie od wielkości liter).
Metoda przyjmuje dwa argumenty typu String - s1 i s2. Następnie oba ciągi znaków zamienia na małe litery za pomocą metody toLowerCase(). Następnie tworzy tablice znaków s1Chars i s2Chars, które zawierają poszczególne znaki z ciągów s1 i s2. Kolejnym krokiem jest sortowanie obu tablic za pomocą metody sort().
Następnie porównuje obie tablice znaków za pomocą metody equals() z klasy Arrays i zwraca wynik tego porównania. Jeśli obie tablice są identyczne, oznacza to, że ciągi znaków s1 i s2 są anagramami i metoda zwraca true. W przeciwnym razie zwraca false.
W pliku testowym AnagramCheckerTest, znajdują się testy jednostkowe, które testują różne scenariusze. Każdy test wywołuje metodę isAnagram() z różnymi parametrami i sprawdza czy zwracany wynik jest zgodny z oczekiwaniem.

