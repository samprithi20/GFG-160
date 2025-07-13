# Move All Zeroes to End

## 📝 Problem Statement

Given an array `arr[]` of non-negative integers, move **all the zeroes** to the **right end** of the array **in-place** while maintaining the **relative order** of the non-zero elements.

You must not use extra space for another array.

---

## 📥 Examples

### Example 1  
**Input:**  
`arr[] = [1, 2, 0, 4, 3, 0, 5, 0]`  
**Output:**  
`[1, 2, 4, 3, 5, 0, 0, 0]`  
**Explanation:**  
There are three `0`s that are moved to the end of the array.

---

### Example 2  
**Input:**  
`arr[] = [10, 20, 30]`  
**Output:**  
`[10, 20, 30]`  
**Explanation:**  
There are no zeroes, so no change in the array.

---

### Example 3  
**Input:**  
`arr[] = [0, 0]`  
**Output:**  
`[0, 0]`  
**Explanation:**  
All elements are zeroes, so the array remains the same.

---

## ✅ Constraints

- `1 ≤ N ≤ 10^5`
- `0 ≤ arr[i] ≤ 10^5`

---

## ⏱️ Expected Complexities

- **Time Complexity:** `O(n)`  
- **Auxiliary Space:** `O(1)`
