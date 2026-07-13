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
Character.isLetterOrDigit // return true if letter otherwise false
Character.toLowerCase(str.charAt(index)) // takes each char and converts it to lowercase

HASHMAP:
HashMap<Integer, Integer> map = new HashMap<>(); //Declares a map where key = the thing you're counting, value = its count.

// Core operations:

map.put(key, value) // Insert or overwrite - sets `key` to `value`, no matter what was there before.

map.get(key)  //Returns the value stored at `key`. Returns `null` if `key` doesn't exist — dangerous if you then try to do math on it (e.g. `null - 1` will throw an error). Only use `.get()` directly when you're sure the key exists.

map.containsKey(key) //Returns `true`/`false` — checks if `key` exists in the map at all. Use this before `.get()` if you're unsure the key is there.

map.getOrDefault(key, 0) // Returns the value at `key` if it exists, otherwise returns `0` (the fallback you pass in) instead of `null`. Safer than `.get()` when the key might be new.

// Increment count (building a frequency map)
map.put(key, map.getOrDefault(key, 0) + 1);
// "get current count, or 0 if new — then add 1 — then save it back"

// Decrement count (consuming/matching a frequency map)
map.put(key, map.get(key) - 1);
// "get current count (assumes key exists) — subtract 1 — save it back"

// Iterating:
map.keySet();   // returns all keys, e.g. for(char c : map.keySet())
map.values();   // returns all values, e.g. for(int v : map.values())

HASHSET:
HashSet<Integer> set = new HashSet<>();
set.add(value)
set.contains(value)

ARRAYLIST:
List<Integer> list = new ArrayList<>();
list.add(value)
list.get(index)
list.size()
result.add(Arrays.asList(a, b, c)); // creates a `List<Integer>` inline and adds it.

SORTING WITH LAMBDA:
list.sort((a, b) -> b - a)  // descending
list.sort((a, b) -> a - b)  // ascending
```
