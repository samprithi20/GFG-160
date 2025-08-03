# Min Chars to Add for Palindrome

---

## Problem Statement

Given a string `s`, the task is to find the minimum number of characters that must be added **at the front** of the string to make it a palindrome.

> **Note:**  
> A palindrome string is a sequence of characters that reads the same forward and backward.

---

## Examples

### Example 1

**Input:**  
`s = "abc"`  

**Output:**  
`2`

**Explanation:**  
Add `'b'` and `'c'` at the front to make the string a palindrome:  
`"cbabc"`

---

### Example 2

**Input:**  
`s = "aacecaaaa"`  

**Output:**  
`2`

**Explanation:**  
Add 2 `'a'`s at the front to make it a palindrome:  
`"aaaacecaaaa"`

---

## Constraints

- `1 ≤ s.size() ≤ 10^6`
- `s` consists of lowercase English alphabets

---

## Expected Complexities

- **Time Complexity:** O(n)  
- **Auxiliary Space:** O(n)

