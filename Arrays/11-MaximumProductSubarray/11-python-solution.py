def maxProduct(arr):
    n = len(arr)
    currMax = arr[0]
    currMin = arr[0]
    maxProd = arr[0]

    for i in range(1, n):
        temp = max(arr[i], arr[i] * currMax, arr[i] * currMin)
        currMin = min(arr[i], arr[i] * currMax, arr[i] * currMin)
        currMax = temp

        maxProd = max(maxProd, currMax)

    return maxProd
