# Minimize the Heights II

---

## 📝 Problem Statement

Given an array `arr[]` representing the heights of `n` towers and a positive integer `k`, the task is to **modify the height of each tower** either by **increasing or decreasing it by exactly `k`** (only once per tower), such that the **difference between the tallest and the shortest tower is minimized**.

> **Note:**  
> - It is **compulsory** to either increase or decrease each tower's height by `k`.  
> - After modification, **no tower height should be negative**.

---

## 🔍 Examples

**Input:**  
`k = 2`  
`arr[] = [1, 5, 8, 10]`  
**Output:**  
`5`  
**Explanation:**  
Modify as [1+2, 5−2, 8−2, 10−2] → [3, 3, 6, 8]  
Difference = 8 - 3 = **5**

---

**Input:**  
`k = 3`  
`arr[] = [3, 9, 12, 16, 20]`  
**Output:**  
`11`  
**Explanation:**  
Modify as [3+3, 9+3, 12−3, 16−3, 20−3] → [6, 12, 9, 13, 17]  
Difference = 17 - 6 = **11**

---

## 🔒 Constraints

- 1 ≤ `k` ≤ 10⁷  
- 1 ≤ `n` ≤ 10⁵  
- 1 ≤ `arr[i]` ≤ 10⁷  
