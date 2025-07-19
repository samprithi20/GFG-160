# Stock Buy and Sell – Max One Transaction Allowed

---

## 📝 Problem Statement

Given an array `prices[]` of length `n`, representing the prices of the stocks on different days.  
The task is to find the **maximum profit** possible by buying and selling the stocks on different days when **at most one transaction is allowed**.

> **Note:**  
> - One transaction means **1 buy + 1 sell**.  
> - Stock must be **bought before being sold**.  
> - If it is not possible to make a profit, then return `0`.

---

## 🔍 Examples

**Input:**  
`prices[] = [7, 10, 1, 3, 6, 9, 2]`  
**Output:**  
`8`  
**Explanation:**  
Buy on day 2 at price = 1 and sell on day 5 at price = 9.  
**Profit = 9 - 1 = 8**

---

**Input:**  
`prices[] = [7, 6, 4, 3, 1]`  
**Output:**  
`0`  
**Explanation:**  
Prices are in decreasing order. No profitable transaction is possible.  
Hence, answer is `0`.

---

**Input:**  
`prices[] = [1, 3, 6, 9, 11]`  
**Output:**  
`10`  
**Explanation:**  
Buy on day 0 and sell on day 4.  
**Profit = 11 - 1 = 10**

---

## 🔒 Constraints

- 1 ≤ `prices.size()` ≤ 10⁵  
- 0 ≤ `prices[i]` ≤ 10⁴  

---

## ✅ Expected Complexities

- **Time Complexity:** O(n)  
- **Auxiliary Space:** O(1)
