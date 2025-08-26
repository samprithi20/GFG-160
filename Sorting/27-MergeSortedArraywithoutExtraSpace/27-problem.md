# Merge Without Extra Space

---

## Problem Statement
Given two sorted arrays `a[]` and `b[]` of size `n` and `m` respectively, the task is to merge them in sorted order **without using any extra space**.  

- Modify `a[]` so that it contains the first `n` elements.  
- Modify `b[]` so that it contains the last `m` elements.  

---

## Examples

### Example 1
**Input:**  
`a[] = [2, 4, 7, 10]`, `b[] = [2, 3]`  

**Output:**  
`a[] = [2, 2, 3, 4]`, `b[] = [7, 10]`  

**Explanation:**  
After merging, we get `[2, 2, 3, 4, 7, 10]`.

---

### Example 2
**Input:**  
`a[] = [1, 5, 9, 10, 15, 20]`, `b[] = [2, 3, 8, 13]`  

**Output:**  
`a[] = [1, 2, 3, 5, 8, 9]`, `b[] = [10, 13, 15, 20]`  

**Explanation:**  
After merging, we get `[1, 2, 3, 5, 8, 9, 10, 13, 15, 20]`.

---

### Example 3
**Input:**  
`a[] = [0, 1]`, `b[] = [2, 3]`  

**Output:**  
`a[] = [0, 1]`, `b[] = [2, 3]`  

**Explanation:**  
After merging, we get `[0, 1, 2, 3]`.

---

## Constraints
- `1 ≤ n, m ≤ 10^5`  
- `0 ≤ a[i], b[i] ≤ 10^7`

---

## Expected Complexities
- **Time Complexity:** `O(n log n + m log m)`  
- **Auxiliary Space:** `O(1)`  
