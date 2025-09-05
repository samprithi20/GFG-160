# Kth Missing Positive Number in a Sorted Array

---

## Problem Statement
Given a sorted array of distinct positive integers `arr[]`, you need to find the **k-th positive number** that is missing from the array.

---

## Examples

### Example 1
**Input:**  
`arr[] = [2, 3, 4, 7, 11]`, `k = 5`  

**Output:**  
`9`  

**Explanation:**  
Missing numbers are `[1, 5, 6, 8, 9, 10…]`.  
The 5th missing number is `9`.

---

### Example 2
**Input:**  
`arr[] = [1, 2, 3]`, `k = 2`  

**Output:**  
`5`  

**Explanation:**  
Missing numbers are `[4, 5, 6…]`.  
The 2nd missing number is `5`.

---

### Example 3
**Input:**  
`arr[] = [3, 5, 9, 10, 11, 12]`, `k = 2`  

**Output:**  
`2`  

**Explanation:**  
Missing numbers are `[1, 2, 4, 6…]`.  
The 2nd missing number is `2`.

---

## Constraints
- `1 ≤ arr.size() ≤ 10^5`  
- `1 ≤ k ≤ 10^5`  
- `1 ≤ arr[i] ≤ 10^6`  

---

## Expected Complexities
- **Time Complexity:** `O(log n)`  
- **Auxiliary Space:** `O(1)`  
