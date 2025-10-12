def intersect(a, b):
    sa = set(a)
    res = []
    for elem in b:
        if elem in sa:
            res.append(elem)
            sa.remove(elem)

    return res