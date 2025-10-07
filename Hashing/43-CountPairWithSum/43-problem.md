# Count Pairs with Given Sum

---

## Problem Statement

You are given an array `arr[]` and an integer `target`.  
You have to **count all pairs** in the array such that their **sum is equal to the given target**.

---

## Examples

### Example 1
**Input:**  
`arr = [1, 5, 7, -1, 5]`
`target = 6`

**Output:**  
`3`

**Explanation:**  
Pairs with sum `6` are `(1, 5)`, `(7, -1)`, and `(1, 5)`.

---

### Example 2
**Input:**  
`arr = [1, 1, 1, 1]`
`target = 2`

**Output:**  
`6`

**Explanation:**  
Pairs with sum `2` are `(1, 1)`, `(1, 1)`, `(1, 1)`, `(1, 1)`, `(1, 1)`, `(1, 1)`.

---

### Example 3
**Input:**  
`arr = [10, 12, 10, 15, -1]`
`target = 125`

**Output:**  
`0`

**Explanation:**  
There is no pair with sum equal to the target.

---

## Constraints
- `1 ≤ arr.size() ≤ 10^5`  
- `-10^4 ≤ arr[i] ≤ 10^4`  
- `0 ≤ target ≤ 10^4`

---

## Expected Complexities
- **Time Complexity:** O(n)  
- **Auxiliary Space:** O(n)