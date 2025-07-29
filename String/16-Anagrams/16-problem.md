# Anagram

---

## Problem Statement

Given two non-empty strings `s1` and `s2`, consisting only of lowercase English letters, determine whether they are anagrams of each other or not.  

Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order.

---

## Examples

### Example 1
**Input:**  
`s1 = "geeks"`
`s2 = "kseeg"`

**Output:**  
`true`

**Explanation:**  
Both the strings have the same characters with the same frequency. So, they are anagrams.

---

### Example 2
**Input:**  
`s1 = "allergy"`
`s2 = "allergyy"`

**Output:**  
`false`

**Explanation:**  
Although the characters are mostly the same, `s2` contains an extra `'y'` character. Since the frequency of characters differs, the strings are not anagrams.

---

### Example 3
**Input:**  
`s1 = "listen"`
`s2 = "lists"`

**Output:**  
`false`

**Explanation:**  
The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams.

---

## Constraints

- `1 ≤ s1.size(), s2.size() ≤ 10^5`
- `s1, s2` consist of lowercase English letters.

---

## Expected Complexities

- **Time Complexity:** `O(n + m)`  
- **Auxiliary Space:** `O(1)`


