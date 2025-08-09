# Sort 0s, 1s and 2s

---

## Problem Statement

Given an array `arr[]` containing only 0s, 1s, and 2s. Sort the array in ascending order.

**Note:** You need to solve this problem without utilizing the built-in sort function.

---

## Examples

**Example 1:**  
**Input:** `arr[] = [0, 1, 2, 0, 1, 2]`  
**Output:** `[0, 0, 1, 1, 2, 2]`  
**Explanation:** 0s, 1s, and 2s are segregated into ascending order.

**Example 2:**  
**Input:** `arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]`  
**Output:** `[0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]`  
**Explanation:** 0s, 1s, and 2s are segregated into ascending order.

---

## Constraints

- `1 ≤ arr.size() ≤ 10^6`  
- `0 ≤ arr[i] ≤ 2`

---

## Expected Complexities

- **Time Complexity:** O(n)  
- **Auxiliary Space:** O(1)
