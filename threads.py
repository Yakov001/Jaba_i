# python3
from math import inf
import timeit

start = timeit.default_timer()

class MinHeap:
    def __init__(self, n):
        self.data = [[0,0] for i in range(n)]
        self.maxlen = n
        self.len = -1
        self.changes = []

    def _parent(self, i):
        return (i-1) // 2

    def _left_child(self, i):
        return (i * 2) +1

    def _right_child(self, i):
        return (i * 2) + 2

    def _sift_up(self, i):
        while i > 1 and self.data[i][1] < self.data[self._parent(i)][1]:
            m = self._parent(i)
            self.data[i], self.data[m] = self.data[m], self.data[i]
            i = self._parent(i)

    def __equality(self, i, r):
        if r <= self.len and i <= self.len and self.data[r][1] == self.data[i][1]:
            return True
        else:
            return False

    def __finder(self, *args):
        z = min( self.data[j][0] for j in args )
        for j in args:
            if self.data[j][0] == z:
                return j

    def __find_min(self, l, r):
        if self.data[l][1] < self.data[r][1]:
            return l
        else:
            return r

    def __r_exist(self,r):
        if r<= self.len:
            return True
        else:
            return False

    def __bigger(self, i, l):
        if l <= self.len and i <= self.len and self.data[i][1] > self.data[l][1]:
            return True
        else:
            return False

    def _sift_down(self, i):
        dummy = 1
        while i <= self.len and dummy == 1:
            dummy = 0
            l = self._left_child(i)
            r = self._right_child(i)
            minnum = i
            if self.__equality(l, r):
                if self.__equality(i, l):
                    minnum = self.__finder(i, l, r)
                elif self.__bigger(i,l):
                    minnum = self.__finder(l, r)
                elif self.__bigger(l, i):
                    minnum = i
            else:
                if self.__r_exist(r):
                    comp = self.__find_min(l, r)
                    if self.__bigger(i, comp):
                        minnum = comp
                    elif self.__bigger(comp, i):
                        minnum = i
                    elif self.__equality(i, comp):
                        minnum = self.__finder(i, comp)
                else:
                    if self.__bigger(i, l):
                        minnum = l
                    elif self.__bigger(l, i):
                        minnum = i
                    elif self.__equality(i, l):
                        minnum = self.__finder(i, l)

            if minnum != i:
                self.data[i], self.data[minnum] = self.data[minnum], self.data[i]
                self.changes.append((i,minnum))
                dummy = 1
                i = minnum


    def insert(self, x):
        if self.len == self.maxlen:
            return 'Error'
        else:
            self.len += 1
            self.data[self.len] = x
            self._sift_up(self.len)

    def extract_min(self):
        l = self.data[0][1]
        self.data[0], self.data[self.len] = self.data[self.len], self.data[0]
        self.len -= 1
        self._sift_down(0)
        return l

    def remove(self, i):
        self.data[i] = -inf
        self._sift_up(i)
        self.extract_min(0)

    def change_priority(self, i, p):
        oldP = self.data[i]
        self.data[i] = p
        if oldP > p:
            self._sift_up(i)
        elif oldP < p:
            self._sift_down(i)


    def start(self, arr):
        for num in arr:
            self.insert(num)

class Threads(MinHeap):
    def __init__(self, k, n, arr):
        MinHeap.__init__(self, k)
        self.jobs = arr
        self.numjobs = n
        self.i = 0
        self.numthreads = k

    def begin(self):
        threads = map(lambda x: [x,0], range(self.numthreads))
        MinHeap.start(self,  threads)

    def _extract(self):
        print(self.data[0][0],self.data[0][1])
        self.data[0][1] += self.jobs[self.i]
        self.i +=1
        MinHeap._sift_down(self, 0)

    def extract_all(self):
        for i in range(self.numjobs):
            self._extract()


k, n = map(int, input().split())
jobs = list(map(int, input().split()))
model = Threads(k, n, jobs)
model.begin()
model.extract_all()
stop = timeit.default_timer()

print('Time: ', stop - start)
