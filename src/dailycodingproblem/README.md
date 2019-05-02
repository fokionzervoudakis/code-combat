# Daily Coding Problem

- [Daily Coding Problem](#daily-coding-problem)
  - [Problem #1 [Easy]](#problem-1-easy)
  - [Problem #2 [Hard]](#problem-2-hard)
  - [Problem #3 [Medium]](#problem-3-medium)
  - [Problem #4 [Hard]](#problem-4-hard)
  - [Problem #5 [Medium]](#problem-5-medium)
  - [Problem #9 [Hard]](#problem-9-hard)
  - [Problem #10 [Medium]](#problem-10-medium)
  - [Problem #11 [Medium]](#problem-11-medium)
  - [Problem #12 [Hard]](#problem-12-hard)
  - [Problem #13 [Hard]](#problem-13-hard)
  - [Problem #14 [Medium]](#problem-14-medium)
  - [Problem #15 [Medium]](#problem-15-medium)
  - [Problem #16 [Easy]](#problem-16-easy)
  - [Problem #17 [Hard]](#problem-17-hard)
  - [Problem #18 [Hard]](#problem-18-hard)
  - [Problem #19 [Medium]](#problem-19-medium)
  - [Problem #20 [Easy]](#problem-20-easy)
  - [Problem #21 [Easy]](#problem-21-easy)
  - [Problem #22 [Medium]](#problem-22-medium)
  - [Problem #23 [Easy]](#problem-23-easy)
  - [Problem #24 [Medium]](#problem-24-medium)
  - [Problem #25 [Hard]](#problem-25-hard)
  - [Problem #26 [Medium]](#problem-26-medium)
  - [Problem #27 [Easy]](#problem-27-easy)
  - [Problem #28 [Medium]](#problem-28-medium)
  - [Problem #29 [Easy]](#problem-29-easy)
  - [Problem #30 [Medium]](#problem-30-medium)
  - [Problem #31 [Easy]](#problem-31-easy)
  - [Problem #32 [Hard]](#problem-32-hard)
  - [Problem #33 [Easy]](#problem-33-easy)
  - [Problem #34 [Medium]](#problem-34-medium)
  - [Problem #35 [Hard]](#problem-35-hard)
  - [Problem #36 [Medium]](#problem-36-medium)
  - [Problem #37 [Easy]](#problem-37-easy)
  - [Problem #38 [Hard]](#problem-38-hard)
  - [Problem #39 [Medium]](#problem-39-medium)
  - [Problem #40 [Hard]](#problem-40-hard)
  - [Problem #41 [Medium]](#problem-41-medium)
  - [Problem #42 [Hard]](#problem-42-hard)
  - [Problem #43 [Easy]](#problem-43-easy)
  - [Problem #44 [Medium]](#problem-44-medium)
  - [Problem #45 [Easy]](#problem-45-easy)
  - [Problem #46 [Hard]](#problem-46-hard)
  - [Problem #47 [Easy]](#problem-47-easy)
  - [Problem #48 [Medium]](#problem-48-medium)
  - [Problem #49 [Medium]](#problem-49-medium)
  - [Problem #50 [Easy]](#problem-50-easy)
  - [Problem #51 [Medium]](#problem-51-medium)
  - [Problem #52 [Hard]](#problem-52-hard)

## Problem #1 [Easy]

This problem was recently asked by <u>Google</u>.

Given a list of numbers and a number ```k```, return whether any two numbers from the list add up to ```k```.

For example, given ```[10, 15, 3, 7]``` and ```k``` of ```17```, return true since ```10 + 7``` is ```17```.

Bonus: Can you do this in one pass?

[Solution](problems_001_010/Problem_001.java)

## Problem #2 [Hard]

This problem was asked by <u>Uber</u>.

Given an array of integers, return a new array such that each element at index ```i``` of the new array is the product of all the numbers in the original array except the one at ```i```.

For example, if our input was ```[1, 2, 3, 4, 5]```, the expected output would be ```[120, 60, 40, 30, 24]```. If our input was ```[3, 2, 1]```, the expected output would be ```[2, 3, 6]```.

Follow-up: what if you can't use division?

[Solution](problems_001_010/Problem_002.java)

## Problem #3 [Medium]

This problem was asked by <u>Google</u>.

Given the root to a binary tree, implement ```serialize(root)```, which serializes the tree into a string, and ```deserialize(s)```, which deserializes the string back into the tree.

For example, given the following Node class

```python
class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
```

The following test should pass:

```python
node = Node('root', Node('left', Node('left.left')), Node('right'))
assert deserialize(serialize(node)).left.left.val == 'left.left'
```

[Solution](problems_001_010/Problem_003.java)

## Problem #4 [Hard]

This problem was asked by <u>Stripe</u>.

Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input ```[3, 4, -1, 1]``` should give ```2```. The input ```[1, 2, 0]``` should give ```3```.

You can modify the input array in-place.

[Solution](problems_001_010/Problem_004.java)

## Problem #5 [Medium]

This problem was asked by <u>Jane Street</u>.

```cons(a, b)``` constructs a pair, and ```car(pair)``` and ```cdr(pair)``` returns the first and last element of that pair. For example, ```car(cons(3, 4))``` returns ```3```, and ```cdr(cons(3, 4))``` returns ```4```.

Given this implementation of ```cons```:

```python
def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair
```

Implement ```car``` and ```cdr```.

[Solution](problems_001_010/Problem_005.java)

## Problem #6 [Hard]

This problem was asked by <u>Google</u>.

An XOR linked list is a more memory efficient doubly linked list. Instead of each node holding ```next``` and ```prev``` fields, it holds a field named ```both```, which is an XOR of the next node and the previous node. Implement an XOR linked list; it has an ```add(element)``` which adds the element to the end, and a ```get(index)``` which returns the node at index.

If using a language that has no pointers (such as Python), you can assume you have access to ```get_pointer``` and ```dereference_pointer``` functions that converts between nodes and memory addresses.

[Solution](problems_001_010/Problem_006.java)

## Problem #7 [Medium]

This problem was asked by <u>Facebook</u>.

Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

You can assume that the messages are decodable. For example, '001' is not allowed.

[Solution](problems_001_010/Problem_007.java)

## Problem #8 [Easy]

This problem was asked by <u>Google</u>.

A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.

Given the root to a binary tree, count the number of unival subtrees.

For example, the following tree has 5 unival subtrees:

```
  0
 / \
1   0
   / \
  1   0
 / \
1   1
 ```

[Solution](problems_001_010/Problem_008.java)

## Problem #9 [Hard]

This problem was asked by <u>Airbnb</u>.

Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be ```0``` or negative.

For example, ```[2, 4, 6, 2, 5]``` should return ```13```, since we pick ```2```, ```6```, and ```5```. ```[5, 1, 1, 5]``` should return ```10```, since we pick ```5``` and ```5```.

Follow-up: Can you do this in O(N) time and constant space?

[Solution](problems_001_010/Problem_009.java)

## Problem #10 [Medium]

This problem was asked by <u>Apple</u>.

Implement a job scheduler which takes in a function ```f``` and an integer ```n```, and calls ```f``` after ```n``` milliseconds.

[Solution](problems_001_010/Problem_010.java)

## Problem #11 [Medium]

This problem was asked by <u>Twitter</u>.

Implement an autocomplete system. That is, given a query string ```s``` and a set of all possible query strings, return all strings in the set that have ```s``` as a prefix.

For example, given the query string ```de``` and the set of strings ```[dog, deer, deal]```, return ```[deer, deal]```.

Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.

[Solution](problems_011_020/Problem_011.java)

## Problem #12 [Hard]

This problem was asked by <u>Amazon</u>.

There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.

For example, if N is 4, then there are 5 unique ways:

- 1, 1, 1, 1
- 2, 1, 1
- 1, 2, 1
- 1, 1, 2
- 2, 2

What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X? For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time.

[Solution](problems_011_020/Problem_012.java)

## Problem #13 [Hard]

This problem was asked by <u>Amazon</u>.

Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.

For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb".

[Solution](problems_011_020/Problem_013.java)

## Problem #14 [Medium]

This problem was asked by <u>Google</u>.

The area of a circle is defined as $\pi r^2$. Estimate $\pi$ to 3 decimal places using a Monte Carlo method.

Hint: The basic equation of a circle is $x^2 + y^2 = r^2$.

[Solution](problems_011_020/Problem_014.java)

## Problem #15 [Medium]

This problem was asked by <u>Facebook</u>.

Given a stream of elements too large to store in memory, pick a random element from the stream with uniform probability.

[Solution](problems_011_020/Problem_015.java)

## Problem #16 [Easy]

This problem was asked by <u>Twitter</u>.

You run an e-commerce website and want to record the last ```N order``` ids in a log. Implement a data structure to accomplish this, with the following API:

- ```record(order_id)```: adds the order_id to the log
- ```get_last(i)```: gets the ith last element from the log. ```i``` is guaranteed to be smaller than or equal to ```N```.

You should be as efficient with time and space as possible.

[Solution](problems_011_020/Problem_016.java)

## Problem #17 [Hard]

This problem was asked by <u>Google</u>.

Suppose we represent our file system by a string in the following manner:

The string ```"dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"``` represents:

```
dir
    subdir1
    subdir2
        file.ext
```

The directory ```dir``` contains an empty sub-directory ```subdir1``` and a sub-directory ```subdir2``` containing a file ```file.ext```.

The string ```"dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"``` represents:

```
dir
    subdir1
        file1.ext
        subsubdir1
    subdir2
        subsubdir2
            file2.ext
```

The directory ```dir``` contains two sub-directories ```subdir1``` and ```subdir2```. ```subdir1``` contains a file ```file1.ext``` and an empty second-level sub-directory ```subsubdir1```. ```subdir2``` contains a second-level sub-directory ```subsubdir2``` containing a file ```file2.ext```.

We are interested in finding the longest (number of characters) absolute path to a file within our file system. For example, in the second example above, the longest absolute path is ```"dir/subdir2/subsubdir2/file2.ext"```, and its length is 32 (not including the double quotes).

Given a string representing the file system in the above format, return the length of the longest absolute path to a file in the abstracted file system. If there is no file in the system, return 0.

Note:

The name of a file contains at least a period and an extension.

The name of a directory or sub-directory will not contain a period.

[Solution](problems_011_020/Problem_017.java)

## Problem #18 [Hard]

This problem was asked by <u>Google</u>.

Given an array of integers and a number k, where 1 <= k <= length of the array, compute the maximum values of each subarray of length k.

For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10, 7, 8, 8], since:

- 10 = max(10, 5, 2)
- 7 = max(5, 2, 7)
- 8 = max(2, 7, 8)
- 8 = max(7, 8, 7)

Do this in O(n) time and O(k) space. You can modify the input array in-place and you do not need to store the results. You can simply print them out as you compute them.

[Solution](problems_011_020/Problem_018.java)

## Problem #19 [Medium]

This problem was asked by <u>Facebook</u>.

A builder is looking to build a row of N houses that can be of K different colors. He has a goal of minimizing cost while ensuring that no two neighboring houses are of the same color.

Given an N by K matrix where the nth row and kth column represents the cost to build the nth house with kth color, return the minimum cost which achieves this goal.

[Solution](problems_011_020/Problem_019.java)

## Problem #20 [Easy]

This problem was asked by <u>Google</u>.

Given two singly linked lists that intersect at some point, find the intersecting node. The lists are non-cyclical.

For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.

In this example, assume nodes with the same value are the exact same node objects.

Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.

[Solution](problems_011_020/Problem_020.java)

## Problem #21 [Easy]

This problem was asked by <u>Snapchat</u>.

Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), find the minimum number of rooms required.

For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.

[Solution](problems_021_030/Problem_021.java)

## Problem #22 [Medium]

This problem was asked by <u>Microsoft</u>.

Given a dictionary of words and a string made up of those words (no spaces), return the original sentence in a list. If there is more than one possible reconstruction, return any of them. If there is no possible reconstruction, then return null.

For example, given the set of words 'quick', 'brown', 'the', 'fox', and the string "thequickbrownfox", you should return ['the', 'quick', 'brown', 'fox'].

Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond', and the string "bedbathandbeyond", return either ['bed', 'bath', 'and', 'beyond] or ['bedbath', 'and', 'beyond'].

[Solution](problems_021_030/Problem_022.java)

## Problem #23 [Easy]

This problem was asked by <u>Google</u>.

You are given an M by N matrix consisting of booleans that represents a board. Each True boolean represents a wall. Each False boolean represents a tile you can walk on.

Given this matrix, a start coordinate, and an end coordinate, return the minimum number of steps required to reach the end coordinate from the start. If there is no possible path, then return null. You can move up, left, down, and right. You cannot move through walls. You cannot wrap around the edges of the board.

For example, given the following board:

```
[[f, f, f, f],
 [t, t, f, t],
 [f, f, f, f],
 [f, f, f, f]]
```

and start = (3, 0) (bottom left) and end = (0, 0) (top left), the minimum number of steps required to reach the end is 7, since we would need to go through (1, 2) because there is a wall everywhere else on the second row.

[Solution](problems_021_030/Problem_023.java)

## Problem #24 [Medium]

This problem was asked by <u>Google</u>.

Implement locking in a binary tree. A binary tree node can be locked or unlocked only if all of its descendants or ancestors are not locked.

Design a binary tree node class with the following methods:

- ```is_locked```, which returns whether the node is locked
- ```lock```, which attempts to lock the node. If it cannot be locked, then it should return false. Otherwise, it should lock it and return true.
- ```unlock```, which unlocks the node. If it cannot be unlocked, then it should return false. Otherwise, it should unlock it and return true.

You may augment the node to add parent pointers or any other property you would like. You may assume the class is used in a single-threaded program, so there is no need for actual locks or mutexes. Each method should run in O(h), where h is the height of the tree.

[Solution](problems_021_030/Problem_024.java)

## Problem #25 [Hard]

This problem was asked by <u>Facebook</u>.

Implement regular expression matching with the following special characters:

- \. (period) which matches any single character
- \* (asterisk) which matches zero or more of the preceding element
That is, implement a function that takes in a string and a valid regular expression and returns whether or not the string matches the regular expression.

For example, given the regular expression "ra." and the string "ray", your function should return true. The same regular expression on the string "raymond" should return false.

Given the regular expression ".*at" and the string "chat", your function should return true. The same regular expression on the string "chats" should return false.

[Solution](problems_021_030/Problem_025.java)

## Problem #26 [Medium]

This problem was asked by <u>Google</u>.

Given a singly linked list and an integer k, remove the kth last element from the list. k is guaranteed to be smaller than the length of the list.

The list is very long, so making more than one pass is prohibitively expensive.

Do this in constant space and in one pass.

[Solution](problems_021_030/Problem_026.java)

## Problem #27 [Easy]

This problem was asked by <u>Facebook</u>.

Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).

For example, given the string "\(\[\]\)\[\]\(\{\}\)", you should return true.

Given the string "\(\[\)\]" or "\(\(\(\)", you should return false.

[Solution](problems_021_030/Problem_027.java)

## Problem #28 [Medium]

This problem was asked by <u>Palantir</u>.

Write an algorithm to justify text. Given a sequence of words and an integer line length k, return a list of strings which represents each line, fully justified.

More specifically, you should have as many words as possible in each line. There should be at least one space between each word. Pad extra spaces when necessary so that each line has exactly length k. Spaces should be distributed as equally as possible, with the extra spaces, if any, distributed starting from the left.

If you can only fit one word on a line, then you should pad the right-hand side with spaces.

Each word is guaranteed not to be longer than k.

For example, given the list of words ["the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"] and k = 16, you should return the following:

```
["the  quick brown", # 1 extra space on the left
 "fox  jumps  over", # 2 extra spaces distributed evenly
 "the   lazy   dog"] # 4 extra spaces distributed evenly
```

[Solution](problems_021_030/Problem_028.java)

## Problem #29 [Easy]

This problem was asked by <u>Amazon</u>.

Run-length encoding is a fast and simple method of encoding strings. The basic idea is to represent repeated successive characters as a single count and character. For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".

Implement run-length encoding and decoding. You can assume the string to be encoded have no digits and consists solely of alphabetic characters. You can assume the string to be decoded is valid.

[Solution](problems_021_030/Problem_029.java)

## Problem #30 [Medium]

This problem was asked by <u>Facebook</u>.

You are given an array of non-negative integers that represents a two-dimensional elevation map where each element is unit-width wall and the integer is the height. Suppose it will rain and all spots between two walls get filled up.

Compute how many units of water remain trapped on the map in O(N) time and O(1) space.

For example, given the input [2, 1, 2], we can hold 1 unit of water in the middle.

Given the input [3, 0, 1, 3, 0, 5], we can hold 3 units in the first index, 2 in the second, and 3 in the fourth index (we cannot hold 5 since it would run off to the left), so we can trap 8 units of water.

[Solution](problems_021_030/Problem_030.java)

## Problem #31 [Easy]

This problem was asked by <u>Google</u>.

The edit distance between two strings refers to the minimum number of character insertions, deletions, and substitutions required to change one string to the other. For example, the edit distance between "kitten" and "sitting" is three: substitute the "k" for "s", substitute the "e" for "i", and append a "g".

Given two strings, compute the edit distance between them.

[Solution](problems_031_040/Problem_031.java)

## Problem #32 [Hard]

This problem was asked by <u>Jane Street</u>.

Suppose you are given a table of currency exchange rates, represented as a 2D array. Determine whether there is a possible arbitrage: that is, whether there is some sequence of trades you can make, starting with some amount A of any currency, so that you can end up with some amount greater than A of that currency.

There are no transaction costs and you can trade fractional quantities.

[Solution](problems_031_040/Problem_032.java)

## Problem #33 [Easy]

This problem was asked by <u>Microsoft</u>.

Compute the running median of a sequence of numbers. That is, given a stream of numbers, print out the median of the list so far on each new element.

Recall that the median of an even-numbered list is the average of the two middle numbers.

For example, given the sequence [2, 1, 5, 7, 2, 0, 5], your algorithm should print out:

```
2
1.5
2
3.5
2
2
2
```

[Solution](problems_031_040/Problem_033.java)

## Problem #34 [Medium]

This problem was asked by <u>Quora</u>.

Given a string, find the palindrome that can be made by inserting the fewest number of characters as possible anywhere in the word. If there is more than one palindrome of minimum length that can be made, return the lexicographically earliest one (the first one alphabetically).

For example, given the string "race", you should return "ecarace", since we can add three letters to it (which is the smallest amount to make a palindrome). There are seven other palindromes that can be made from "race" by adding three letters, but "ecarace" comes first alphabetically.

As another example, given the string "google", you should return "elgoogle".

[Solution](problems_031_040/Problem_034.java)

## Problem #35 [Hard]

This problem was asked by <u>Google</u>.

Given an array of strictly the characters 'R', 'G', and 'B', segregate the values of the array so that all the Rs come first, the Gs come second, and the Bs come last. You can only swap elements of the array.

Do this in linear time and in-place.

For example, given the array ['G', 'B', 'R', 'R', 'B', 'R', 'G'], it should become ['R', 'R', 'R', 'G', 'G', 'B', 'B'].

[Solution](problems_031_040/Problem_035.java)

## Problem #36 [Medium]

This problem was asked by <u>Dropbox</u>.

Given the root to a binary search tree, find the second largest node in the tree.

[Solution](problems_031_040/Problem_036.java)

## Problem #37 [Easy]

This problem was asked by <u>Google</u>.

The power set of a set is the set of all its subsets. Write a function that, given a set, generates its power set.

For example, given the set ```{1, 2, 3}```, it should return ```{{}, {1}, {2}, {3}, {1, 2}, {1, 3}, {2, 3}, {1, 2, 3}}```.

You may also use a list or array to represent a set.

[Solution](problems_031_040/Problem_037.java)

## Problem #38 [Hard]

This problem was asked by <u>Microsoft</u>.

You have an N by N board. Write a function that, given N, returns the number of possible arrangements of the board where N queens can be placed on the board without threatening each other, i.e. no two queens share the same row, column, or diagonal.

[Solution](problems_031_040/Problem_038.java)

## Problem #39 [Medium]

This problem was asked by <u>Dropbox</u>.

Conway's Game of Life takes place on an infinite two-dimensional board of square cells. Each cell is either dead or alive, and at each tick, the following rules apply:

- Any live cell with less than two live neighbours dies.
- Any live cell with two or three live neighbours remains living.
- Any live cell with more than three live neighbours dies.
- Any dead cell with exactly three live neighbours becomes a live cell.
- A cell neighbours another cell if it is horizontally, vertically, or diagonally adjacent.

Implement Conway's Game of Life. It should be able to be initialized with a starting list of live cell coordinates and the number of steps it should run for. Once initialized, it should print out the board state at each step. Since it's an infinite board, print out only the relevant coordinates, i.e. from the top-leftmost live cell to bottom-rightmost live cell.

You can represent a live cell with an asterisk (*) and a dead cell with a dot (.).

[Solution](problems_031_040/Problem_039.java)

## Problem #40 [Hard]

This problem was asked by <u>Google</u>.

Given an array of integers where every integer occurs three times except for one integer, which only occurs once, find and return the non-duplicated integer.

For example, given [6, 1, 3, 3, 3, 6, 6], return 1. Given [13, 19, 13, 13], return 19.

Do this in O(N) time and O(1) space.

[Solution](problems_031_040/Problem_040.java)

## Problem #41 [Medium]

This problem was asked by <u>Facebook</u>.

Given an unordered list of flights taken by someone, each represented as (origin, destination) pairs, and a starting airport, compute the person's itinerary. If no such itinerary exists, return null. If there are multiple possible itineraries, return the lexicographically smallest one. All flights must be used in the itinerary.

For example, given the list of flights [('SFO', 'HKO'), ('YYZ', 'SFO'), ('YUL', 'YYZ'), ('HKO', 'ORD')] and starting airport 'YUL', you should return the list ['YUL', 'YYZ', 'SFO', 'HKO', 'ORD'].

Given the list of flights [('SFO', 'COM'), ('COM', 'YYZ')] and starting airport 'COM', you should return null.

Given the list of flights [('A', 'B'), ('A', 'C'), ('B', 'C'), ('C', 'A')] and starting airport 'A', you should return the list ['A', 'B', 'C', 'A', 'C'] even though ['A', 'C', 'A', 'B', 'C'] is also a valid itinerary. However, the first one is lexicographically smaller.

[Solution](problems_041_050/Problem_041.java)

## Problem #42 [Hard]

This problem was asked by <u>Google</u>.

Given a list of integers S and a target number k, write a function that returns a subset of S that adds up to k. If such a subset cannot be made, then return null.

Integers can appear more than once in the list. You may assume all numbers in the list are positive.

For example, given S = [12, 1, 61, 5, 9, 2] and k = 24, return [12, 9, 2, 1] since it sums up to 24.

[Solution](problems_041_050/Problem_042.java)

## Problem #43 [Easy]

This problem was asked by <u>Amazon</u>.

Implement a stack that has the following methods:

- push(val), which pushes an element onto the stack
- pop(), which pops off and returns the topmost element of the stack. If there are no elements in the stack, then it should throw an error or return null.
- max(), which returns the maximum value in the stack currently. If there are no elements in the stack, then it should throw an error or return null.

Each method should run in constant time.

[Solution](problems_041_050/Problem_043.java)

## Problem #44 [Medium]

This problem was asked by <u>Google</u>.

We can determine how "out of order" an array A is by counting the number of inversions it has. Two elements A[i] and A[j] form an inversion if A[i] > A[j] but i < j. That is, a smaller element appears after a larger element.

Given an array, count the number of inversions it has. Do this faster than O(N^2) time.

You may assume each element in the array is distinct.

For example, a sorted list has zero inversions. The array [2, 4, 1, 3, 5] has three inversions: (2, 1), (4, 1), and (4, 3). The array [5, 4, 3, 2, 1] has ten inversions: every distinct pair forms an inversion.

[Solution](problems_041_050/Problem_044.java)

## Problem #45 [Easy]

This problem was asked by <u>Two Sigma</u>.

Using a function rand5() that returns an integer from 1 to 5 (inclusive) with uniform probability, implement a function rand7() that returns an integer from 1 to 7 (inclusive).

[Solution](problems_041_050/Problem_045.java)

## Problem #46 [Hard]

This problem was asked by <u>Amazon</u>.

Given a string, find the longest palindromic contiguous substring. If there are more than one with the maximum length, return any one.

For example, the longest palindromic substring of "aabcdcb" is "bcdcb". The longest palindromic substring of "bananas" is "anana".

[Solution](problems_041_050/Problem_046.java)

## Problem #47 [Easy]

This problem was asked by <u>Facebook</u>.

Given a array of numbers representing the stock prices of a company in chronological order, write a function that calculates the maximum profit you could have made from buying and selling that stock once. You must buy before you can sell it.

For example, given [9, 11, 8, 5, 7, 10], you should return 5, since you could buy the stock at 5 dollars and sell it at 10 dollars.

[Solution](problems_041_050/Problem_047.java)

## Problem #48 [Medium]

This problem was asked by <u>Google</u>.

Given pre-order and in-order traversals of a binary tree, write a function to reconstruct the tree.

For example, given the following preorder traversal:

```
[a, b, d, e, c, f, g]
```

And the following inorder traversal:

```
[d, b, e, a, f, c, g]
```

You should return the following tree:

```
    a
   / \
  b   c
 / \ / \
d  e f  g
```

[Solution](problems_041_050/Problem_048.java)

## Problem #49 [Medium]

This problem was asked by <u>Amazon</u>.

Given an array of numbers, find the maximum sum of any contiguous subarray of the array.

For example, given the array [34, -50, 42, 14, -5, 86], the maximum sum would be 137, since we would take elements 42, 14, -5, and 86.

Given the array [-5, -1, -8, -9], the maximum sum would be 0, since we would not take any elements.

Do this in O(N) time.

[Solution](problems_041_050/Problem_049.java)

## Problem #50 [Easy]

This problem was asked by <u>Microsoft</u>.

Suppose an arithmetic expression is given as a binary tree. Each leaf is an integer and each internal node is one of '+', '−', '∗', or '/'.

Given the root to such a tree, write a function to evaluate it.

For example, given the following tree:

```
    *
   / \
  +    +
 / \  / \
3  2  4  5
```

You should return 45, as it is (3 + 2) * (4 + 5).

[Solution](problems_041_050/Problem_050.java)

## Problem #51 [Medium]

This problem was asked by <u>Facebook</u>.

Given a function that generates perfectly random numbers between 1 and k (inclusive), where k is an input, write a function that shuffles a deck of cards represented as an array using only swaps.

It should run in O(N) time.

Hint: Make sure each one of the 52! permutations of the deck is equally likely.

[Solution](problems_051_060/Problem_051.java)

## Problem #52 [Hard]

This problem was asked by <u>Google</u>.

Implement an LRU (Least Recently Used) cache. It should be able to be initialized with a cache size n, and contain the following methods:

- set(key, value): sets key to value. If there are already n items in the cache and we are adding a new item, then it should also remove the least recently used item.
- get(key): gets the value at key. If no such key exists, return null.

Each operation should run in O(1) time.

[Solution](problems_051_060/Problem_052.java)

