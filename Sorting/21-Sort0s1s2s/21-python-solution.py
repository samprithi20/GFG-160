def sort012(arr):
    n = len(arr)
    lo = 0
    hi = n - 1
    mid = 0
    
    while mid <= hi:
        if arr[mid] == 0:
            
            arr[lo], arr[mid] = arr[mid], arr[lo]
            lo += 1
            mid += 1
        elif arr[mid] == 1:
            mid += 1
        else:
            arr[mid], arr[hi] = arr[hi], arr[mid]
            hi -= 1
