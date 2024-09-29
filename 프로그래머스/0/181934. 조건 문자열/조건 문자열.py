def solution(ineq, eq, n, m):
    if ineq == ">":
        if eq == "=":
            if n >= m:
                return 1
            else:
                return 0
        else:
            if n > m:
                return 1
            else:
                return 0
    elif ineq == "<":
        if eq == "=":
            if n <= m :
                return 1
            else:
                return 0
        else:
            if n < m:
                return 1
            else:
                return 0