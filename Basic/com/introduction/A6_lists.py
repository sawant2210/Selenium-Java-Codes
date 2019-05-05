'''
Created on 20-Apr-2018

@author: kunal
'''
list1=[1,2,5,6,"Kunal",3,"Pune"]
print(list1)
list1.append(9)
list1.append(2)
list1.append(2)
print(list1)

print(list1.count(2))
print(list1.index(3))
print(list1.index("Kunal"))

list1.remove(6)
print(list1)
list1.remove(2)
print(list1.count(2))
list1.reverse()
print(list1)


