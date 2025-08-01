# Search Pattern (KMP Algorithm)

---

## Problem Statement

Given two strings, one is a text string `txt` and the other is a pattern string `pat`. The task is to print the indexes of all the occurrences of the pattern string in the text string. Use **0-based indexing** while returning the indices.

> **Note:** Return an empty list in case of no occurrences of pattern.

---

## Examples

### Example 1:
**Input:**  
`txt = "abcab"`  
`pat = "ab"`  
**Output:**  
`[0, 3]`  
**Explanation:**  
The string "ab" occurs twice in `txt`, once at index 0 and again at index 3.

---

### Example 2:
**Input:**  
`txt = "abesdu"`  
`pat = "edu"`  
**Output:**  
`[]`  
**Explanation:**  
There's no substring "edu" present in `txt`.

---

### Example 3:
**Input:**  
`txt = "aabaacaadaabaaba"`  
`pat = "aaba"`  
**Output:**  
`[0, 9, 12]`  
**Explanation:**  
The pattern "aaba" appears at indices 0, 9, and 12.

---

## Constraints

- `1 ≤ txt.length ≤ 10^6`
- `1 ≤ pat.length < txt.length`
- Both strings consist of lowercase English alphabets only.

---

## Expected Time & Space Complexity

- **Time Complexity:** O(n + m)  
- **Auxiliary Space:** O(m)

