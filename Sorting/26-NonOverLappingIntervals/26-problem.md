# Non-overlapping Intervals

---

## Problem Statement

Given a 2D array `intervals[][]`, where `intervals[i] = [starti, endi]`.  
Return the **minimum number of intervals you need to remove** to make the rest of the intervals non-overlapping.

**Note:**  
Two intervals are considered non-overlapping if the end time of one interval is **less than or equal to** the start time of the next interval.

---

## Examples

**Example 1:**  
**Input:**  
`intervals[][] = [[1, 2], [2, 3], [3, 4], [1, 3]]`  
**Output:**  
`1`  
**Explanation:**  
`[1, 3]` can be removed and the rest of the intervals are non-overlapping.

---

**Example 2:**  
**Input:**  
`intervals[][] = [[1, 3], [1, 3], [1, 3]]`  
**Output:**  
`2`  
**Explanation:**  
You need to remove two `[1, 3]` to make the rest of the intervals non-overlapping.

---

**Example 3:**  
**Input:**  
`intervals[][] = [[1, 2], [5, 10], [18, 35], [40, 45]]`  
**Output:**  
`0`  
**Explanation:**  
All intervals are already non-overlapping.

---

## Constraints

- `1 ≤ intervals.size() ≤ 10^5`  
- `0 ≤ starti < endi ≤ 5 * 10^4`

---

## Expected Complexities

- **Time Complexity:** `O(n log n)`  
- **Auxiliary Space:** `O(1)`
