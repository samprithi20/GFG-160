# Count Inversions

---

## Problem Statement

Given an array of integers `arr[]`. You have to find the **Inversion Count** of the array.  

**Note:**  
Inversion count is the number of pairs of elements `(i, j)` such that:

- `i < j`
- `arr[i] > arr[j]`

---

## Examples

**Example 1:**  
**Input:**  
`arr[] = [2, 4, 1, 3, 5]`  
**Output:**  
`3`  
**Explanation:**  
The sequence `2, 4, 1, 3, 5` has three inversions: `(2, 1)`, `(4, 1)`, `(4, 3)`.

---

**Example 2:**  
**Input:**  
`arr[] = [2, 3, 4, 5, 6]`  
**Output:**  
`0`  
**Explanation:**  
As the sequence is already sorted, there is no inversion.

---

**Example 3:**  
**Input:**  
`arr[] = [10, 10, 10]`  
**Output:**  
`0`  
**Explanation:**  
As all the elements of array are the same, there is no inversion.

---

## Constraints

- `1 ≤ arr.size() ≤ 10^5`  
- `1 ≤ arr[i] ≤ 10^4`

---

## Expected Complexities

- **Time Complexity:** `O(n log n)`  
- **Auxiliary Space:** `O(n)`
