def matSearch(mat, x):
    n = len(mat)
    m = len(mat[0])
    i = 0
    j = m - 1

    while i < n and j >= 0:
        if x > mat[i][j]:
            i += 1
      
        elif x < mat[i][j]:
            j -= 1
      
        else:
            return True

    return False

