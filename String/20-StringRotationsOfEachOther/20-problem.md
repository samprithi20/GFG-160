# Strings Rotations of Each Other

---

## Problem Statement

You are given two strings `s1` and `s2`, of equal lengths. The task is to check if `s2` is a **rotated version** of the string `s1`.

> **Note:**  
> A string is a rotation of another if it can be formed by moving characters from the start to the end (or vice versa) without rearranging them.

---

## Examples

### Example 1

**Input:**  
`s1 = "abcd"`  
`s2 = "cdab"`  

**Output:**  
`true`  

**Explanation:**  
After 2 right rotations, `s1` becomes equal to `s2`.

---

### Example 2

**Input:**  
`s1 = "aab"`  
`s2 = "aba"`  

**Output:**  
`true`  

**Explanation:**  
After 1 left rotation, `s1` becomes equal to `s2`.

---

### Example 3

**Input:**  
`s1 = "abcd"`  
`s2 = "acbd"`  

**Output:**  
`false`  

**Explanation:**  
Strings are not rotations of each other.

---

## Constraints

- `1 ≤ s1.size(), s2.size() ≤ 10^5`
- `s1`, `s2` consist of lowercase English alphabets

---

## Expected Complexities

- **Time Complexity:** O(n)  
- **Auxiliary Space:** O(n)
