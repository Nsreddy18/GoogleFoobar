def multiplier(m,f):
    diff=m-f
    return (diff//f)+1
def solution(x,y):
    m=int(x)
    f=int(y)
    count=0
    while True:
        if m<=0 or f<=0:
            break
        if m>100 or f>100:
            if m>f:
                mul=multiplier(m,f)
                m-=mul*f
                count+=mul
            elif f>m:
                mul=multiplier(f,m)
                f-=mul*m
                count+=mul
            else:
                break
        else:
            if m>f:
                m-=f
                count+=1
            elif f>m:
                f-=m
                count+=1
            else:
                break
    if m==1 and f==1:
        return str(count)
    return "impossible"

m=input()
f=input()
print(solution(m,f))
