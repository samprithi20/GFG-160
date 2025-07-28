# Implement Atoi

---

## Problem Statement

Given a string `s`, the objective is to convert it into **integer format** without using any built-in conversion functions.

This mimics the behavior of the standard `atoi()` function in C/C++.

---

## Rules for `atoi()` Conversion:

1. **Skip any leading whitespaces**.
2. **Check for a sign** (`'+'` or `'-'`). Default to **positive** if no sign is present.
3. **Read the integer**, ignoring leading zeros, until:
   - a **non-digit** character is encountered, or  
   - **end of the string** is reached.
4. If **no digits** are present after whitespace and optional sign, return `0`.
5. Clamp the result:
   - If integer > 2³¹ - 1, return `2,147,483,647`
   - If integer < -2³¹, return `-2,147,483,648`

---

## Examples

### Example 1:
**Input:**  
`s = "-123"`  
**Output:**  
`-123`  
**Explanation:**  
Valid integer conversion.

---

### Example 2:
**Input:**  
`s = "  -"`  
**Output:**  
`0`  
**Explanation:**  
No digits are present after the sign.

---

### Example 3:
**Input:**  
`s = " 1231231231311133"`  
**Output:**  
`2147483647`  
**Explanation:**  
The number exceeds 2³¹ – 1, so we return the max int value.

---

### Example 4:
**Input:**  
`s = "-999999999999"`  
**Output:**  
`-2147483648`  
**Explanation:**  
The number is less than -2³¹, so we return the min int value.

---

### Example 5:
**Input:**  
`s = "  -0012gfg4"`  
**Output:**  
`-12`  
**Explanation:**  
Digits after `-` are read until the first non-digit `'g'`.

---

## Constraints

- `1 ≤ |s| ≤ 15`

---

## Expected Time and Space Complexity

- **Time Complexity:** `O(n)`
- **Auxiliary Space:** `O(1)`
