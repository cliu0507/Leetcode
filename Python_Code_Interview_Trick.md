1. 如何用int作为binary表示是否index被used:
```
int used
for i in range(0,n):
	if (used & 1 << i):
		continue //代表第i个index没有剩余的，已经被使用了
	else:
		dfs(used,path,result)
```
followup: 如何改变used的第i个bit的表示:
```
used = used - (1<<i) 
这相当于将used的bit表示的第i位置为0
```

2. 2^n 和 n! 计算机可以做到多少n?
```
ans: 2^n 可以做到n = 20; n!一般也就做到n=10就可能溢出了
```