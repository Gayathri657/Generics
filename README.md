Here are some practice problems on Generics and Wildcards to help you improve your understanding:
1. Generic Swap Method
Create a generic method swap that swaps two elements in an array. The method should work with any type of array, such as Integer, String, and Double. Use generics to achieve this.
2. Generic Pair Class
Create a class Pair that holds two objects of the same type (e.g., Integer, String). Then, write a method printPair that takes a Pair of any type and prints the two elements. Use generics to ensure type safety.
3. Generic Maximum Finder
Write a generic method findMax that takes an array of any type that implements Comparable<T>. The method should return the maximum element from the array.
4. Wildcard Upper Bound (<? extends T>)
Write a method printUpperBoundList that accepts a list of objects that are subclasses of a specific type, say Number (like Integer, Double, etc.). Print the elements of the list using generics and wildcards. The method signature will look like:
java
CopyEdit
public static void printUpperBoundList(List<? extends Number> list)
5. Wildcard Lower Bound (<? super T>)
Write a method addIntegersToList that accepts a list of type List<? super Integer> and adds a few integers to it. Print the list after the addition of the integers.
6. Generic Container Class
Create a generic class Container that can store an array of any type. Include a method to get the length of the array and a method to get the item at a given index. Then, test the class with multiple types of data.
7. Bounded Wildcards (? extends T vs ? super T)
Write a program to demonstrate the difference between bounded wildcards ? extends T and ? super T. Create two lists:
•	One using List<? extends Number>
•	One using List<? super Integer>
Then, try adding and retrieving elements from these lists, and observe the differences.
8. Wildcard in Generic Method
Write a generic method sumList that calculates the sum of a list of numbers (e.g., Integer, Double, Float). Use wildcards to make the method work with lists of any subclass of Number.
9. Generic Stack Implementation
Implement a generic Stack class that supports push and pop operations. Then, create a method peek to return the element on top of the stack without removing it. Test it using Integer, String, and Double types.
10. Generic Intersection
Write a method findIntersection that finds the intersection of two lists of elements that implement Comparable<T>. The method should return a list containing the common elements between the two input lists.
11. Covariant Return Type
Create a generic superclass Animal and subclass Dog. Define a method create in the superclass that returns an Animal object and override it in the subclass to return a Dog object. Show how you can use covariant return types with generics.
12. Generic Class with Multiple Type Parameters
Create a class Triple<T, U, V> that holds three objects of types T, U, and V. Implement the getFirst, getSecond, and getThird methods to access the respective elements. Test it with different types (like String, Integer, Double).

