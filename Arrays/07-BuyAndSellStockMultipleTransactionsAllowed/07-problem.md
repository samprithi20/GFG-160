# Stock Buy and Sell – Multiple Transactions Allowed

---

## 📝 Problem Statement

The cost of stock on each day is given in an array `price[]`.  
Each day you may decide to either **buy** or **sell** the stock at `price[i]`.  
You can even buy and sell the stock on the same day.  

Find the **maximum profit** that you can get.

> **Note:**  
> - A stock can only be sold if it has been bought previously.  
> - **Multiple stocks cannot be held** on any given day.

---

## 🔍 Examples

**Input:**  
`prices[] = [100, 180, 260, 310, 40, 535, 695]`  
**Output:**  
`865`  
**Explanation:**  
- Buy on day 0, sell on day 3 → 310 – 100 = 210  
- Buy on day 4, sell on day 6 → 695 – 40 = 655  
- **Maximum Profit = 210 + 655 = 865**

---

**Input:**  
`prices[] = [4, 2, 2, 2, 4]`  
**Output:**  
`2`  
**Explanation:**  
- Buy on day 3, sell on day 4 → 4 – 2 = 2  
- **Maximum Profit = 2**

---

## 🔒 Constraints

- 1 ≤ `prices.size()` ≤ 10⁵  
- 0 ≤ `prices[i]` ≤ 10⁴  

---

## ✅ Expected Complexities

- **Time Complexity:** O(n)  
- **Auxiliary Space:** O(1)
