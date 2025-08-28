from bisect import bisect_left, bisect_right

def countFreq(arr, target):
    l = bisect_left(arr, target)
    r = bisect_right(arr, target)
    return r - l

