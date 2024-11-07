def solution(rsp):
    
    r = ""
    
    for i in rsp:
        
        if i == "2":
            r += "0"
        elif i == "0":
            r += "5"
        elif i == "5":
            r += "2"
        
    return r