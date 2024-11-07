def solution(num_list):
    even = ""
    odd = ""
    for i in range(len(num_list)):
        if num_list[i] % 2 != 0:
            even += str(num_list[i])
            
        elif num_list[i] % 2 == 0:
            odd += str(num_list[i])
            
    return int(even)+int(odd)