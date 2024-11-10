def solution(num_list):
    
    a = len(num_list)
    if num_list[a-1] > num_list[a-2]:
        num_list.append(num_list[a-1] - num_list[a-2])
    else:
        num_list.append(num_list[a-1]*2)

    return num_list