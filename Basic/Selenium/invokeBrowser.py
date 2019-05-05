'''
Created on 26-Apr-2018

@author: kunal
'''
print ("hi selenium")

#import webdriver package
from selenium import webdriver 

#invoke Chrome
driverpath="D:\selenium\Jars\chrome driver New\chromedriver1.exe"
driver=webdriver.Chrome(driverpath)

#invoke IE
# driverpath="IE driver path"
# driver=webdriver.Ie(driverpath)

# navigate to url
driver.get("http://google.com") 

print(driver.current_url) #current url

print(driver.title) # title of page

driver.get("http://gmail.com") 
print(driver.title)
driver.back()    #back forward navigation
print(driver.title)
driver.forward()
print(driver.title)
driver.refresh()
print(driver.title)
 
# #maximize window 
# driver.maximize_window()  
# driver.minimize_window() 
driver.close() 
driver.quit()

 

 