# Peak Element

---

## Problem Statement
You are given an array `arr[]` where **no two adjacent elements are the same**.  
Find the **index of a peak element**.  

An element is considered to be a **peak** if it is greater than its adjacent elements (if they exist).  

- If there are multiple peak elements, return the index of **any one** of them.  
- The output will be `"true"` if the index returned by your function is correct; otherwise, it will be `"false"`.  

**Note:**  
Consider the element before the first element and the element after the last element to be **negative infinity**.

---

## Examples

### Example 1
**Input:**  
`arr = [1, 2, 4, 5, 7, 8, 3]`  

**Output:**  
`true`  

**Explanation:**  
`arr[5] = 8` is a peak element because `arr[4] < arr[5] > arr[6]`.

---

### Example 2
**Input:**  
`arr = [10, 20, 15, 2, 23, 90, 80]`  

**Output:**  
`true`  

**Explanation:**  
- Element `20` at index `1` is a peak since `10 < 20 > 15`.  
- Index `5` (value `90`) is also a peak.  
- Returning any one peak index is valid.  

---

## Constraints
- `1 ≤ arr.size() ≤ 10^6`  
- `-2^31 ≤ arr[i] ≤ 2^31 - 1`  

---

## Expected Complexities
- **Time Complexity:** `O(log n)`  
- **Auxiliary Space:** `O(1)`  
