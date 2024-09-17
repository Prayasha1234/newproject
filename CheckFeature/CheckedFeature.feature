Feature: Login
Scenario: Successful login with valid credential

 Given User Launch Chrome browser
 When maximize the Chrome browser
 When user opens URL "https://www.muvi.com/"
 And Click on Login
 And User enter email as "trinathsenapati1988@gmail.com" and password as "Trinath@123"
 And User Click on Loginbutton
 And User Click on ContentManagement
 And User Click on ContentLibrary
 And Click on AddContent button
 And EnterContentName as "cartoon"
 And EnterPermalink as "www.trinathcartoonmakers.com"
 And Scrolldown the page
 And Select cate
 And Click on Checkall
 And Click on Save and Close
 Then validate successfull message
 
 
