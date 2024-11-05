def solution(num_list):
    m1 = 1
    m2 = 0
    for i in range(len(num_list)):
        m1 *= num_list[i]
        
    for j in range(len(num_list)):
        m2 += num_list[j]
        
    m2 = m2*m2
    
    if m1 < m2: 
        return 1
    elif m1 > m2: 
        return 0
  