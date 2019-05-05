'''
Created on 29-Apr-2018

@author: kunal
'''
from selenium import webdriver


driverpath="D:\selenium\Jars\chrome driver New\chromedriver.exe"
driver=webdriver.Chrome(driverpath)

driver.implicitly_wait(30)
driver.get("https://www.facebook.com/")


# driver.find

driver.find_element_by_link_text("Forgotten account?").click() # link text
 
driver.back()
 
driver.find_element_by_partial_link_text("Forgotten").click() # Partial link text
 
driver.back()
 
driver.find_element_by_xpath("//input[@name='firstname']").send_keys("kunal") # x-path

driver.find_element_by_css_selector("input[name='lastname']").send_keys("Sawant") #CSS selector

driver.find_element_by_css_selector("input[name='lastname']").clear() #clearing data

# driver.find_element_by_xpath("//div[@class='_ihd _3ma mbs _6n _6s _6v']").text() #get text

print(driver.find_element_by_xpath("//div[contains(text(),'always will be')]").is_displayed()) #is displayed 

driver.find_element_by_id("email").send_keys("kunalssawant@gmail.com") #id
 
driver.find_element_by_name("pass").send_keys("9867042302") #name

driver.find_element_by_id("loginbutton").click()
 
print("Cicking successful !!!!")
 
driver.quit() 
