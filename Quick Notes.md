```java
ARRAYS:
Arrays.sort(arr)
arr.length

STRINGS:
str.charAt(i)        // returns char at index i
str.toCharArray()    // converts string to char[]
new String(charArray) // converts char[] back to String
str.split(" ")       // splits string by space, returns String[]
StringBuilder sb = new StringBuilder() // mutable string builder
sb.append("Hello")   // adds "Hello" to the end of sb
sb.toString()        // converts StringBuilder to String
Integer.parseInt("6") // converts String to int
str.substring(i, j)  // returns string from i to j (j excluded)
str.indexOf("h", i)  // returns index of "h" starting search from i

HASHMAP:
HashMap<Integer, Integer> map = new HashMap<>();
map.put(key, value)
map.get(key)
map.containsKey(key)
map.getOrDefault(key, 0)
map.keySet()
map.values()

HASHSET:
HashSet<Integer> set = new HashSet<>();
set.add(value)
set.contains(value)

ARRAYLIST:
List<Integer> list = new ArrayList<>();
list.add(value)
list.get(index)
list.size()

SORTING WITH LAMBDA:
list.sort((a, b) -> b - a)  // descending
list.sort((a, b) -> a - b)  // ascending
```
