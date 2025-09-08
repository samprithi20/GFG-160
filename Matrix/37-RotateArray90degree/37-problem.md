# Rotate by 90 Degree

Given a square matrix `mat[][]` of size `n x n`. The task is to rotate it by 90 degrees in an **anti-clockwise direction** without using any extra space.  

---

## Examples

**Input:**  
`mat[][] = [[0, 1, 2], [3, 4, 5], [6, 7, 8]]`
**Output:**  
`[[2, 5, 8], [1, 4, 7], [0, 3, 6]]`

---

**Input:**  
`mat[][] = [[1, 2], [3, 4]]`
**Output:**  
`[[2, 4], [1, 3]]`

---

## Constraints
- `1 ≤ n ≤ 10^2`  
- `0 ≤ mat[i][j] ≤ 10^3`  

---

## Expected Complexities
- **Time Complexity:** `O(n^2)`  
- **Auxiliary Space:** `O(1)`  
