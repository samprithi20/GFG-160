# Overlapping Intervals

---

## Problem Statement

Given an array of intervals `arr[][]`, where `arr[i] = [start_i, end_i]`. The task is to merge all of the overlapping intervals.

---

## Examples

**Example 1:**

**Input:**  
`arr = [[1, 3], [2, 4], [6, 8], [9, 10]]`
**Output:**  
`[[1, 4], [6, 8], [9, 10]]`
**Explanation:**  
In the given intervals we have only two overlapping intervals here, `[1, 3]` and `[2, 4]` which on merging will become `[1, 4]`. Therefore, we will return `[[1, 4], [6, 8], [9, 10]]`.

---

**Example 2:**

**Input:**  
`arr = [[6, 8], [1, 9], [2, 4], [4, 7]]`
**Output:**  
`[[1, 9]]`
**Explanation:**  
In the given intervals, all the intervals overlap with the interval `[1, 9]`. Therefore, we will return `[[1, 9]]`.

---

## Constraints

- `1 ≤ arr.size() ≤ 10^5`  
- `0 ≤ start_i ≤ end_i ≤ 10^6`

---

## Expected Complexities

- **Time Complexity:** `O(n log n)`  
- **Auxiliary Space:** `O(1)`
