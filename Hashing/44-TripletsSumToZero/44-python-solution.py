def findTriplets(arr):
    map = {}
    ans = []
    
    for j in range(len(arr)):
        for k in range(j + 1, len(arr)):
            val = -1 * (arr[j] + arr[k])
            if val in map:
                for i in map[val]:
                    ans.append([i, j, k])
        
        if arr[j] not in map:
            map[arr[j]] = []
        map[arr[j]].append(j)
    
    return ans