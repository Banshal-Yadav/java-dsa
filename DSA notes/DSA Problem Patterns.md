
# Arrays & Hashing Short Notes

## 1. Contains Duplicate (217)
* **Pattern:** Instant Duplicate Detection (`HashSet`).
* **Core Logic:**
  
```java
if (!set.add(num)) return true; // Returns false if duplicate exists
````


## 2. Valid Anagram (242)

- **Pattern:** Frequency Counting Array/Map.
    
- **Core Logic:** Loop string A to increment counts, loop string B to decrement counts.

```java
class ValidAnagram {
    public boolean ValidAnagrram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()) return false;
        
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int j = 0; j < t.length(); j++) {
            if(!map.containsKey(t.charAt(j))) {
                return false;
            } else if(map.get(t.charAt(j)) == 0) {
                return false;
            }
            map.put(t.charAt(j), map.get(t.charAt(j)) - 1);
        }

        return true;
    }
}
```


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


## 7. Group Anagrams (49)

- **Pattern:** Categorize by Sorted Key.
    
- **Core Logic:** Sort word characters to create a uniform signature key for the HashMap.

```java
char[] chars = word.toCharArray();
Arrays.sort(chars);
String key = new String(chars); // "eat" and "tea" both become "aet"
```


## 8. Word Pattern (290)

- **Pattern:** 1-to-1 Bijective Mapping (Two Maps).
    
- **Core Logic:** Guard against cross-contamination by checking both directions simultaneously.

```java
HashMap<Character, String> charToWord;
HashMap<String, Character> wordToChar;
```


## 9. Product of Array Except Self (238) - TC: O(n) | SC: O(1)

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


##  10.  Encode and Decode Strings - TC: O(n) | SC: O(n)

> Design an algorithm to encode **a list of strings** to **a string**. The **encoded string** is then sent over the network and is **decoded** back to the **original list** of strings 
 
 -  we need to create encoder and decoder function
 Encoder
 -  we can encode the given string by using `StringBuilder`
 -  we use this to make changes with words inside string (more like adding things in   between words)
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
Decoder
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
- store the word in the list
```java
list.add(word);
```
- increment i to the next word
```java
i = j + 1+ length;
```

- return `list`

##  11 .  Valid Palindrome (125) - TC: O(n) | SC: O(1)

`the questions ask to cehck if a sentesne is a palindrome or not, ignoring whote space and special characters ``
-  we proceed by the use of 2-pointers
-  left and right pointer
-  we use while loop (left < right)
-  inside which we have 2 separate while loop for checking whitespace,commas etc if its there skip it and move forward
```java
while(left <  right) {
	while(left < right && !Character.isLetterOrDigit(str.charAt(left))) {
		left++; // skip if not a letter
	}
	
	while(left < right && !Character.isLetterOrDigit(str.charAt(right))) {
		right--; // skip if not a letter
	}
	
	// compare both
	if(
Character.toLowerCase(str.charAt(left) ==         Character.toLowerCase(str.charAt(right)))  {
		left++;
		right--;
	} else {
		return false//  not a palindrome
	}
}

return true; //matched all letters from left to right 
```

- also applied for palindrome words check 


##  12.  Search a 2D Matrix (74) - TC: O(log(m·n)), SC: O(1)
`given 2d matrix, sorted , find target`

- we start by creating row and col var
```java
int m = matrix.length; // row num
int n = matrix[0].length; // col num
```
- then we create low and high var for storing index for finding mid of the 2d array
```java
int low = 0;
int high =  m*n - 1;
```

- we run `while` loop 
- calculate mid
- calculate row and col
- perform binary search
```java
while(low <= high) {
  int mid = low + (high - low) / 2;
  int row = mid/n;
  int col = mid%n;
  if(matrix[row][col] == target) return true;
  if(matrix[row][col] < target) {
   low = mid + 1;
  } else {
  high  = mid - 1;
  }
  
}
return false;
```

- recognize when -`2D matrix where each row is sorted AND last element of row < first element of next row`

## 13. Two Sum II - Input Array Is Sorted (167) -TC: O(n), SC: O(1)

`Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number, return there index add 1 to both indeces`

- we create left and right var for two pointers
```java
int left = 0;
int right = numbers.length - 1;
```
-  run while loop tille left < right
- if nums[left] + numes[right] == target return `new int[] {left+1, right+1}`
-  else if `sum < target` left++ // we shift left pointer since we need big number
- else right-- (sum > target) // we shift right pointer since we need smaller num
Recognize when: **sorted array + find pair summing to target.

## 14.   3Sum (15) - TC: O(n²), SC: O(1) (ignoring output list)

`Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
`Notice that the solution set must not contain duplicate triplets.`

- we need to sort the array
```java
Arrays.sort(nums);
```
- we need to return a list
- create new ArrayList
```java
List<List<Integer>> result = new ArrayList<>();
```
- we solve this by fixing one number and moving 2 pointer (like 2Sum question)
- we create outer for loop and inside while loop for 2 pointer

```java
for(int i = 0; i < nums.length; i++) {
//duplicate skip for i
if(i > 0 && nums[i] == nums[i-1]) continue;

int left = i+1;
int right = nums.length -1;
while( left < right) {
 if(nums[left] + nums[right] + nums[i] == 0) {
   result.add(Arrays.asList(nums[left], nums[right], nums[i]);
   left++;
   right--;
   // duplicate skip
    while(left < right && nums[left] == nums[left-1]) left++;
    while(left < right && nums[right] ==  nums[right+1]) right--;
    } else if(nums[left] + nums[right] + nums[i] < 0) {
            left++;
        } else {
            right--;
        }
    }
}
return result;
```
- Recognize when: **unsorted array + find all unique triplets summing to 0 (or any target).** Trigger = "all triplets" + no duplicates.

## 15 Container With Most Water (11) - TC: O(n), SC: O(1)

You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the `ith` line are `(i, 0)` and `(i, height[i])`.
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return _the maximum amount of water a container can store_.
**Notice** that you may not slant the container.

- we solve it using 2 pointers
- left and right
- var for area
- while loop with left < right
- inside while loop
- maxArea = Math.min(height[left], height[right]) * (right - left);
- update area with maxArea
- move small height inward 
- if(height[left] < height[right]) left++;
- else right--;
- return area;

- Recognize when: **array of heights + maximize area between two bars.**

## 16 Trapping Rain Water (42) - TC: O(n), SC : O(1)

`Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, compute how much water it can trap after raining.`

- we use two-pointer approach to solve this one
- we create left and right var
```java
int left = 0;
int right = height.length - 1;
```

- we create water-level , leftMax, rightMax var for keeping track of them
```java
int wl = 0, leftMAx = 0, rightMAx = 0;
```

- we use while loop
```java
while(left < right) {
   if(height[left] <= height[right]) {
    leftMax = MAth.max(leftMax, height[left]); //increment leftMax compared to height
    wl += leftMax - height[left]; // increment water level
    left++;    
   } else {
     rightMax = Math.max(rightMax, height[right]);
     wl += rightMax - height[right];
     right--;
   }
}
return wl;
```
- Recognize: "how much water between bars" → two pointer, track running max from both sides

## 17.  Best Time to Buy and Sell Stock (121)
`You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.`

### we can solve this using two approaches
#### 1. Two pointer: left=buy, right=sell, slide right forward
#### 2. Greedy: track minPrice seen so far, update maxProfit = max(maxProfit, price - minPrice)
(same O(n) / O(1). greedy is cleaner.)

#### 1. Two pointer

- we create left and right var
`left = 0`, `right = 1` // right is next to left which is start
- we create maxProfit var to keep track of max profit
- we create while loop untill right is less than prices.length
- we check of price at right is more than left and run `if` statement and calculate the profit
- else we move left to the right position
- increment right outside the if statement inside while loop
```java
    while(right < prices.length) {
        if(prices[right] > pricess[left]) {
            maxProfit =  Math.max(maxprofit, prices[right] - prices[left]);
        } else {
            left = right;
        }
        right++;
        }
        return maxProfit;
    }
```

#### 2. Greedy ()
 - we track min

## 18. Longest Substring Without Repeating Characters (3) - TC : O(N), SC : O(1)
`Given a string `s`, find the length of the longest substring without duplicate characters.`

- we solve this using HashMap and two pointer
- we create `left` and `result` variables
- for loop
- store char from string in `c` var
- chck if `c` is present in map 
- if present ssave max index in left
-  and if not update map  (both cases), then update result with `Math.max(result, right - left + 1)`.
```java
for(int right = 0; right < s.length() ; right++) {

            char c = s.charAt(right);

            if(map.containsKey(c)){

                left = Math.max(left, map.get(c) + 1);

            }

            map.put(c, right);

            result = Math.max(result, right - left + 1);

        }
```

- return ressult
- recognize when longest substring without repeating char
## 19 Longest Repeating Character Replacement (424)

You are given a string `s` and an integer `k`. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most `k` times. Return the length of the longest substring containing the same letter you can get after performing the above operations.

**Pattern:** Sliding Window (two pointers + HashMap)

- We create `left`, `maxFreq`, and `result` vars, and `right` as the for-loop variable
- Single for loop with `right` from 0 to `s.length()-1` - everything happens inside this one loop:
    - Put current char (`s.charAt(right)`) into HashMap, incrementing its count
    - Update `maxFreq = Math.max(maxFreq, map.get(c))`
    - While the window is invalid - condition: `(right - left + 1) - maxFreq > k`:
        - Get `leftChar = s.charAt(left)`
        - Decrement its count in the map: `map.put(leftChar, map.get(leftChar) - 1)`
        - `left++`
    - After the while loop, update result: `result = Math.max(result, right - left + 1)`
- Return `result`

**Key trap:** `maxFreq` is never decreased even when the window shrinks - it's a safe shortcut since an outdated maxFreq can only make the window _stricter_ temporarily, never wrong.

**TC:** O(n) - single pass, each char visited by `right` once, `left` moves forward only  
**SC:** O(1) - HashMap holds at most 26 uppercase letters