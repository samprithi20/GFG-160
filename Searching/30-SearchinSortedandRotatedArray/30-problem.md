# Search in Rotated Sorted Array

---

## Problem Statement
Given a **sorted and rotated array** `arr[]` of distinct elements, the task is to find the **index of a target key**.  
If the key is not present in the array, return `-1`.

---

## Examples

### Example 1
**Input:**  
`arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3]`, `key = 3`  

**Output:**  
`8`  

**Explanation:**  
`3` is found at index `8`.

---

### Example 2
**Input:**  
`arr[] = [3, 5, 1, 2]`, `key = 6`  

**Output:**  
`-1`  

**Explanation:**  
There is no element with value `6`.

---

### Example 3
**Input:**  
`arr[] = [33, 42, 72, 99]`, `key = 42`  

**Output:**  
`1`  

**Explanation:**  
`42` is found at index `1`.

---

## Constraints
- `1 ≤ arr.size() ≤ 10^6`  
- `0 ≤ arr[i] ≤ 10^6`  
- `0 ≤ key ≤ 10^6`  

---

## Expected Complexities
- **Time Complexity:** `O(log n)`  
- **Auxiliary Space:** `O(1)`  
