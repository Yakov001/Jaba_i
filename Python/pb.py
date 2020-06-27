from random import randint


class Func:
    def __init__(self,p,m):
        self.p = p
        self.m = m
        self.a = randint(1,p-1)
        self.b = randint(0,p-1)

    def getvalue(self,x):
        return ((self.a * x + self.b) % self.p) % self.m

class Map:
    def __init__(self):
        self.m = 2
        self.n = 0
        self.L = [ [] for i in range(self.m) ]
        self.p = 479001599
        self.func = Func(self.p, self.m)

    def set(self, O, v):
        hash = self.func.getvalue(O)
        for x in self.L[hash]:
            if x[0] == O:
                x[1] = v
                return
        self.L[hash].append([O,v])
        self.n += 1
        self.reshape()

    def dell(self, O):
        hash = self.func.getvalue(O)
        for i in range(len(self.L[hash])):
            if self.L[hash][i][0] == O:
                self.L[hash].pop(i)
                return

    def get(self, O):
        hash = self.func.getvalue(O)
        for x in self.L[hash]:
            if x[0] == O:
                print(x[1])
                return
        print("not found")

    def reshape(self):
        if self.n/self.m > 1:
            self.m *= 2
            L1 = self.L
            self.L = [ [] for i in range(self.m) ]
            self.n = 0
            self.func = Func(self.p, self.m)
            for J in L1:
                for x in J:
                    self.set(x[0], x[1])


    def check(self, x):
        if x[0] == "add":
            self.set(int(x[1]), x[2])
        elif x[0] == "find":
            self.get(int(x[1]))
        elif x[0] == "del":
            self.dell(int(x[1]))


N = int(input())
map = Map()
for i in range(N):
    x = input().split()
    map.check(x)
