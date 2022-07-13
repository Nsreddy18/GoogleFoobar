class Queue:  

    def __init__(self):  
      self.queue = list()  
  
    def put(self,val):  
        self.queue.insert(0,val)  
    
    def get(self):  
      if len(self.queue)>0:  
          return self.queue.pop()  
    
    def size(self):
        return len(self.queue)

class pair:
    def __init__(self,a,b):
        self.a=a
        self.b=b

q=Queue()
def a(s):
    n=int(s)
    q.put(pair(n,0))
    l=[]
    while q.size()>0:
        t=q.get()
        if t.a in l:
            continue
        l.append(t.a)
        if t.a==1:
            return t.b
        if t.a%2==0:
            q.put(pair(t.a//2,t.b+1))
        else:
            q.put(pair(t.a-1,t.b+1))
            q.put(pair(t.a+1,t.b+1))

d={}
def solution(s):
    n=int(s)
    if s in d:
        return d[s]
    if n==1:
        return 0
    if n%2==0:
        d[s]=1+solution(str(n//2))
    else:
        d[s]=1+min(solution(str(n-1)),solution(str(n+1)))
    return d[s]

s=input()
print(a(s))
