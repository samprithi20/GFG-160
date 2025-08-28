# Number of Occurrence

---

## Problem Statement
Given a sorted array `arr[]` and a number `target`, you need to find the **number of occurrences** of `target` in `arr[]`.

---

## Examples

### Example 1
**Input:**  
`arr[] = [1, 1, 2, 2, 2, 2, 3]`, `target = 2`  

**Output:**  
`4`  

**Explanation:**  
`target = 2` occurs **4 times** in the given array.

---

### Example 2
**Input:**  
`arr[] = [1, 1, 2, 2, 2, 2, 3]`, `target = 4`  

**Output:**  
`0`  

**Explanation:**  
`target = 4` is not present in the array.

---

### Example 3
**Input:**  
`arr[] = [8, 9, 10, 12, 12, 12]`, `target = 12`  

**Output:**  
`3`  

**Explanation:**  
`target = 12` occurs **3 times** in the array.

---

## Constraints
- `1 ≤ arr.size() ≤ 10^6`  
- `1 ≤ arr[i] ≤ 10^6`  
- `1 ≤ target ≤ 10^6`

---

## Expected Complexities
- **Time Complexity:** `O(log n)`  
- **Auxiliary Space:** `O(1)`  
