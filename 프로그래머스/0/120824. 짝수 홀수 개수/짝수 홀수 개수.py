def solution(num_list):
    r = []
    countX,countY = 0,0
    
    for i in num_list:
        if i % 2 != 0:
            countX += 1
        else:
            countY += 1
    r.append(countY)    
    r.append(countX)
    return r

    