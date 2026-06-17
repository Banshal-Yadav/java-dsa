
# Arrays & Hashing Short Notes

## 1. Contains Duplicate (217)
* **Pattern:** Instant Duplicate Detection (`HashSet`).
* **Core Logic:**
  
```java
if (!set.add(num)) return true; // Returns false if duplicate exists
````

---
## 2. Valid Anagram (242)

- **Pattern:** Frequency Counting Array/Map.
    
- **Core Logic:** Loop string A to increment counts, loop string B to decrement counts.

```java
map.put(c, map.getOrDefault(c, 0) + 1); // Up
map.put(c, map.get(c) - 1);            // Down
```

---
## 3. Two Sum (1)
* TC: O(n) | SC: O(n)
* **Pattern:** Complement Lookup (`HashMap`).
* **Core Logic:** Instead of nested loops, use a map to look for what you *need* to hit the target. Calculate `complement = target - nums[i]`. If the map has it, you found the pair. If not, save the current number and index.
* Recognize When: "find two elements", fixed target sum, single pass needed

```java
Map<Integer, Integer> map = new HashMap<>();

for (int i = 0; i < nums.length; i++) {
    int complement = target - nums[i];
    
    // Check if the number we need is already in memory
    if (map.containsKey(complement)) {
        return new int[] { map.get(complement), i };
    }
    
    // Save current number and its index for future lookups
    map.put(nums[i], i);
}
return new int[] {};
```

---
## 4. Top K Frequent Elements (347) - TC: O(n) | SC: O(n)


- **Pattern:** Map Count + Lambda Sort.
    
- **Core Logic:** Count items in a map, move keys to a list, sort list by map's values descending.

```java
keys.sort((a, b) -> map.get(b) - map.get(a)); // Higher frequency first
```

## 5. Longest Consecutive Sequence (128)
* **Pattern:** Chain Leader Detection (`HashSet`).
* **Core Logic:** A number is only the start of a sequence if `num - 1` does not exist. Only start counting upward from a true leader to maintain $O(n)$ time.

```java
// 1. Identify the Chain Leader
if (!set.contains(num - 1)) {
    int currentNum = num;
    int currentStreak = 1;
    
    // 2. Measure the Chain
    while (set.contains(currentNum + 1)) {
        currentNum += 1;
        currentStreak += 1;
    }
    longestStreak = Math.max(longestStreak, currentStreak);
}
```

```markdown
* **Why it's $O(n)$:** The inner `while` loop only executes once per sequence baseline, ensuring numbers are never scanned repeatedly.
* **Syntax Note:** `for (int num : set)` is a for-each loop that cleanly pulls unique items out of the collection one by one.
```

## Longest Consecutive sequence (my Note) - TC: O(n) | SC: O(n)
- we are given nums array 
-  we need to find longest consecutive sequence ( like 1, 2, 3, 4, 5 or 23, 24, 25, 26)
-  we use HashSet for quick lookup ( O(1) )
- put numbers in HashSet using a loop
-  create `longestStreak = 0` var
-  we process each random unique num from the set
   ```java
   for(int num : set)
   ```
-  then we check for chain leader
-  any num which has num-1 is not chain leader, we keep doing num-1 till we don't have  any number left, that last num will be chain leader
  ```java
  // if set doesnot contains num-1 we run the code
  if(!set.contains(num - 1)){
  int currentNum = num; // this number doesnot have any num -1
  int currentStreak = 1; // streak has starrted
  }
  ```
  
- now we have to go through all the next sequence possible , we use while loop

```java
// while loop runs as long as we have Consecutive sequence of num
while(set.contains(currentNum + 1)) {
 currentNumn += 1; // increment current number till no new number left
 currentStreak += 1; // increment currentStreak similarly
}
```

-  we save max `currentStreak` in `longestStreak` var

```java
longestStreak = Math.max(longestSteak, currentStreak);
```

- return `LongestStreak`

> why O(n)?
  the while loop only runs for chain leaders, so each number is visited once total

---
## 6. Binary Search (704)
* **Pattern:** Two-Pointer Divide and Conquer (Sorted Arrays Only).
* **Core Logic:** Track the search space using `left` and `right` indices. Calculate the absolute midpoint, check the value, and slice the search boundary in half.

  ```java
  int left = 0;
  int right = nums.length - 1; 

  while (left <= right) {
    int middle = left + (right - left) / 2; // Prevents integer overflow
    
    if (nums[middle] == target) return middle;
    
    if (nums[middle] < target) {
        left = middle + 1;  // Target is in the right half
    } else {
        right = middle - 1; // Target is in the left half
    }
  }
  return -1;
  ```

```markdown
* **Why it's $O(\log n)$:** Every single comparison discards half of the remaining elements.
* **Common Trap:** Storing `nums[nums.length - 1]` inside `right` instead of just the index `nums.length - 1`. Pointers track *where* you are looking, not *what* is inside.
```

---
## 7. Group Anagrams (49)

- **Pattern:** Categorize by Sorted Key.
    
- **Core Logic:** Sort word characters to create a uniform signature key for the HashMap.

```java
char[] chars = word.toCharArray();
Arrays.sort(chars);
String key = new String(chars); // "eat" and "tea" both become "aet"
```

---
## 8. Word Pattern (290)

- **Pattern:** 1-to-1 Bijective Mapping (Two Maps).
    
- **Core Logic:** Guard against cross-contamination by checking both directions simultaneously.

```java
HashMap<Character, String> charToWord;
HashMap<String, Character> wordToChar;
```

---
## 9. Product of Array Except Self (238) - TC: O(n) | SC: O(1)

- **Pattern:** Prefix/Suffix (Left/Right Accumulation).
- **Core Logic:** Total Product = (Everything to the Left) $\times$ (Everything to the Right).
- **Trap:** Java `new int[n]` fills with `0`s. Initialize your tracker to `1`, not `0`, to avoid zeroing out multiplications.

```java
int rightProduct = 1; // Seed value for safe multiplication
```

Product of Array Except Self ( my Notes) - TC: O(n) | SC: O(1)
-  we are given array of nums
-  we have to calculate product of numbers except self ( calculate product of all the num  on left and right and multiply them except  i index)
-  we use prefix and suffix  approach
-  we create new array `number[]` to store the values
-  we initialize `number[0] = 1`  since there is no number before that, and java stores 0  by default (we don't want to multiply by zero)

Prefix calculation

```java
for(int i = 1; i < nums.length; i++) {
 number[i] = number[i-1] * nums[i-1]; // we multiply first number from left and store it in numbert array from starting index 1
}
```

Suffix calculation

```java
int rightProduct = 1; // to store intermediate number so we dont overwrite prefix
for(int i = nums.length - 1; i >= 0; i--) {
number[i] = number[i] * rightProduct;
rightProduct *= nums[i];
}
```

return number;
> Output array does not count as extra space

---
##  10.  Encode and Decode Strings - TC: O(n) | SC: O(n)

> Design an algorithm to encode **a list of strings** to **a string**. The **encoded string** is then sent over the network and is **decoded** back to the **original list** of strings 

- we need to create encoder and decoder function
# Encoder
-  we can encode the given string by using `StringBuilder`
-  we use this to make changes with words inside string (more like adding things in   between words
-  we iterate through each word in the string list
-  we add word length in the start of every word
-  we add "#" before every word to tell the algo its start of a word
 - we then add words in the list
 -  we return list as string
 ```java
StringBuilder sb = new StringBuilder();
        for(String word : strs) {
            sb.append(word.length());
            sb.append("#");
            sb.append(word);
        }
        return sb.toString();
 ```
 
# Decoder

- we create ArrayList for storing the decoded words
- we iterate through string using `i` in a while loop
```java
while(i < str.length());
``` 

- we get "#" index in the given string from Encoder and stores it in j

```java
int j = str.indexOf("#", i);
```

- then we get the number (word length) which is between i and j

```java
int length = Integer.parseInt(str.substring(i, j));
```

- now we have got word length , # index so we can parse the word now

```java
String word = str.substring(j+1, j+1+length);
```

- store the eord in the list

```java
list.add(word);
```

- increment i to the next word
```java
i = j + 1+ length;
```

- return `list`