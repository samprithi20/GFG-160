# Maximum Product Subarray

**Difficulty:** Medium  
**Accuracy:** 18.09%  
**Submissions:** 467K+  
**Points:** 4  

---

## 📝 Problem Statement

Given an array `arr[]` that contains positive and negative integers (may contain 0 as well).  
Find the **maximum product** that we can get in a **subarray** of `arr[]`.

> **Note:**  
> It is guaranteed that the answer fits in a 32-bit integer.

---

## 🔍 Examples

**Input:**  
`arr[] = [-2, 6, -3, -10, 0, 2]`  
**Output:**  
`180`  
**Explanation:**  
The subarray with maximum product is `[6, -3, -10]`  
Product = 6 × (-3) × (-10) = **180**

---

**Input:**  
`arr[] = [-1, -3, -10, 0, 6]`  
**Output:**  
`30`  
**Explanation:**  
The subarray with maximum product is `[-3, -10]`  
Product = (-3) × (-10) = **30**

---

**Input:**  
`arr[] = [2, 3, 4]`  
**Output:**  
`24`  
**Explanation:**  
All elements are positive, so max product = 2 × 3 × 4 = **24**

---

## 🔒 Constraints

- 1 ≤ `arr.size()` ≤ 10⁶  
- -10 ≤ `arr[i]` ≤ 10  

---

## ✅ Expected Complexities

- **Time Complexity:** O(n)  
- **Auxiliary Space:** O(1)
