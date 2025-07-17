# Majority Element II

## 📝 Problem Statement

You are given an array of integers `arr[]` where each number represents a vote to a candidate.  
Return the candidates that have votes greater than one-third of the total votes.  
If there's no such candidate, return an empty array.

🔸 **Note:** The answer should be returned in **increasing order**.

---

## 📌 Examples

### Example 1
**Input:**  
`arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]`  
**Output:**  
`[5, 6]`  
**Explanation:**  
5 and 6 occur more than `n/3` times.

---

### Example 2
**Input:**  
`arr[] = [1, 2, 3, 4, 5]`  
**Output:**  
`[]`  
**Explanation:**  
Total votes = 5. No candidate occurs more than `floor(5/3)` times.

---

## 🔒 Constraints

- `1 <= arr.size() <= 10^6`
- `1 <= arr[i] <= 10^5`

---

## 💡 Expected Complexities

- **Time Complexity:** O(n)  
- **Auxiliary Space:** O(1)
