# Allocate Minimum Pages

---

## Problem Statement
Given an array `arr[]` of integers, where each element `arr[i]` represents the number of pages in the *i-th book*.  
You also have an integer `k` representing the number of students.  

The task is to allocate books to each student such that:
1. Each student receives **at least one book**.  
2. Each student is assigned a **contiguous sequence** of books.  
3. No book is assigned to more than one student.  

The objective is to **minimize the maximum number of pages assigned to any student**.  
In other words, out of all possible allocations, find the arrangement where the student who receives the most pages still has the **smallest possible maximum**.

**Note:**  
If it is not possible to allocate books to all students, return `-1`.

---

## Examples

### Example 1
**Input:**  
`arr[] = [12, 34, 67, 90]`, `k = 2`  

**Output:**  
`113`  

**Explanation:**  
Possible allocations:  
- `[12]` and `[34, 67, 90]` → Maximum Pages = `191`  
- `[12, 34]` and `[67, 90]` → Maximum Pages = `157`  
- `[12, 34, 67]` and `[90]` → Maximum Pages = `113`  

The third allocation has the **minimum possible maximum**, which is `113`.

---

### Example 2
**Input:**  
`arr[] = [15, 17, 20]`, `k = 5`  

**Output:**  
`-1`  

**Explanation:**  
Since there are more students than books, it is impossible to allocate at least one book to each student.

---

## Constraints
- `1 ≤ arr.size() ≤ 10^6`  
- `1 ≤ arr[i], k ≤ 10^3`  

---

## Expected Complexities
- **Time Complexity:** `O(n × log(sum(arr)))`  
- **Auxiliary Space:** `O(1)`  
