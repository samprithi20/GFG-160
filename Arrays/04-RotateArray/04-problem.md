# 🔄 Rotate Array

---

## 📝 Problem Statement

Given an array `arr[]`, rotate the array to the left (**counter-clockwise direction**) by `d` steps, where `d` is a positive integer.  
Perform the rotation **in-place**.

> **Note:** Consider the array as circular.

---

## 📥 Input

- `arr[]`: An array of integers.
- `d`: Number of steps to rotate.

---

## 📤 Output

- The rotated array after performing the operation.

---

## 💡 Examples

### Example 1
**Input:**  
`arr = [1, 2, 3, 4, 5]`, `d = 2`  
**Output:**  
`[3, 4, 5, 1, 2]`  
**Explanation:** Rotating by 2 elements gives: `3 4 5 1 2`.

---

### Example 2
**Input:**  
`arr = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]`, `d = 3`  
**Output:**  
`[8, 10, 12, 14, 16, 18, 20, 2, 4, 6]`  
**Explanation:** Rotating by 3 elements gives: `8 10 12 14 16 18 20 2 4 6`.

---

### Example 3
**Input:**  
`arr = [7, 3, 9, 1]`, `d = 9`  
**Output:**  
`[3, 9, 1, 7]`  
**Explanation:** Rotating 9 times is same as rotating `9 % 4 = 1` time.

---

## 🔒 Constraints

- `1 <= arr.length, d <= 10^5`  
- `0 <= arr[i] <= 10^5`

---

## ✅ Expected Time & Space Complexity

- **Time Complexity:** O(n)  
- **Auxiliary Space:** O(1)
