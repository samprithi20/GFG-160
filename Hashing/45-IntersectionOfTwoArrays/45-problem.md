# Intersection of Two Arrays with Duplicate Elements

---

## Problem Statement

Given two integer arrays `a[]` and `b[]`, you have to find the **intersection** of the two arrays.  
The intersection of two arrays is said to be the elements that are **common in both arrays**.  

The intersection **should not have duplicate elements**, and the result can contain items in **any order**.

> **Note:** The driver code will sort the resulting array in increasing order before printing.

---

## Examples

### Example 1
**Input:**  
a = [1, 2, 1, 3, 1]
b = [3, 1, 3, 4, 1]

**Output:**  
[1, 3]

**Explanation:**  
1 and 3 are the only common elements, and we need to print only one occurrence of each.

---

### Example 2
**Input:**  
a = [1, 1, 1]
b = [1, 1, 1, 1, 1]

**Output:**  
[1]

**Explanation:**  
1 is the only common element present in both arrays.

---

### Example 3
**Input:**  
a = [1, 2, 3]
b = [4, 5, 6]

**Output:**  
[]

**Explanation:**  
There are no common elements between the two arrays.

---

## Constraints
- `1 ≤ a.size(), b.size() ≤ 10^5`  
- `0 ≤ a[i], b[i] ≤ 10^5`

---

## Expected Complexities
- **Time Complexity:** O(n + m)  
- **Auxiliary Space:** O(n)